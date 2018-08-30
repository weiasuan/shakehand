$(function () {
    displayList();
})



function displayList() {
    $(".menu_box").mouseover(function () {
       // $(this).css("background-color", "yellow");
        $(this).children().eq(1).css("display", "block");
    });
    $(".menu_sub").mouseout(function () {
       // $(this).css("background-color", "#fff");
        $(this).css("display", "none");
    });
}