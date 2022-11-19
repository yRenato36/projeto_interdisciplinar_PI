var dateToday = new Date();
var year = dateToday.getFullYear();
var month = dateToday.getMonth()+1;
if (month<10){
    month='0'+month;
}
var day = dateToday.getDate();
if (day<10){
    day='0'+day;
}
var dataAtual = year+'-'+month+'-'+day;
var calendario = document.querySelector('#calendario')
calendario.value = dataAtual;

function posicionandoDias() {
    var date = new Date(calendario.value)
    date.setHours(date.getHours() + 3)
    var seg = document.querySelector('#segunda-feira')
    var ter = document.querySelector('#terca-feira')
    var qua = document.querySelector('#quarta-feira')
    var qui = document.querySelector('#quinta-feira')
    var sex = document.querySelector('#sexta-feira')
    var sab = document.querySelector('#sabado')


    var objData = new Date(calendario.value),
      numAno = objData.getFullYear(),
      numMes = objData.getMonth()+1,
      numDias = new Date(numAno, numMes, 0).getDate();

    if (date.getDay() == 0) { // Domingo
        seg.textContent = date.getDate()+1
        ter.textContent = date.getDate()+2
        qua.textContent = date.getDate()+3
        qui.textContent = date.getDate()+4
        sex.textContent = date.getDate()+5
        sab.textContent = date.getDate()+6
        document.getElementById('segunda-feira').style.backgroundColor = ''
        document.getElementById('terca-feira').style.backgroundColor = ''
        document.getElementById('quarta-feira').style.backgroundColor = ''
        document.getElementById('quinta-feira').style.backgroundColor = ''
        document.getElementById('sexta-feira').style.backgroundColor = ''
        document.getElementById('sabado').style.backgroundColor = ''
        if (seg.textContent < 1 || seg.textContent > numDias) {seg.textContent = "-"}
        if (ter.textContent < 1 || ter.textContent > numDias) {ter.textContent = "-"}
        if (qua.textContent < 1 || qua.textContent > numDias) {qua.textContent = "-"}
        if (qui.textContent < 1 || qui.textContent > numDias) {qui.textContent = "-"}
        if (sex.textContent < 1 || sex.textContent > numDias) {sex.textContent = "-"}
        if (sab.textContent < 1 || sab.textContent > numDias) {sab.textContent = "-"}
    }
    if (date.getDay() == 1) { // Segunda
        document.getElementById('segunda-feira').style.backgroundColor = 'rgba(217, 196, 128, 1)'
        document.getElementById('terca-feira').style.backgroundColor = ''
        document.getElementById('quarta-feira').style.backgroundColor = ''
        document.getElementById('quinta-feira').style.backgroundColor = ''
        document.getElementById('sexta-feira').style.backgroundColor = ''
        document.getElementById('sabado').style.backgroundColor = ''
        seg.textContent = date.getDate()
        ter.textContent = date.getDate()+1
        qua.textContent = date.getDate()+2
        qui.textContent = date.getDate()+3
        sex.textContent = date.getDate()+4
        sab.textContent = date.getDate()+5
        if (seg.textContent < 1 || seg.textContent > numDias) {seg.textContent = "-"}
        if (ter.textContent < 1 || ter.textContent > numDias) {ter.textContent = "-"}
        if (qua.textContent < 1 || qua.textContent > numDias) {qua.textContent = "-"}
        if (qui.textContent < 1 || qui.textContent > numDias) {qui.textContent = "-"}
        if (sex.textContent < 1 || sex.textContent > numDias) {sex.textContent = "-"}
        if (sab.textContent < 1 || sab.textContent > numDias) {sab.textContent = "-"}
    }
    if (date.getDay() == 2) { // Terça
        document.getElementById('segunda-feira').style.backgroundColor = ''
        document.getElementById('terca-feira').style.backgroundColor = 'rgba(217, 196, 128, 1)'
        document.getElementById('quarta-feira').style.backgroundColor = ''
        document.getElementById('quinta-feira').style.backgroundColor = ''
        document.getElementById('sexta-feira').style.backgroundColor = ''
        document.getElementById('sabado').style.backgroundColor = ''
        seg.textContent = date.getDate()-1
        ter.textContent = date.getDate()
        qua.textContent = date.getDate()+1
        qui.textContent = date.getDate()+2
        sex.textContent = date.getDate()+3
        sab.textContent = date.getDate()+4
        if (seg.textContent < 1 || seg.textContent > numDias) {seg.textContent = "-"}
        if (ter.textContent < 1 || ter.textContent > numDias) {ter.textContent = "-"}
        if (qua.textContent < 1 || qua.textContent > numDias) {qua.textContent = "-"}
        if (qui.textContent < 1 || qui.textContent > numDias) {qui.textContent = "-"}
        if (sex.textContent < 1 || sex.textContent > numDias) {sex.textContent = "-"}
        if (sab.textContent < 1 || sab.textContent > numDias) {sab.textContent = "-"}
    }
    if (date.getDay() == 3) { // Quarta
        document.getElementById('segunda-feira').style.backgroundColor = ''
        document.getElementById('terca-feira').style.backgroundColor = ''
        document.getElementById('quarta-feira').style.backgroundColor = 'rgba(217, 196, 128, 1)'
        document.getElementById('quinta-feira').style.backgroundColor = ''
        document.getElementById('sexta-feira').style.backgroundColor = ''
        document.getElementById('sabado').style.backgroundColor = ''
        seg.textContent = date.getDate()-2
        ter.textContent = date.getDate()-1
        qua.textContent = date.getDate()
        qui.textContent = date.getDate()+1
        sex.textContent = date.getDate()+2
        sab.textContent = date.getDate()+3
        if (seg.textContent < 1 || seg.textContent > numDias) {seg.textContent = "-"}
        if (ter.textContent < 1 || ter.textContent > numDias) {ter.textContent = "-"}
        if (qua.textContent < 1 || qua.textContent > numDias) {qua.textContent = "-"}
        if (qui.textContent < 1 || qui.textContent > numDias) {qui.textContent = "-"}
        if (sex.textContent < 1 || sex.textContent > numDias) {sex.textContent = "-"}
        if (sab.textContent < 1 || sab.textContent > numDias) {sab.textContent = "-"}
    }
    if (date.getDay() == 4) { //Quinta
        document.getElementById('segunda-feira').style.backgroundColor = ''
        document.getElementById('terca-feira').style.backgroundColor = ''
        document.getElementById('quarta-feira').style.backgroundColor = ''
        document.getElementById('quinta-feira').style.backgroundColor = 'rgba(217, 196, 128, 1)'
        document.getElementById('sexta-feira').style.backgroundColor = ''
        document.getElementById('sabado').style.backgroundColor = ''
        seg.textContent = date.getDate()-3
        ter.textContent = date.getDate()-2
        qua.textContent = date.getDate()-1
        qui.textContent = date.getDate()
        sex.textContent = date.getDate()+1
        sab.textContent = date.getDate()+2
        if (seg.textContent < 1 || seg.textContent > numDias) {seg.textContent = "-"}
        if (ter.textContent < 1 || ter.textContent > numDias) {ter.textContent = "-"}
        if (qua.textContent < 1 || qua.textContent > numDias) {qua.textContent = "-"}
        if (qui.textContent < 1 || qui.textContent > numDias) {qui.textContent = "-"}
        if (sex.textContent < 1 || sex.textContent > numDias) {sex.textContent = "-"}
        if (sab.textContent < 1 || sab.textContent > numDias) {sab.textContent = "-"}
    }
    if (date.getDay() == 5) { //Sexta
        document.getElementById('segunda-feira').style.backgroundColor = ''
        document.getElementById('terca-feira').style.backgroundColor = ''
        document.getElementById('quarta-feira').style.backgroundColor = ''
        document.getElementById('quinta-feira').style.backgroundColor = ''
        document.getElementById('sexta-feira').style.backgroundColor = 'rgba(217, 196, 128, 1)'
        document.getElementById('sabado').style.backgroundColor = ''
        seg.textContent = date.getDate()-4
        ter.textContent = date.getDate()-3
        qua.textContent = date.getDate()-2
        qui.textContent = date.getDate()-1
        sex.textContent = date.getDate()
        sab.textContent = date.getDate()+1
        if (seg.textContent < 1 || seg.textContent > numDias) {seg.textContent = "-"}
        if (ter.textContent < 1 || ter.textContent > numDias) {ter.textContent = "-"}
        if (qua.textContent < 1 || qua.textContent > numDias) {qua.textContent = "-"}
        if (qui.textContent < 1 || qui.textContent > numDias) {qui.textContent = "-"}
        if (sex.textContent < 1 || sex.textContent > numDias) {sex.textContent = "-"}
        if (sab.textContent < 1 || sab.textContent > numDias) {sab.textContent = "-"}
    }
    if (date.getDay() == 6) { // Sabado
        document.getElementById('segunda-feira').style.backgroundColor = ''
        document.getElementById('terca-feira').style.backgroundColor = ''
        document.getElementById('quarta-feira').style.backgroundColor = ''
        document.getElementById('quinta-feira').style.backgroundColor = ''
        document.getElementById('sexta-feira').style.backgroundColor = ''
        document.getElementById('sabado').style.backgroundColor = 'rgba(217, 196, 128, 1)'
        seg.textContent = date.getDate()-5
        ter.textContent = date.getDate()-4
        qua.textContent = date.getDate()-3
        qui.textContent = date.getDate()-2
        sex.textContent = date.getDate()-1
        sab.textContent = date.getDate()
        if (seg.textContent < 1 || seg.textContent > numDias) {seg.textContent = "-"}
        if (ter.textContent < 1 || ter.textContent > numDias) {ter.textContent = "-"}
        if (qua.textContent < 1 || qua.textContent > numDias) {qua.textContent = "-"}
        if (qui.textContent < 1 || qui.textContent > numDias) {qui.textContent = "-"}
        if (sex.textContent < 1 || sex.textContent > numDias) {sex.textContent = "-"}
        if (sab.textContent < 1 || sab.textContent > numDias) {sab.textContent = "-"}
    }
}






