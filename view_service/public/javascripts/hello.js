document.getElementById('formi').style.display = 'none';

if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
}


function initMap() {
  var mapDiv = document.getElementById('map');
  var map = new google.maps.Map(mapDiv, {
    center: {lat: -7.2148147, lng: -35.9087772},
    zoom: 15
  });
}
//Function To Display Popup
function div_show() {
  document.getElementById('formi').style.display = 'block';
}
//Function to Hide Popup
function div_hide(){
  document.getElementById('formi').style.display = "none";
}



/*---------------------------------------------------------*/
// Function that executes on click of first next button.
function next_step1() {
document.getElementById("first").style.display = "none";
document.getElementById("second").style.display = "block";
document.getElementById("active2").style.color = "red";
}
// Function that executes on click of first previous button.
function prev_step1() {
document.getElementById("first").style.display = "block";
document.getElementById("second").style.display = "none";
document.getElementById("active1").style.color = "red";
document.getElementById("active2").style.color = "gray";
}
// Function that executes on click of second next button.
function next_step2() {
document.getElementById("second").style.display = "none";
document.getElementById("third").style.display = "block";
document.getElementById("active3").style.color = "red";
}
// Function that executes on click of second previous button.
function prev_step2() {
document.getElementById("third").style.display = "none";
document.getElementById("second").style.display = "block";
document.getElementById("active2").style.color = "red";
document.getElementById("active3").style.color = "gray";
}


