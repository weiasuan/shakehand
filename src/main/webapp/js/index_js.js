$(function () {
    displayList();

    //实现职位显示
    $.ajax({
        url: "/IndexJobInfo",
        type: "post",
        dataType: "json",
        success: function (list) {
            if (list.length != 0) {
                for (var i = 0; i < list.length; i++) {
                    var $node = $('<li class="position_list_item"><div class="pli_top"><div class="clear_fix_pli_top_1"><div class="position_name"><h2><a>'+list[i].JOB_KIND+'</a></h2><span class="create-time">'+list[i].JOB_RELEASETIME+'</span></div><div class="chat-me"></div><span class="salary">'+list[i].JOB_SALARY+'</span></div><div class="position_main_info"><span>'+list[i].JOB_EXPERIENCE+'</span><span>/</span><span>'+list[i].JOB_EDUCATION+'</span></div><div class="labels"><span>新闻出版</span><span>Javascript</span><span>Web前端</span></div></div><div class="pli_btm"><a><img src="img/small_logo1.jpg"></a><div class="bottom-right"><div class="company_name"><a>湛卢文化</a></div><div class="industry"><span>文化娱乐，教育</span><span>/</span><span>不需要融资</span><span>/</span><span>'+list[i].JOB_ADDRESS+'</span></div></div></div></li>');
                    $("#index_jobInfo").append($node);
                }
            }
        }
    });

    //实现公司显示
    $.ajax({
        url: "/Company",
        type: "post",
        dataType: "json",
        success: function (list) {
            if (list.length != 0) {
                for (var i = 0; i < list.length; i++) {
                    var $node = $('<li class="company-item"><div class="company-top"><p><a><img src="img/small_mid_logo1.png"></a></p><p><a>'+list[i].COMPANY_NAME+'</a></p><p><span>'+list[i].COMPANY_LABEL+'</span><span>/</span><span>C轮</span></p><p>'+list[i].COMPANY_PROFILE+'</p></div><div class="company-bottom"><a><p><span>28</span></p><p>面试评价</p></a><a><p><span>4</span></p><p>在招职位</p></a><a><p><span>100%</span></p><p>简历处理率</p></a></div></li>');
                    $(".ad-company-list").append($node);
                }
            }
        }
    });


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




