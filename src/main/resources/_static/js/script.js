$( document ).ready(function() {
    
    function updatePvProgressBar(percentage){
		$("#pv_progress_bar").width(percentage + '%')
	}
    
    updatePvProgressBar(70);

});