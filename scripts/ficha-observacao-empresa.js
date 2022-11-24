document.querySelector('#add-pergunta').addEventListener('click', duplicarPergunta);

function duplicarPergunta() {
    const seletorPergunta = document.querySelectorAll("#conjunto-perguntas > .item-pergunta");
    var validar = seletorPergunta.length < 5;

    if (validar) {
    const newPergunta = document.querySelector('.item-pergunta').cloneNode(true);
    const perguntas = newPergunta.querySelectorAll("input")
    perguntas.forEach(function(perguntas) { 
        perguntas.value = "";
    })
    document.querySelector('#conjunto-perguntas').appendChild(newPergunta);
    }
    else { 
        const labelMaximo = document.querySelector("#label-maximo");
        labelMaximo.classList.add("abrir");
    }
}  

