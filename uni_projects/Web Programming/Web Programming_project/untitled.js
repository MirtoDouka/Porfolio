function check_pass() {
    if (document.getElementById('password').value ===
        document.getElementById('confirm_pas').value) {
        document.getElementById('message').style.color = 'green';
        document.getElementById('message').innerHTML = 'matching';
    }
    else {
        document.getElementById('message').style.color = 'red';
        document.getElementById('message').innerHTML = 'not matching';
    }
}

function address_valid(geocoder){

    var Town = document.getElementById('town').value;
    var Country = document.getElementById('country').value;
    var Address = document.getElementById('address').value;

    console.log(Town, Country, Address);

    url = "https://nominatim.openstreetmap.org/search?format=json&q=" + Country + ' ' + Town + ' ' + Address + 
          "&addressdetails=1&accept-language=en";

    var xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
    	if (this.readyState == 4 && this.status == 200) { 
            console.log(JSON.parse(this.responseText));

            var data = JSON.parse(this.responseText);

            if ((data.length != 0)) {
            document.getElementById('Validate').style.color = 'green';
            document.getElementById('message1').innerHTML = 'Correct address';
        }
        else {
        	document.getElementById('Validate').style.color = 'red';
            document.getElementById('message1').innerHTML = 'Address not found';
        }

        }
    };



    xhttp.open("GET", url, true);
    xhttp.send();
}


let map: google.maps.Map;
function map_func(): void {
  map = new google.maps.Map(document.getElementById("map") as HTMLElement, {
    center: { lat: -34.397, lng: 150.644 },
    zoom: 8,
  });
}



function map_func(){
        var map = new OpenLayers.Map("mapdiv");
        var mapnik         = new OpenLayers.Layer.OSM();
        var fromProjection = new OpenLayers.Projection("EPSG:4326");   // Transform from WGS 1984
        var toProjection   = new OpenLayers.Projection("EPSG:900913"); // to Spherical Mercator Projection
        var position       = new OpenLayers.LonLat(13.41,52.52).transform( fromProjection, toProjection);
        var zoom           = 15; 

        map.addLayer(mapnik);
        map.setCenter(position, zoom );
      }





 <div class = choose> <p><h2>Choose gender:</h2></p> 
                <input type="radio" id="male" name="gender" value="male">
                <label for="male" style="font-size: 30px; ">Male</label><br>
                <input type="radio" id="female" name="gender" value="female">
                <label for="female" style="font-size: 30px;">Female</label><br>
                <input type="radio" id="other" name="gender" value="n/a">
                <label for="other" style="font-size: 30px;">N/A</label> 
                 </div>


script
      src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&callback=initMap&libraries=&v=weekly"
      defer
    ></script>



