const formulario = document.querySelector("form");
const nome_completo_usuario = document.getElementById("nome-completo-usuario");
const data_nascimento = document.getElementById("data-nascimento");
const cpf_usuario = document.getElementById("cpf-usuario");
const telefone_usuario = document.getElementById("telefone-usuario");
const email_usuario = document.getElementById("email-usuario");
const username_usuario = document.getElementById("username-usuario");
const senha_usuario = document.getElementById("senha-usuario");
const confirmacao_senha_usuario = document.getElementById("confirmacao-senha-usuario");
const cep_usuario = document.getElementById("cep-usuario");
const estado_usuario = document.getElementById("estado-usuario");
const cidade_usuario = document.getElementById("cidade-usuario");
const bairro_usuario = document.getElementById("bairro-usuario");
const endereco_usuario = document.getElementById("endereco-usuario");
const numero_usuario = document.getElementById("numero-usuario");
const complemento_usuario = document.getElementById("complemento-usuario");

const dados = {
    nome_completo_usuario: nome_completo_usuario.value,
    data_nascimento: data_nascimento.value,
    cpf_usuario: cpf_usuario.value,
    telefone_usuario: telefone_usuario.value,
    email_usuario: email_usuario.value,
    username_usuario: username_usuario.value,
    senha_usuario: senha_usuario.value,
    confirmacao_senha_usuario: confirmacao_senha_usuario.value,
    cep_usuario: cep_usuario.value,
    estado_usuario: estado_usuario.value,
    cidade_usuario: cidade_usuario.value,
    bairro_usuario: bairro_usuario.value,
    endereco_usuario: endereco_usuario.value,
    numero_usuario: numero_usuario.value,
    complemento_usuario: complemento_usuario.value
}

function cadastrar(dados) {
    fetch("http://localhost:8080/Usuario", {
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
    nome_completo_usuario.value = "";
    data_nascimento.value = "";
    cpf_usuario.value = "";
    telefone_usuario.value = "";
    email_usuario.value = "";
    username_usuario.value = "";
    senha_usuario.value = "";
    confirmacao_senha_usuario.value = "";
    cep_usuario.value = "";
    estado_usuario.value = "";
    cidade_usuario.value = "";
    bairro_usuario.value = "";
    endereco_usuario.value = "";
    numero_usuario.value = "";
    complemento_usuario.value = "";
};

formulario.addEventListener('submit', function(event) {
    event.preventDefault();
    
    cadastrar(dados);
    limpar();
    
    console.log(dados);
    
});