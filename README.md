<h2>Sistema de gerenciamento de colaboradores em API REST com Spring Boot</h2>

Desenvolvido um pequeno sistema para o gerenciamento de colaboradores de uma empresa através de uma API REST, criada com o Spring Boot.

O sistema foi desenvolvido com os recursos:

* Setup inicial de projeto com o Spring Boot Initialzr.
* Java 11.
* Maven 3.6.3.
* Intellj IDEA Community Edition.
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Utilizado o Banco de Dados em memória H2  
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST.
* Implantação do sistema na nuvem através do Heroku
* Controle de versão GIT/GITHUB.
* Deploy do projeto na nuvem utilizando plataforma HEROKU.

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/colaborador
```

Algumas fontes utilizadas:

* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)
* [Curso de API-Rest - Plataforma Digital Innovation One ](https://web.digitalinnovation.one/home/)


