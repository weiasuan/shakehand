$(function () {
    displayList();
    $.ajax({
        url: "/Company",
        type: "post",
        dataType: "json",
        success: function (list) {
            if (list.length != 0) {
                for (var i = 0; i < list.length; i++) {
                    var $node = $('<li class="company-item"> <div class="company-top"><p><a><img src="img/small_mid_logo1.png"></a></p><p><a>'+list[i].COMPANY_NAME+'</a></p><p><span>'+list[i].COMPANY_LABEL+'</span><span>/</span><span>C轮</span></p><p>'+list[i].COMPANY_PROFILE+'</p></div><div class="company-bottom"><a><p><span>28</span></p><p>面试评价</p></a><a><p><span>4</span></p><p>在招职位</p></a><a><p><span>100%</span></p><p>简历处理率</p></a></div></li>');
                    $(".ad-company-list").appendChild($node);
                }
            }
        }
    })
});
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




