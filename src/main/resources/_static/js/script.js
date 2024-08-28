$( document ).ready(function() {
    var status = "javascript ok";
    
    function ajouterAttaque(id, value) {
        var index = $('#attaqueList li').length;
        var nouvelleAttaque = "<li class='list-group-item'><input style='display: none;' type='number' name='attaques[" + index + "]' value='" + id + "'/><span>" + value + "</span><button type='button' class='btn btn-danger btn-sm remove-attaque'>Supprimer</button></li>";
        $('#attaqueList').append(nouvelleAttaque);
    }
    
    $("#ajouterAttaque").on("click", function() {
        var id = $('#attaqueSelect').val();
        var value = $('#attaqueSelect option:selected').text();
        ajouterAttaque(id, value);
    });
    
    $("#attaqueSelect").on("change", function() {
	    var selectedOption = $(this).find('option:selected');
	    var optionCategorie = selectedOption.attr('data-categorie');
	    console.log(optionCategorie);
	});
	
	$("#niveauSelect").on("change", function() {
		$('#creatureBaseDiv').show();
        var selectedNiveau = $(this).val() - 1;
        console.log(selectedNiveau)
        if(selectedNiveau == 0){
			$('#creatureBaseDiv').hide();
		} else {
			$('#creatureBaseSelect option').each(function() {
            var optionCreature = $(this).data('niveau');
            if (optionCreature == selectedNiveau) {
                $(this).show();
            } else {
                $(this).hide();
            }
        });

        $('#creatureBaseSelect').val('');
		}
        
    });

    $("#categorieSelect").on("change", function() {
        var selectedCategorie = $(this).val();
        $('#attaqueSelect option').each(function() {
            var optionCategorie = $(this).data('categorie');
            if (optionCategorie == selectedCategorie || optionCategorie == 1) {
                $(this).show();
            } else {
                $(this).hide();
            }
        });

        $('#attaqueSelect').val('');
    });
    
    $('#attaqueList').on('click', '.remove-attaque', function(){
        $(this).closest('li').remove();
    });
    
    $("#niveauSelect").trigger("change");
    $("#categorieSelect").trigger("change");
	
    console.log(status)

});