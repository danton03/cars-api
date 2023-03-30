# Cars Api
### Enunciado do exercício:
Crie uma api Spring que seja capaz de receber os seguintes dados via POST:
```json
{
	"modelo": "Fiat Argo 1.3",
	"fabricante": "Fiat",
	"dataFabricacao": "10/02/2006",
	"valor": 10.000,
	"anoModelo": 2023,
}
```
Para construir a API você deve seguir os seguintes passos
- [x]  Criar um controller para a api
- [x]  Criar uma rota de api que possa ser consumida via POST
- [x]  Criar um DTO que represente os dados recebidos
- [x]  Imprimir no console do Spring alguns dos dados pegando do DTO recebidos via post.