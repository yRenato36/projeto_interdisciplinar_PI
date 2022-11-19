function abrirImagem() {
    const imagem = document.getElementById('janela-modal')

    imagem.classList.add('abrir')

    imagem.addEventListener('click', (e) => {
        if(e.target.id == "janela-modal" || e.target.id == "imagem-grande-empresa") {
            imagem.classList.remove('abrir')
        }
    })
}