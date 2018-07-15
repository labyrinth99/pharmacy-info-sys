document.ready(){
    debugger
    $.ajax({
        url : 'GetAllmedicationServlet',

        success : function(responseText) {
            debugger
            $('#ajaxGetUserServletResponse').text(responseText);
        }
    });
});