var prikaziPoslovneGodine = false;
var dodajPoslovnunGodinu = false;


function odrediPrikaz(id){
    prikaziPoslovneGodine = false;
    dodavanjePoslovneGodine = false;

	if(id === "svePoslovneGodine"){
        prikaziPoslovneGodine = true;
    }else if(id === "dodajPoslovnuGodinu"){
    	dodavanjePoslovneGodine = true;
    }
    prikazi();
}

function prikazi(){
	redovi = [];
    redovi.forEach(element => {
        console.log("red"+element.id);
        $("#red"+element.id).remove();
    });

    var poslovneGodineTable = $("#poslovneGodineTable");
    var dodajPoslovnuGodinu = $("#dodajPoslovnuGodinu");

    poslovneGodineTable.hide();
    dodajPoslovnuGodinu.hide();

	if(prikaziPoslovneGodine){
        prikazSvihPoslovnihGodina();
    }else if(dodavanjePoslovneGodine){
    	dajPreduzeca("selectPreduzeca");
    	dodajPoslovnuGodinu.show();
    }
}

function promeniIzgledTaba(dropdown){
    var poslovnaGodinaDropdown = $("#poslovnaGodinaDropdown");

    poslovnaGodinaDropdown.removeClass("active");


if(dropdown === "poslovnaGodinaDropdown"){
        //console.log("poslovnaGodinaDropdown")
        poslovnaGodinaDropdown.addClass("active");

    }
}