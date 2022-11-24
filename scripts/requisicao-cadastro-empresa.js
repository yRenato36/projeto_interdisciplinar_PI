const formulario = document.querySelector("form");

const nome_contato = document.getElementById("nome-completo-contato");
const email_contato = document.getElementById("email-contato");
const telefone_contato = document.getElementById("telefone-contato");

const cep = document.getElementById("cep-empresa");
const estado = document.getElementById("estado-empresa");
const cidade = document.getElementById("cidade-empresa");
const bairro = document.getElementById("bairro-empresa");
const rua = document.getElementById("rua-empresa");
const numero = document.getElementById("numero-empresa");
const complemento = document.getElementById("complemento-empresa");

const razao_social = document.getElementById("razao-social");
const cnpj = document.getElementById("cnpj");
const imagem_perfil = document.getElementById("logo-empresa");
const imagem_empresa = document.getElementById("imagem-empresa");
const nome_fantasia = document.getElementById("nome-fantasia");
const sobre = document.getElementById("sobre-empresa");

const banco = document.getElementById("banco");
const agencia = document.getElementById("agencia");
const digito = document.getElementById("digito");
const tipo_conta = document.getElementById("tipo-conta");
const numero_conta = document.getElementById("numero-conta");


const dados = {
    nome_contato: nome_contato.value,
    email_contato: email_contato.value,
    telefone_contato: telefone_contato.value,

    cep: cep.value,
    estado: estado.value,
    cidade: cidade.value,
    bairro: bairro.value,
    rua: rua.value,
    numero: numero.value,
    complemento: complemento.value,

    razao_social: razao_social.value,
    cnpj: cnpj.value,
    imagem_perfil: imagem_perfil.value,
    imagem_empresa: imagem_empresa.value,
    nome_fantasia: nome_fantasia.value,
    sobre: sobre.value,

    banco: banco.value,
    agencia: agencia.value,
    digito: digito.value,
    tipo_conta: tipo_conta.value,
    numero_conta: numero_conta.value,
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
    nome_contato.value = "";
    email_contato.value = "";
    telefone_contato.value = "";

    cep.value = "";
    estado.value = "";
    cidade.value = "";
    bairro.value = "";
    rua.value = "";
    numero.value = "";
    complemento.value = "";

    razao_social.value = "";
    cnpj.value = "";
    imagem_perfil.value = "";
    imagem_empresa.value = "";
    nome_fantasia.value = "";
    sobre.value = "";

    banco.value = "";
    agencia.value = "";
    digito.value = "";
    tipo_conta.value = "";
    numero_conta.value = "";
};

formulario.addEventListener('submit', function(event) {
    event.preventDefault();
    
    cadastrar(dados);
    limpar();
    
    console.log(dados);
    
});