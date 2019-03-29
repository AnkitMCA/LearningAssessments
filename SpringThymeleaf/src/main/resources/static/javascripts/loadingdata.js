$("form#loader-form").submit(function () {
    $.ajax({
        url: "/success",
        method: "POST",
        success: function success(success) {
            console.log(success);
        },
        beforeSend: function () {
            $("#loading").show();
        }
    });
});
