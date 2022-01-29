# Workshop Spring Boot Mongodb
## É um projeto desenvolvido no curso Java completo do professor Nelio Alves.
Composto por uma API Restfull usando a linguagem Java e o framework Spring Boot, usando padrão de projetos, SOLID, DTO e banco de dados MongoDB. 
Contém a inserção, deleção, atualização e consulta de um ou vários itens sendo usuários, posts e comentários dos posts. 
OBS. É possível acompanhar a evolução do projeto a partir de cada commit realizado.

## Relação no Banco de dados

![Captura de tela 2022-01-22 193552](https://user-images.githubusercontent.com/87396979/150657650-e7d46f6f-97fe-44de-99b8-df497b431b33.png)

No banco de dados os posts(Post) tem users(User) aninhados, quando os posts são requisitados trarão com ele os dados resumidos do usuário(dados de um objeto AuthorDTO) no mesmo agregado, e os usuários(user) tem uma coleção de posts referênciados, quando ele for requisitado trará a referência de uma coleção dos posts feitos. Comentários foram implementados como DTO e estão aninhados com os posts, tendo então um post que contém dados do AuthorDTO.


## Aplicação Spring boot desenvolvida utilizando padrão de projetos, princípios SOLID, tratamento de exceções e projeção de dados com DTO.

![Captura de tela 2022-01-22 183458](https://user-images.githubusercontent.com/87396979/150656589-abe49cf0-c89e-40cf-8728-a39b603bef44.png)

## Banco de dados MongoDB Utilizando MongoDB Compass

![Captura de tela 2022-01-22 185824](https://user-images.githubusercontent.com/87396979/150656792-0933b015-c2bc-42c1-a54c-a4f29c4cb75d.png)

## Consumindo API com Postman
Buscando usuários

![Captura de tela 2022-01-22 185706](https://user-images.githubusercontent.com/87396979/150656799-1c9dd739-95ae-41df-9113-0cee2b9c9ab0.png)


Consulta com @Query, buscando um post pelo Título ou conteúdo e filtrando pela data mínima e máxima. Busca desenvolvida utilizando expressão regular.

![Captura de tela 2022-01-22 190239](https://user-images.githubusercontent.com/87396979/150656855-c7a3dc9a-9c59-4449-a181-57de754aede6.png)
