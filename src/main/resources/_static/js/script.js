$( document ).ready(function() {
    var status = "javascript ok";
    
    function ajouterAttaque(id, value) {
        var index = $('#attaqueList li').length;
        var nouvelleAttaque = "<li class='list-group-item'><input style='display: none;' type='number' name='attaques[" + index + "]' value='" + id + "'/><span>" + value + "</span></li>";
        $('#attaqueList').append(nouvelleAttaque);
    }
    
    $("#ajouterAttaque").on("click", function() {
        var id = $('#inputGroupSelectAttaque').val();
        var value = $('#inputGroupSelectAttaque option:selected').text();
        ajouterAttaque(id, value);
    });
    
	
    console.log(status)

});