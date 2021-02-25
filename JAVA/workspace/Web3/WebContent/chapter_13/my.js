$(document).ready(function(){
	$('#main-header li').hover(function(){
		$(this).addClass('active');
	},function(){
		$(this).removeClass('active');
	});
	
	$('#network').click(function(){
		$('#main-content').hide();
		$('#sub-content').hide();
		$('#networkDiv').html('<h1> 내용 </h1>');
		$('#networkDiv').show();
		
	});
	
	$('#store').click(function(){
		$('#main-content').show();
		$('#sub-content').show();
		$('#networkDiv').hide();
		
	});
});
