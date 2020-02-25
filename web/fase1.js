// Empty String vars
var city1, city2, city3, city4, city5, city6;

function addCitiesPhase1() {
	city1 = document.getElementById("city1").value;
	city2 = document.getElementById("city2").value;
	city3 = document.getElementById("city3").value;
	city4 = document.getElementById("city4").value;
	city5 = document.getElementById("city5").value;
	city6 = document.getElementById("city6").value;

	document.write("<h1>Phase 1 results</h1>");
	
	document.write("Ciutats introduides: " + city1 + ", " + city2
	  + ", " + city3 + ", " + city4 + ", " + city5 + " i " + city6);
}
