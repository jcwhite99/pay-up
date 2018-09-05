window.onload=function companyInvoice(){
    var radio = document.getElementById("company");
    var text = document.getElementById("name");
   if (radio.checked == true){
       text.style.display = "block";
    } else {
       text.style.display = "none";   }
}


window.onload=function serviceInvoice() {
    var checkBox = document.getElementById("service");
    var text = document.getElementById("job")
    if (checkBox.checked == true){
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}



//function hello(){
//var x = document.getElementsByClassName("serviceOne")
//console.log("x", x)
//window.alert("hi");
//};




