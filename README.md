# API para manipulação de dados da cautela BAFZ
[www.github.com/LimaNathan/cautela-api](http://www.github.com/LimaNathan/cautela-api)

[(85) 9 8523-3152](https://api.whatsapp.com/send?phone=5585985233152)


#### Implementado por
- [Nathan Lima](https://http://www.github.com/LimaNathan/)

## Spring Rest API
Api para realizar operações de CRUD

#### Estrutura do Projeto

| Nome       | Descrição                                                            |
|------------|----------------------------------------------------------------------|
| model      | classes de modelo da aplicação                                       |
| repository | recursos de acesso a dados em uma base relacional da aplicação       |
| service    | camada de regra de negócios da aplicação                             |
| controller | serviços http baseados na arquitetura REST                           |

#### Tecnologias

* Java
* JPA / Hibernate
* JPA Annotations
* Spring Boot Web
* Spring Boot Data JPA
* H2 Database (in memory)
* Spring Exception Handler


#### Funcionalidades
1. Inclusão de item
```
POST: http://localhost:8080/itens
```
```
{
  "name": "Caixa de som",
}
```
2. Listagem de itens
```
GET: http://localhost:8080/itens
```
Resposta:
 ```
 [
	{
		"id": 1,
		"name": "Caixa de Som Bluetooh"
	},
	{
		"id": 2,
		"name": "Notebook lenovo, polemico"
	}
]
 
 ```
3. Exclusão de itens
```
DELETE: http://localhost:8080/itens/1
```
4. Alteração de friend(ainda não feito, mas como sugestão) é necessário para essa alteração, um metodo na classe ItemController.java
```
PUT: http://localhost:8080/itens/1
```




