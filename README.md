# Porjeto Java com Spring Boot, Jpa/Hibernate
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/BotRajj/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

Ainda em andamento. Esse é uma projeto web services, com Spring Boot e JPA/Hibernate construída em um dos cusros do professor Dr.Nelio Alves [DevSuperior](https://devsuperior.com "Site da DevSuperior").

O projeto consiste na implementação de alguns recursos Back End em um site vendas.

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

# Detalhes do código

Na criação de entidades e recursos, segui os seguintes passos:
  - Atributos básicos, Ex.: Id, Nome.
  - Associações (instanciando as coleções)
  - Construtores
  - Getters & Setters (Coleções: somente o get)
  - hashCode & equals
  - Serializable

No arquivo TestConfig na pasta Config, está o povoamento do banco de dados.

Para a camada de repositórios apenas extendi o org.springframework.data.jpa.repository.JpaRepository para cada serviço e a classe OrdemItem.

Quem irá ter acesso ao repositório e manter a lógica de negócio é a camada de serviço, que por sua vez é chamada na camada de recursos. Os recursos recebem a solicitação, enviam pra camada de serviço que processa ou envia para o repositório, que então o resultado é retornado para a camada de recursos e enviada de volta para a requisição.

# Tratamento de exceções

# Como executar o projeto

## Pré-requisitos
- Java 17
- Porsgresql
- Postman
- IDE

```bash
# clonar repositório
git clone git@github.com:BotRajj/workshop-springboot3-jpa.git
```

# Profiles

A aplicação conta com três profiles, que podem ser alterados no arquivo application.properties, campo:

```bash
spring.profiles.active= test/prod/dev
```

## Test

Utilizei o banco de dados H2, que não persiste os dados após a interrução da aplicação. A vizualição do banco de dados só é possível após a execução da aplicação e no caminho no navegador http://localhost:8080/h2-console. Os campos que aparecerão devem ser preenchidos de acordo com o arquivo application-test.properties.

```bash
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
```

## Dev

Com o banco de dados Postgresql, os dados persistem após a interrupção da aplicação. Antes da execução, crie um database no Postgresql com o nome "spring-jpa-course". Altere os campos username e password no arquivo application-dev.properties de acordo com os do seu Postgresql.

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/spring-jpa-course
spring.datasource.username=postgres
spring.datasource.password=12345678
```

## Prod

Já na implementação Heroku, uma hospedagem paga que os dados serão enviados para um deploy online e ficaram disponível até o final do plano, você precisa criar um app na plataforma e adicionar no dashbord o Postgres.

- Faça o login no Heroku
- Crie o app, na opção new -> create app
- Provisionando PostgreSQL
    - App dashboard -> Resources
    - Procure "postgres" -> Selecione "Heroku Postgres"


Após isso, basta seguir os passos na aba deploy do seu app. Ao final será disponibilizado um link para as requisições.
 
# End points:   

Esse projeto já está implementada online no Heroku, já sendo possível fazer as requisições com o caminho:
- https://coure-javasb3-e46136a3d1e0.herokuapp.com
Ou utilize o caminho da sua implementação, caso já tenha.

E para execução local, os profile test e dev temos o caminho padrão:
- http://localhost:8080

## /Users, /Product, /Order, /Category
Para consulta de todos, com o método GET.

## /Users/Id, /Product/Id, /Order/Id, Category/Id
Para consulta de um Id específico, com o método GET.

## /Users
Para inserção de usuários, com o método POST e no Body, subaba raw, formato JSON, enviamos os seguintes campos para inserção.  Nessa requisição o esperado é o 201 Created, indicando que foi criado com sucesso. 
```bash
{
"name": "Nome",
"email": "Email@email.com",
"phone": "1234-1234",
"password": "Senha"
}
```

## /Users/Id
Para deletação de usuários, com o método DELETE, no final do caminho da requisição é necessário informa o Id. Nessa requisição o esperado são os retornos:
- 204 No Content, indicando que foi possível a deleção do usuário.
- 500 para o usuário que tem pedidos, não sendo possível a deleção por conta da integridade referencial.
  
## /Users
Para atualização de usuários, com o método PUT e no Body, subaba raw, formato JSON, enviamos os seguintes campos para atualização. Nessa requisição o esperado é o 200 OK, onde foi possível a atualização do usuário.

```bash
{
"name": "Nome",
"email": "Email@email.com",
"phone": "1234-1234"
}
```

# Autor

Vitor Silva Machado

https://www.linkedin.com/in/vitor-silva-0a23302a1/ 
