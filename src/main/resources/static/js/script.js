function companyInvoice() {
    var radio = document.getElementById("company");
    var text = document.getElementById("name");
    if (radio.checked == true){
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}


function serviceInvoice() {
    var check.Box = document.getElementById("service");
    var text = document.getElementById("job");
    if (check.Box.checked == true){
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}








