Projeto Final - ItauTECH
VISÃO GERAL
Estamos em um contexto de gerenciamento de clientes e contas bancárias da instituição.
Precisamos disponibilizar uma API que forneça dados de clientes e contas (inicialmente para
consulta).
OBJETIVOS
1. Construir uma API Spring BOOT que possua 2 endpoints principais:
a. Recuperação de todas as contas bancárias
b. Recuperação dos detalhes de 1 conta bancária (inclusive dados do seu titular)
2.
ESPECIFICAÇÕES
Algumas tecnologias são obrigatórias para este projeto:
Banco de Dados: MySQL
API: SpringBoot
Modelagem de Dados:
Todo cliente possui os seguintes dados para serem cadastrados
● codigo interno
● nome
● cpf
● telefone
● email
Toda conta bancária possui os seguintes dados
● numero
● agência
● tipo da conta (0 - conta corrente, 1 - poupança, 2 - investimento)
● saldo
● titular da conta
ENTREGÁVEIS
Endpoint para consulta de todas as contas (deve retornar uma lista de objetos do tipo
que armazena Conta Bancária):
/contas
Endpoint para consultas do detalhe da conta
/contas/{id}
Todos os dados devem ser retornados em formato JSON



Integrantes

Ciro
Eduardo Galvão
Fábio Meireles da Silva
Jefferson Ribeiro
Rafael Niccioli
