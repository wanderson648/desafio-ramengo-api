# RamenGo API

Essa é uma aplicação back-end para montar um pedido de ramen, escolhendo os tipos de caldos e proteínas

### RamenGo:
  -  Listar todos os caldos (GET)
  -  Listar todas as proteínas (GET)
  -  Realiza um pedido (POST)


# Tecnologias Utilizadas
  
  - Java 17
  - Spring Boot
  - Postgres
  - Docker
  - Postman
  - Swagger
## Instalação da aplicação

 Primeiramente, faça o clone do repositório:
  ```
  https://github.com/wanderson648/desafio-ramengo-api.git
  ```
Feito isso, acesse o projeto:
```
cd desafio-backend-rv
```
É preciso compilar o código e baixar as dependências do projeto:
```
mvn clean package
```
Finalizado esse passo, vamos iniciar a aplicação:
```
mvn spring-boot:run
```
Pronto. A aplicação está disponível em  http://localhost:8080

# Setup da aplicação com docker

## Pré-requisito

Antes de rodar a aplicação é preciso garantir que as seguintes dependências estejam corretamente instaladas:
```
Java 
Docker 
Maven 
```
Com o projeto clonado, acesse o diretório do projeto

```
cd desafio-backend-rv
```

Feito isso, abra o terminal na pasta do projeto e digite o comando para rodar a aplicação
```
docker run -p 8080:8080 spring-boot-ramenfo:1.1
```
A aplicação rodando, estará disponível em http://localhost:8080
