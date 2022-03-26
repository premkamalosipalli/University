jQuery(function($) {
	var validator = $('#form').validate({
		rules : {
			deptName : {
				required : true
			},
			buildName : {
				required : true
			},
			budgetValue : {
				required : true
			},

		},
		messages : {
			deptName : "Plese Enter Department Name",
			buildName : "Plese Enter Building Name",
			budgetValue : "Plese Enter budget"
		},
		errorPlacement : function(error, element) {
			var placement = $(element).data('error');
			if (placement) {
				$(placement).append(error)
			} else {
				error.insertAfter(element);
			}
		}
	});
});