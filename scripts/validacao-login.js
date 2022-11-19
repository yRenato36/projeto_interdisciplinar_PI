const nav = document.getElementById('validacao-login')

let logado = true

function verificacaoLogin() {
    if (logado == true) {
        nav.innerHTML = '<a href="/compromissos-usuario.html"><img src="/image/icon-person.png" alt="Icone"></a><a href="/compromissos-usuario.html"><strong>Nome do Usuário</strong></a>'
    }
    else {
        nav.innerHTML = '<a href="/cadastro-empresa.html"><strong>Cadastre sua Empresa</strong></a><a href="/cadastro-usuario.html"><strong>Criar Conta</strong></a><a href="/login-acesso.html"><strong>Entrar</strong></a>'
    }
}