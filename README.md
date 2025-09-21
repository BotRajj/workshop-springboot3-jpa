# Porjeto Java com Spring Boot, Jpa/Hibernate
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/BotRajj/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

Esse é uma projeto web services, com Spring Boot e JPA/Hibernate construída em um dos cusros do professor Dr.Nelio Alves [DevSuperior](https://devsuperior.com "Site da DevSuperior").

O projeto consiste na implementação alguns recursos Back End de um site vendas.

# Objetivos
- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções
  
## Modelo conceitual
![Modelo Conceitual](https://github.com/BotRajj/assets/blob/main/JSBJH/ModeloConceitual.jpeg)
![Instancia de dominio](https://github.com/BotRajj/assets/blob/main/JSBJH/InstanciaDeDominio.jpeg)
![Instancia de dominio](https://github.com/BotRajj/assets/blob/main/JSBJH/CamadasL%C3%B3gicas.jpeg)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Hekoku
- PostgreSQL
- Postman

# Profiles

O projeto conta com três profiles, que pode ser alterados no arquivo application.properties no campo spring.profiles.active= test/prod/dev:

- Test

Para testes, utilizando o banco de dados H2, que não persiste os dados após a interrução. No seu projeto, para visualizar o banco de dados, seguimos para o caminho no navegador http://localhost:8080/h2-console, os campos devem ser preenchidos de acordo com o arquivo application-test.properties.

```bash
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
```

- Dev



```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/spring-jpa-course
spring.datasource.username=postgres
spring.datasource.password=12345678
```

- Prod
  
# Como executar o projeto

## Back end
- Java 17
- Porsgresql
- Postman

```bash
# clonar repositório
git@github.com:BotRajj/workshop-springboot3-jpa.git
```

Executando o projeto em sua IDE seguimmos para os End Points no Postman
 
## End points:   

Utilize os seguintes caminhos de acordo com o profile:
- prod: https://coure-javasb3-e46136a3d1e0.herokuapp.com
- test/dev: http://localhost:8080

#### /Users
Para inserção de usuários, utilizamos o método Post e no Body, subaba raw, formato JSON, enviamos os seguintes campos para inserção. 
```bash
{
"name": "Nome",
"email": "Email@email.com",
"phone": "1234-1234",
"password": "Senha"
}
```

# Autor

Vitor Silva Machado

https://www.linkedin.com/in/vitor-silva-0a23302a1/ 
