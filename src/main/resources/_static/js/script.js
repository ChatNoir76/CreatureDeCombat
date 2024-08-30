$( document ).ready(function() {

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
    
	$("#niveauSelect").on("change", function() {
		$('#creatureBaseDiv').show();
        var selectedNiveau = $(this).val() - 1;
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
        var niveauSelectedOption = $('#creatureBaseSelect option[selected="selected"]').data('niveau');
        if (niveauSelectedOption == selectedNiveau) {
                $('#creatureBaseSelect').val($('#creatureBaseSelect option[selected="selected"]').val());
            } else {
                $('#creatureBaseSelect').val('');
            }
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
    
    $('#pv').on("change", function() {
		var pv = $(this).val()
		$('#pvValue').text(pv);
	});
    
    $("#niveauSelect").trigger("change");
    $("#categorieSelect").trigger("change");

});