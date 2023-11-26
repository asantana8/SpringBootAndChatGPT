# SpringBootAndChatGPT

# Demo GTP Microservice

Este é um projeto de demonstração para um microserviço utilizando Spring Boot.

## Tecnologias

- Java 17
- Spring Boot 3.2.0
- Spring Cloud 2023.0.0-RC1
- Lombok
- SpringDoc OpenAPI UI 1.7.0

## Descrição

Este projeto demonstra a criação de um microserviço usando Spring Boot com recursos como Spring Actuator, Spring Web, e integração com o SpringDoc OpenAPI UI para documentação da API.

## Dependências Principais

- `spring-boot-starter-actuator`: Fornece recursos para monitoramento e gerenciamento do aplicativo.
- `spring-boot-starter-web`: Starter para criar aplicativos web com Spring MVC.
- `lombok`: Biblioteca para reduzir o código boilerplate no Java.
- `spring-boot-starter-test`: Starter para testes no Spring Boot.
- `springdoc-openapi-ui`: Biblioteca para documentação e visualização da API usando o OpenAPI.

## Build e Documentação

O projeto utiliza o plugin Asciidoctor Maven para geração de documentação. Durante a fase de `prepare-package`, ele processa os arquivos Asciidoc para gerar documentação em formato HTML.

## Configurações Adicionais

O plugin `spring-boot-maven-plugin` é configurado para excluir a dependência do Lombok durante o empacotamento do aplicativo.

## Repositórios

O projeto usa o repositório `spring-milestones` para buscar as dependências necessárias.


