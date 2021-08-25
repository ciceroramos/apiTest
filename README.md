# API para Cadastro de Cliente

API Rest desenvolvida para ajudar no armazenamento de informações sobre clientes.

Essa solução deve ser executada na nuvem e promover as seguintes funcionalidades através de uma API REST:

 Objetivos
  - Cadastro de Cliente.
  - Alteração dos dados do cliente.
  - Exclusão do Cliente cadastrado.
  - Listar todos os clientes.
  
### Stack utilizada

* Java 8
* Spring Boot Web; JPA; Data; DevTools;
* Maven
* JUnit
* Swagger 2
* MongoDB
* Lombok
* thymeleaf
* Materialize
* Validation
* MongoDBCompass

### Instalação

```sh
$ git clone https://github.com/TiagoPastor/pandemic-combat-api.git
$ cd pandemic-combat-api
$ mvn package
$ cd target
$ java -jar pandemic_combat_api.jar
```

### Spring Boot Version

```
Pode importar como projeto maven existente no Spring Tool Suite 4, onde foi a versão usada para desenvolver.
```

#### Swagger
Desenvolvimento:
```
http://localhost:8080/swagger-ui.html
```
### Arquivo de Collection Json - Usar no Postman

```
  - O arquivo de Collection Json está na pasta Docs. Pode copiar e importar no postman para testar os payloads da api
```
###Observação:

```
Os dados de acesso ao banco de dados 
DATABASE = stefanini
COLLECTION = cliente
HOST = localhost

```


