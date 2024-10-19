# Backend - ClientesApp

 Este é o backend da aplicação ClientesApp, uma API RESTful desenvolvida em Java utilizando o Spring Boot e o Maven para o gerenciamento de dependências. A aplicação segue o padrão MVC (Model-View-Controller), e o banco de dados utilizado é o H2 Database em modo local.

 Também foram utilizadas tecnologias como Spring Data JPA, Spring Web, Lombok e Maven, além de como já citado, o banco de dados em memória H2 Database para o desenvolvimento.

 ## Endpoints 

### Clientes
- `GET /api/clientes`
  - Retorna uma lista de todos os clientes cadastrados no sistema.
 
- `GET /api/clientes/{id}`
  - Retorna os detalhes de um cliente específico com base no id informado.
  - Retorna 404 Not Found se o cliente não for encontrado.
 
- `POST /api/clientes`
  - Cadastra um novo cliente.
  - O corpo deve conter um objeto Cliente com dados válidos (nome, CPF). Retorna 201 Created em caso de sucesso.

- `PUT /api/clientes/{id}`
  - Atualiza os dados de um cliente existente.
  - O corpo deve conter um objeto Cliente com novos dados. Retorna 204 No Content ao concluir a atualização.

- `DELETE /api/clientes/{id}`
  - Remove um cliente com base no id informado.
  - Retorna 204 No Content ao concluir a remoção. Retorna 404 Not Found se o cliente não for encontrado.

### Serviços Prestados
- `GET /api/servicos-prestados`
  - Pesquisa serviços prestados com base no nome do cliente ou mês específico.

- `POST /api/servicos-prestados`
  - Cadastra um novo serviço prestado para um cliente.
  - O corpo deve conter um objeto ServicoPrestadoDTO. Retorna 201 Created em caso de sucesso e 400 Bad Request se o cliente não existir.
