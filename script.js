const PI = 3.14;
let radius;
let circumference;

document.getElementById("mySubmit").onclick = function(){
    radius = document.getElementById("myInput").value;
    radius = Number(radius);
    circumference = 2 * PI * radius;
    document.getElementById("myOutput").textContent = circumference;
}
