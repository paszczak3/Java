var haslo = "Kazek król"; 
haslo = haslo.toUpperCase();

var temp = 0;
var haslo1 = "";
var litery1 ="AĄBCĆDEĘFGHIJKLŁMNŃOÓPQRSŚTUVWXYZŻŹ";

var yes = new Audio("yes.wav");
var no = new Audio("no.wav");

for(var i = 0; i<haslo.length; i++){
	if(haslo.charAt(i) == " "){
		 haslo1 += " ";
	} else {
		haslo1 += "-";
	}	
}

function wypiszHaslo() {
	document.getElementById("plansza").innerHTML = haslo1;
}

function start(){
	var tresc_diva = "";

	for(var i = 0; i<35; i++){
		var element = "lit" + i;
		tresc_diva = tresc_diva + '<div class="litera" onclick="sprawdz('+i+')" id="'+element+'">'+ litery1.charAt(i) +'</div>'
		if( (i+1) % 7 == 0 ) {
			tresc_diva = tresc_diva + '<div style="clear:both;"></div>'
		}
	}
	document.getElementById("alfabet").innerHTML = tresc_diva;
	wypiszHaslo();
}

String.prototype.ustawZnak = function(miejsce, znak){

	if(miejsce > haslo.length - 1 ) {
		return this.toString();
	} else {
		return this.substr(0,miejsce) + znak + this.substr(miejsce+1); 
	}
}

function sprawdz(nr) { 

	var trafiona = false;
	
	for(var i = 0; i<haslo.length; i++) {

		if(haslo.charAt(i) == litery1.charAt(nr)) {
			haslo1 = haslo1.ustawZnak(i,litery1.charAt(nr));
			trafiona = true;
		}
	}

	if(trafiona == true) {
		yes.play();
		var element = "lit" + nr;
		document.getElementById(element).style.background = "#003300";
		document.getElementById(element).style.color = "#00c000";
		document.getElementById(element).style.border = " 3px solid #003300";
		document.getElementById(element).style.cursor = "default";
		wypiszHaslo();
	} else {
		no.play();
		var element = "lit" + nr;
		document.getElementById(element).style.background = "#330000";
		document.getElementById(element).style.color = "#c00000";
		document.getElementById(element).style.border = " 3px solid #c00000";
		document.getElementById(element).style.cursor = "default";
		document.getElementById(element).setAttribute("onclick", ";");

		temp++;
		var  obraz = "img/s" + temp + ".jpg";
		document.getElementById("szubienica").innerHTML = '<img src ="'+obraz+'" alt=" " />'; 
	}

	if(haslo == haslo1) {
		document.getElementById("alfabet").innerHTML = "Wygrałeś :"+ haslo + "</br>" + '<br/> <span class ="reset" onclick="location.reload()"> Jeszcze raz? </span> ';
	}

	if(temp == 9) {
		document.getElementById("alfabet").innerHTML = "Przegrłeś :" + "</br>" + '<br/> <span class ="reset" onclick="location.reload()"> Jeszcze raz? </span> ';
	}

}

window.onload = start;








