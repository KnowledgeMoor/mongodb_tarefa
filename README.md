# Spring Boot com MongoDB - API de Usuários

Um projeto de exemplo que demonstra a criação de uma API RESTful utilizando Spring Boot e MongoDB para gerenciamento de usuários.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.5**
- **Spring Data MongoDB**
- **MongoDB**
- **Lombok** - Para redução de código boilerplate
- **Maven** - Gerenciamento de dependências e build

## 🔌 Endpoints da API

| Método | URL                    | Descrição                           | Parâmetros/Corpo              |
|--------|------------------------|-------------------------------------|-------------------------------|
| GET    | `/api/v1/users`        | Lista todos os usuários             | -                             |
| GET    | `/api/v1/users/id/{id}`| Busca um usuário pelo ID           | `id`: ObjectId do usuário     |
| POST   | `/api/v1/users`        | Cria um novo usuário                | Objeto User como RequestParam |
| PUT    | `/api/v1/users`        | Atualiza um usuário existente       | Objeto UserDTO como RequestBody |
| DELETE | `/api/v1/users/id/{id}`| Remove um usuário                   | `id`: ObjectId do usuário     |

## ⚙️ Configuração e Execução

### Pré-requisitos

- Java 17 ou superior
- Maven 3.6 ou superior
- MongoDB  instalado e rodando na porta padrão (27017)

### Configuração do MongoDB

Por padrão, a aplicação tentará se conectar ao MongoDB em `mongodb://localhost:27017/users-api`. Certifique-se de que o MongoDB esteja em execução ou configure os parâmetros de conexão no arquivo `application.properties`:

```properties
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=users-api
```

### Passos para Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/KnowledgeMoor/Mongodb-API-de-Usuarios.git
   cd start-exemple
   ```

2. Compile o projeto:
   ```bash
   mvn clean install
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

4. A API estará disponível em:
   ```
   http://localhost:8080/api/v1/users
   ```
