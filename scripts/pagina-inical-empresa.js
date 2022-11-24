const alterar = document.getElementById('alterar')

alterar.addEventListener('click', function () {
    const inputFantasia = document.getElementById('nome-fantasia')
    const inputLogo = document.getElementById('imagem-perfil-logo')
    const inputImagem = document.getElementById('imagem-empresa')
    const inputSobre = document.getElementById('sobre-empresa')
    const buttonSalvar = document.getElementById('salvar')
    const buttonCancelar = document.getElementById('cancelar')

    inputFantasia.disabled = false
    inputLogo.disabled = false
    inputImagem.disabled = false
    inputSobre.disabled = false
    buttonSalvar.disabled = false
    buttonCancelar.disabled = false

    console.log ('Teste')
}) 

