function abrirImagem() {
    const imagem = document.getElementById('janela-modal')

    imagem.classList.add('abrir')

    imagem.addEventListener('click', (e) => {
        if(e.target.id == "janela-modal" || e.target.id == "imagem-grande-empresa") {
            imagem.classList.remove('abrir')
        }
    })
}

function abrirModalMarcarCompromisso() {
    const modal = document.getElementById('janela-marcar-compromisso')
    modal.classList.add('abrir')

    modal.addEventListener('click', (e) => {
        if(e.target.id == 'cancelar-agenda'){
            modal.classList.remove('abrir')
        }
    })
}