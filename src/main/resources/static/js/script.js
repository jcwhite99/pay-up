function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
}


function calculate(){
    var val1=parseInt(document.getElementById("value1").value);
    var val2=parseInt(document.getElementById("value2").value);
    var val3=parseInt(document.getElementById("value3").value);
    var ansD=document.getElementById('answer');

    ansD.value = val1 + val2 + val3;

}


function myFunction() {
    var table = document.getElementById("invoice");
    var row = table.insertRow(0);
    var cell1 = row.insertCell(0);
    var cell2 = row.insertCell(1);
    var cell3 = row.insertCell(2);

}


function deleteRow(r) {
    var i = r.parentNode.parentNode.rowIndex;
    document.getElementById("invoice").deleteRow(i);
}



