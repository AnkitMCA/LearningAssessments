$(document).ready(function () {
    function timee() {
        $.ajax({
            type:'GET',
            url:'/timee',
            timeout:1000,
            success: function (data) {
                $('#timer').html(data);
                window.setTimeout(timee,1000)
            }
        });
    }
    timee();
});