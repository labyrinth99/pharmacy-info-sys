window.onload = function () {
    debugger
    $('#searchbtn').onclick = searchMedicine();

    function searchMedicine() {
        debugger
        var medicine = $('#medicine').val();

        $.post('Search', {medicine: medicine})
    }

    $('.button.getdata').click(getdata);

    function getdata(e) {
        debugger
        var medicine_id = e.target.id;
        $.post('getdata', {medicine_id: medicine_id})
    }
};