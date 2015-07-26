/**
 * 
 */
console.log("Hello!");
$.onLoad=function() {
	onClick(function(){$('a').css("color", "green");})
};
$(function() {
	$('.form').click(function() {
		console.log("hello");
	})
})

$(function() {
	$('.form').click(function() {
		$('a').css("color", "green");
	})
})

$(function() {
	$('.form').click(function() {
		var colors=['green', 'red', 'black', 'yellow'];
		var c=Math.floor((Math.random() * 4));
		$('a').css("color",colors[c] );
	})
})
