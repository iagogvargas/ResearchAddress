# ResearchAddress
 API Rest para busca de endereço consumindo o webservice [ViaCep](https://viacep.com.br). Fornece serviços de busca de endereço global por CEP. 

## Tecnologias

* [Maven](https://maven.apache.org/) 
* [Spring boot](https://spring.io/projects/spring-boot) 
* [JDK 8](https://www.oracle.com/index.html)
* [POSTMAN](https://www.getpostman.com/)

## Exemplo de uso da API

### Busca endereço por CEP

* http POST:  http://localhost:8080/Research
* Json body: 

```
{
    "cep": "38408110"
}
```
* Retorna:
 ```
{
    "cep": "38408-110",
    "logradouro": "Rua Francisco Antônio Fernandes",
    "complemento": "",
    "bairro": "Santa Mônica",
    "localidade": "Uberlândia",
    "uf": "MG"
}
```
* Retorna 400 Bad Request se algum CEP não existir ou se algum formato for violado.


## Autor

* **Iago Garcia** - *Trabalho Inicial* - [iagogvargas](https://github.com/iagogvargas)



