/**
 * Created by 143135s on 11/26/2015.
 */
function format ( d ) {
    // `d` is the original data object for the row
    return '<table cellpadding="5" cellspacing="0" border="0" style="padding-left:50px;">'+
        '<tr>'+
        '<td>Id:</td>'+
        '<td>'+d.id+'</td>'+
        '</tr>'+
        '<tr>'+
        '<td>Description:</td>'+
        '<td>'+d.description+'</td>'+
        '</tr>'+
        '</table>';
}


$(document).ready(function() {
    var table = $('#example').DataTable( {
        "ajax": {
            url: "/book",
            dataSrc: ''
        },
        "columns" : [
            {
                "className":      'details-control',
                "orderable":      false,
                "data":           null,
                "defaultContent": ''
            },
            {"data" : "title"},
            {"data" : "author"},
            {"data" : "price"},
            {"data" : "quantity"}
        ]


    } );
    $('#example tbody').on('click', 'td.details-control', function () {
        var tr = $(this).closest('tr');
        var row = table.row(tr);

        if (row.child.isShown()) {
            // This row is already open - close it
            row.child.hide();
            tr.removeClass('shown');
        }
        else {
            // Open this row
            row.child(format(row.data())).show();
            tr.addClass('shown');
        }
    } );
} );
