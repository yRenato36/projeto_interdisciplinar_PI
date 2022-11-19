function abrirModal() {
    const modal = document.getElementById('janela-modal')
    modal.classList.add('abrir')

    modal.addEventListener('click', (e) => {
        if(e.target.id == 'cancelar-agenda'){
            modal.classList.remove('abrir')
        }
    })
}

const todos = document.getElementById('horarios-todos')
const seg = document.getElementById('horarios-seg')
const ter = document.getElementById('horarios-ter')
const qua = document.getElementById('horarios-qua')
const qui = document.getElementById('horarios-qui')
const sex = document.getElementById('horarios-sex')
const sab = document.getElementById('horarios-sab')

const buttonTodos = document.getElementById('button-todos')
const buttonSeg = document.getElementById('button-seg')
const buttonTer = document.getElementById('button-ter')
const buttonQua = document.getElementById('button-qua')
const buttonQui = document.getElementById('button-qui')
const buttonSex = document.getElementById('button-sex')
const buttonSab = document.getElementById('button-sab')

function horariosTodos() {
    seg.classList.remove('abrir')
    ter.classList.remove('abrir')
    qua.classList.remove('abrir')
    qui.classList.remove('abrir')
    sex.classList.remove('abrir')
    sab.classList.remove('abrir')

    buttonSeg.classList.remove('abrir')
    buttonTer.classList.remove('abrir')
    buttonQua.classList.remove('abrir')
    buttonQui.classList.remove('abrir')
    buttonSex.classList.remove('abrir')
    buttonSab.classList.remove('abrir')

    todos.classList.add('abrir')
    buttonTodos.classList.add('abrir')
}

function horariosSeg() {
    todos.classList.remove('abrir')
    ter.classList.remove('abrir')
    qua.classList.remove('abrir')
    qui.classList.remove('abrir')
    sex.classList.remove('abrir')
    sab.classList.remove('abrir')

    buttonTodos.classList.remove('abrir')
    buttonTer.classList.remove('abrir')
    buttonQua.classList.remove('abrir')
    buttonQui.classList.remove('abrir')
    buttonSex.classList.remove('abrir')
    buttonSab.classList.remove('abrir')

    seg.classList.add('abrir')
    buttonSeg.classList.add('abrir')
}

function horariosTer() {
    todos.classList.remove('abrir')
    seg.classList.remove('abrir')
    qua.classList.remove('abrir')
    qui.classList.remove('abrir')
    sex.classList.remove('abrir')
    sab.classList.remove('abrir')

    buttonTodos.classList.remove('abrir')
    buttonSeg.classList.remove('abrir')
    buttonQua.classList.remove('abrir')
    buttonQui.classList.remove('abrir')
    buttonSex.classList.remove('abrir')
    buttonSab.classList.remove('abrir')

    ter.classList.add('abrir')
    buttonTer.classList.add('abrir')
}

function horariosQua() {
    todos.classList.remove('abrir')
    seg.classList.remove('abrir')
    ter.classList.remove('abrir')
    qui.classList.remove('abrir')
    sex.classList.remove('abrir')
    sab.classList.remove('abrir')

    buttonTodos.classList.remove('abrir')
    buttonSeg.classList.remove('abrir')
    buttonTer.classList.remove('abrir')
    buttonQui.classList.remove('abrir')
    buttonSex.classList.remove('abrir')
    buttonSab.classList.remove('abrir')

    qua.classList.add('abrir')
    buttonQua.classList.add('abrir')
}

function horariosQui() {
    todos.classList.remove('abrir')
    seg.classList.remove('abrir')
    ter.classList.remove('abrir')
    qua.classList.remove('abrir')
    sex.classList.remove('abrir')
    sab.classList.remove('abrir')

    buttonTodos.classList.remove('abrir')
    buttonSeg.classList.remove('abrir')
    buttonTer.classList.remove('abrir')
    buttonQua.classList.remove('abrir')
    buttonSex.classList.remove('abrir')
    buttonSab.classList.remove('abrir')

    qui.classList.add('abrir')
    buttonQui.classList.add('abrir')
}

function horariosSex() {
    todos.classList.remove('abrir')
    seg.classList.remove('abrir')
    ter.classList.remove('abrir')
    qua.classList.remove('abrir')
    qui.classList.remove('abrir')
    sab.classList.remove('abrir')

    buttonTodos.classList.remove('abrir')
    buttonSeg.classList.remove('abrir')
    buttonTer.classList.remove('abrir')
    buttonQua.classList.remove('abrir')
    buttonQui.classList.remove('abrir')
    buttonSab.classList.remove('abrir')

    sex.classList.add('abrir')
    buttonSex.classList.add('abrir')
}

function horariosSab() {
    todos.classList.remove('abrir')
    seg.classList.remove('abrir')
    ter.classList.remove('abrir')
    qua.classList.remove('abrir')
    qui.classList.remove('abrir')
    sex.classList.remove('abrir')

    buttonTodos.classList.remove('abrir')
    buttonSeg.classList.remove('abrir')
    buttonTer.classList.remove('abrir')
    buttonQua.classList.remove('abrir')
    buttonQui.classList.remove('abrir')
    buttonSex.classList.remove('abrir')

    sab.classList.add('abrir')
    buttonSab.classList.add('abrir')
}

document.querySelector('#adiciona-horario-todos').addEventListener('click', cloneHorarioTodos)

document.querySelector('#adiciona-horario-seg').addEventListener('click', cloneHorarioSeg)

document.querySelector('#adiciona-horario-ter').addEventListener('click', cloneHorarioTer)

document.querySelector('#adiciona-horario-qua').addEventListener('click', cloneHorarioQua)

document.querySelector('#adiciona-horario-qui').addEventListener('click', cloneHorarioQui)

document.querySelector('#adiciona-horario-sex').addEventListener('click', cloneHorarioSex)

document.querySelector('#adiciona-horario-sab').addEventListener('click', cloneHorarioSab)


function cloneHorarioTodos() {
    document.querySelector('#horarios-todos').appendChild(document.querySelector('#inicio-fim-todos').cloneNode(true))
}

function cloneHorarioSeg() {
    document.querySelector('#horarios-seg').appendChild(document.querySelector('#inicio-fim-seg').cloneNode(true))
}

function cloneHorarioTer() {
    document.querySelector('#horarios-ter').appendChild(document.querySelector('#inicio-fim-ter').cloneNode(true))
}

function cloneHorarioQua() {
    document.querySelector('#horarios-qua').appendChild(document.querySelector('#inicio-fim-qua').cloneNode(true))
}

function cloneHorarioQui() {
    document.querySelector('#horarios-qui').appendChild(document.querySelector('#inicio-fim-qui').cloneNode(true))
}

function cloneHorarioSex() {
    document.querySelector('#horarios-sex').appendChild(document.querySelector('#inicio-fim-sex').cloneNode(true))
}

function cloneHorarioSab() {
    document.querySelector('#horarios-sab').appendChild(document.querySelector('#inicio-fim-sab').cloneNode(true))
}


document.querySelector('#subtrai-horario-todos').addEventListener('click', removeHorarioTodos)

document.querySelector('#subtrai-horario-seg').addEventListener('click', removeHorarioSeg)

document.querySelector('#subtrai-horario-ter').addEventListener('click', removeHorarioTer)

document.querySelector('#subtrai-horario-qua').addEventListener('click', removeHorarioQua)

document.querySelector('#subtrai-horario-qui').addEventListener('click', removeHorarioQui)

document.querySelector('#subtrai-horario-sex').addEventListener('click', removeHorarioSex)

document.querySelector('#subtrai-horario-sab').addEventListener('click', removeHorarioSab)



function removeHorarioTodos() {
    const inicioFimTodos = document.querySelector('#horarios-todos')
    const ultimoFilho = document.querySelector('#inicio-fim-todos:last-child')
    if(inicioFimTodos.childElementCount > 2) {
        inicioFimTodos.removeChild(ultimoFilho)
    }
}

function removeHorarioSeg() {
    const inicioFimSeg = document.querySelector('#horarios-seg')
    const ultimoFilho = document.querySelector('#inicio-fim-seg:last-child')
    if(inicioFimSeg.childElementCount > 2) {
        inicioFimSeg.removeChild(ultimoFilho)
    }
}

function removeHorarioTer() {
    const inicioFimTer = document.querySelector('#horarios-ter')
    const ultimoFilho = document.querySelector('#inicio-fim-ter:last-child')
    if(inicioFimTer.childElementCount > 2) {
        inicioFimTer.removeChild(ultimoFilho)
    }
}

function removeHorarioQua() {
    const inicioFimQua = document.querySelector('#horarios-qua')
    const ultimoFilho = document.querySelector('#inicio-fim-qua:last-child')
    if(inicioFimQua.childElementCount > 2) {
        inicioFimQua.removeChild(ultimoFilho)
    }
}

function removeHorarioQui() {
    const inicioFimQui = document.querySelector('#horarios-qui')
    const ultimoFilho = document.querySelector('#inicio-fim-qui:last-child')
    if(inicioFimQui.childElementCount > 2) {
        inicioFimQui.removeChild(ultimoFilho)
    }
}

function removeHorarioSex() {
    const inicioFimSex = document.querySelector('#horarios-sex')
    const ultimoFilho = document.querySelector('#inicio-fim-sex:last-child')
    if(inicioFimSex.childElementCount > 2) {
        inicioFimSex.removeChild(ultimoFilho)
    }
}

function removeHorarioSab() {
    const inicioFimSab = document.querySelector('#horarios-sab')
    const ultimoFilho = document.querySelector('#inicio-fim-sab:last-child')
    if(inicioFimSab.childElementCount > 2) {
        inicioFimSab.removeChild(ultimoFilho)
    }
}

