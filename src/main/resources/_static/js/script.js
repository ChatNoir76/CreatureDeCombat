$( document ).ready(function() {
    var creature = window.creatureData;
    
    function updatePvProgressBar(percentage){
		$("#pv_progress_bar").width(percentage + '%')
		$("#pv_progress_bar").text(percentage + '%')
	}

    var p = Math.floor(creature.pv / creature.pvInit * 100)
    
    updatePvProgressBar(p);

});