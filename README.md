# Justificativa
Esta aplicação foi desenvolvida para simular um cenário multi-tenant, informando o tenant onde está sendo executada no corpo da resposta.

Assim, podemos testar a assertividade do roteamento para o tenant correto. 

# Variáveis de ambiente
Esta aplicação simula um tenant com endpoints REST, e espera receber as seguintes variáveis de ambiente:
- SERVER_PORT (default: 8080)
- CONTAINER

# Output
Um JSON contendo o Método e a URL da requisição, e o Conteiner onde está sendo executada.
```json
{
  "container": "backend-service",
  "method": "GET",
  "url": "http://localhost:8901/"
}
```