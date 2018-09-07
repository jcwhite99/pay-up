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
