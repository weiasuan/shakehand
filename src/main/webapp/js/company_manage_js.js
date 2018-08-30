$(function () {
    $("#nav_company").click(function (e) {
        e.preventDefault();
        $(".navs").parent().removeClass();
        $("#nav_company").parent().addClass("active");
        $(".editHome").hide();
        $("#Company").show();
    });
    $("#nav_JobInfo").click(function (e) {
        e.preventDefault();
        $(".navs").parent().removeClass();
        $("#nav_JobInfo").parent().addClass("active");
        $(".editHome").hide();
        $("#JobInfo").show();
    })
    $("#nav_Job").click(function (e) {
        e.preventDefault();
        $(".navs").parent().removeClass();
        $("#nav_Job").parent().addClass("active");
        $(".editHome").hide();
        $("#Job").show();
    })
    $("#nav_ResumeInfo").click(function (e) {
        e.preventDefault();
        $(".navs").parent().removeClass();
        $("#nav_ResumeInfo").parent().addClass("active");
        $(".editHome").hide();
        $("#ResumeInfo").show();
    })
})