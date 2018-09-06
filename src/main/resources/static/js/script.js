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
    var field1=document.getElementById("$1").value;
    var field2=document.getElementById("$2").value;
    var field3=document.getElementById("$3").value


    var result=parseFloat(field1)+parseFloat(field2);

    if (!isNaN(result)){
    }
    document.getElementById("total").innerHTML="Please pay this amount"+result;
    }