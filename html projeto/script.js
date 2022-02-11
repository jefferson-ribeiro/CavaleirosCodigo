async function BuscarDoJava() {
  let url = 'http://localhost:8080/contas'
  try {
    let res = await fetch(url)
    let contas = await res.json()

    let html = ''
    for (var i = 0; i < contas.length; i++) {
      let conta = contas[i]
      html += `
                <tr>
                  <td>${conta.agencia}</td>
                  <td>${conta.numero}</td>
                  <td>${conta.tipo_conta}</td>
                  <td>${conta.saldo}</td>
                  <td>${conta.cliente.id}</td>
                  <td>${conta.cliente.nome}</td>
                  <td>${conta.cliente.cpf}</td>
                  <td>${conta.cliente.telefone}</td>
                  <td>${conta.cliente.email}</td>
                </tr>
              `
    }
    document.getElementById('linhas').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}
BuscarDoJava()