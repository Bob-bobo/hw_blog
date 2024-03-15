$(function () {
    scrollTo(0, 0);//回到顶部
})

function putInUpdates(data) {
    var timeOne;
    $("")
}

function getAllUpdates(data) {
    var jsonStr = {pageSize: 5, pageNum: currentPage};
    $.ajax({
        type: "GET",
        url: "/getAllUpdates",
        contentType: "application/json",
        dataType: "json",
        data: jsonStr,
        success: function (data) {
            //
        }
    })
}