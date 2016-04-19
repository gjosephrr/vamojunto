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