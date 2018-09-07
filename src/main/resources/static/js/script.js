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

function addRow(tableID) {
    var table = document.getElementById(tableID);
    var rowCount = table.rows.length;
    var row = table.insertRow(rowCount);

    var cell1 = row.insertCell(0);
    var element1 = document.createElement("input");
        element1.type = "checkbox";
        element1.name="chkbox[]";
        cell1.appendChild(element1);

    var cell2 = row.insertCell(1);
    var element2 = document.createElement("input");
        element2.type="date";
        element2.name="date[]";
        cell2.appendChild(element2);

    var cell3 = row.insertCell(2);
    var element3 = document.createElement("input");
        element3.type = "text";
        element3.name = "txtbox[]";
        cell3.appendChild(element3);

    var cell4 = row.insertCell(3);
    var element4 = document.createElement("input");
        element4.type = "text";
        element4.name = "txtbox1[]";
        cell4.appendChild(element4);
}

function deleteRow(tableID) {
    try {
    var table = document.getElementById(tableID);
    var rowCount = table.rows.length;

for(var i=0; i<rowCount; i++) {
    var row = table.rows[i];
    var chkbox = row.cells[0].childNodes[0];
        if(null != chkbox && true == chkbox.checked) {
            table.deleteRow(i);
            rowCount--;
            i--;
        }
    }
    }catch(e) {

        alert(e);
    }
}

function add() {
    var sum = 0;
    var valid = true;
    var inputs = document.getElementsByName( 'text');
for(i =0; i < inputs.length; i++) {
    if( inputs[i].value.match( /^[0]*(\d+)$/)) {
       sum += parseInt(RegExp.$1);

   }
else {valid=false;}
}
if(valid) {
document.getElementById( 'sum').value = sum;
}
}

var dragMe = document.getElementsByClassName("dragMe");
    for (var i = 0; i < dragMe.length; i++) {
        $(dragMe[i]).draggable();
    }











