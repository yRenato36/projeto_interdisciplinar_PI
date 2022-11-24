const formulario = document.querySelector("form");

const nome = document.getElementById("nome-completo-funcionario");
const nascimento = document.getElementById("data-nascimento");
const cpf = document.getElementById("cpf-funcionario");
const rg = document.getElementById("rg-funcionario");
const sexo = document.getElementById("sexo-funcionario");
const telefone = document.getElementById("telefone-funcionario");
const email = document.getElementById("email-funcionario");
const username = document.getElementById("username-funcionario");
const senha = document.getElementById("senha-funcionario");

const dados = {
    nome: nome.value,
    nascimento: nascimento.value,
    cpf: cpf.value,
    rg: rg.value,
    sexo: sexo.value,
    telefone: telefone.value,
    email: email.value,
    username: username.value,
    senha: senha.value,
}

function cadastrar(dados) {
    fetch("http://localhost:8080/Empresa", {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "post",
            body: JSON.stringify(dados)
        })
        .then(function(res) { console.log(res) })
        .catch(function(res) { console.log(res) })
};

function limpar() {
    nome.value = "";
    nascimento.value = "";
    cpf.value = "";
    rg.value = "";
    sexo.value = "";
    telefone.value = "";
    email.value = "";
    username.value = "";
    senha.value = "";
};

formulario.addEventListener('submit', function(event) {
    event.preventDefault();
    
    cadastrar(dados);
    limpar();
    
    console.log(dados);
    
});