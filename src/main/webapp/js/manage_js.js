$(function () {
    var $node1 = $("#company");
    var $node2 = $("#user");
    var $node3 = $("#new_info");
    $node1.show();
    //显示公司表格
    $("#ul_company>li").click(function () {
        $node1.show();
        $node2.hide();
        $node3.hide();
    })
    //显示用户表格
    $("#ul_user>li").click(function () {
        $node2.show();
        $node1.hide();
        $node3.hide();
    })
    //显示公告表格
    $("#ul_new>li").click(function () {
        $node3.show();
        $node1.hide();
        $node2.hide();
    })
    //导航显示内容
    for (var i=1;i<=13;i++) {
        $("#li" + i).click(function () {
            // $(this).attr("background-color","#08d7a2");
            if($(".space").next().prop("tagName")=="LI"){
                $(".space").next().remove();
            }
            var $daohang = $('<li>'+$(this).text()+'</li>');
            $(".space").after($daohang);
        })
    }

        // function aa() {
        //     alert("js文件掉用");
        // }
});