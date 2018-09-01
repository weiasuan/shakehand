//公司LOGO
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<img src="'+list[0].COMPANY_LOGO+'"\n' +
                '                 alt="航班管家Logo" width="164" heihgt="164">' );
            $("#showCOMPANY_LOGO").append($node);
        }
    });
});
//公司名称
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<a href="http://www.huoli.com">\n'+list[0].COMPANY_NAME+' </a>');
            $("#showCOMPANY_NAME").append($node);
        }
    });
});
//公司描述
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<span>\n'+list[0].COMPANY_PROFILE+' </span>');
            $("#showCOMPANY_PROFILE").append($node);
        }
    });
});
//公司类型
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<span>\n'+list[0].COMPANY_SECTOR+' </span>');
            $("#showCOMPANY_SECTOR").append($node);
        }
    });
});
//公司阶段
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<span>\n'+list[0].COMPANY_STAGE+' </span>');
            $("#showCOMPANY_STAGE").append($node);
        }
    });
});
//公司规模
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<span>\n'+list[0].COMPANY_SCALE+' </span>');
            $("#showCOMPANY_SCALE").append($node);
        }
    });
});
//公司地址
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<span>\n'+list[0].COMPANY_ADDRESS+' </span>');
            $("#showCOMPANY_ADDRESS").append($node);
        }
    });
});
//公司介绍
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+list[0].COMPANY_DETAILPROFILE+' </span>');
            $("#showCOMPANY_DETAILPROFILE").append($node);
        }
    });
});
//公司邮箱
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<span>'+list[0].COMPANY_EMAIL+' </span>');
            $("#showCOMPANY_EMAIL").append($node);
        }
    });
});
//公司电话
$(function () {
    $.ajax({
        url: "/ShowCompany",
        type: "post",
        dataType:"json",
        success: function (list) {
            var $node = $('<span>'+list[0].COMPANY_TEL+' </span>');
            $("#showCOMPANY_TEL").append($node);
        }
    });
});

var pageNum = 1;
var reCount = 0;
var pageSize = 3;
var maxNum = 1;
//显示页面

$(function () {
    load();
    $(".btn1:first").click(function () {
        pageNum = pageNum>1? --pageNum : pageNum;
        $("#show").children().remove();
        load();
    });
    $(".btn1:last").click(function () {
        maxNum = Math.ceil(reCount/pageSize);
        pageNum = pageNum<maxNum? ++pageNum :maxNum;
        $("#show").children().remove();
        load();
    });

    $("#form1").validate({
        onsubmit:true,// 是否在提交是验证
        onfocusout:false,// 是否在获取焦点时验证
        onkeyup :false,// 是否在敲击键盘时验证

        rules: {　　　　//规则
            userName: {　　//要对应相对应的input中的name属性
                required: true
            },
            msg: {
                required: true
            }
        },
        messages:{　　　　//验证错误信息
            userName: {
                required: "请输入用户名"
            },
            msg: {
                required: "请输入留言"
            }
        },
        submitHandler: function(form) { //通过之后回调
//进行ajax传值
            $.ajax({
                url:"/addMsg",
                type: "post",
                data:{"userName":$("input[name='userName']").val(),"msg":$("textarea[name='msg']").val()},
                dataType:"text",
                success : function(ret) {
                    //要执行的代码
                    if (ret=="1"){
                        layer.msg('留言成功',{time:1000},function () {
                            location.reload();
                        })
                    }
                }
            });
        },
        invalidHandler: function(form, validator) {return false;}
    });


});
function getClass(className) { //className指class的值

    var tagname = document.getElementsByTagName('*');  //获取指定元素
    var tagnameAll = [];     //这个数组用于存储所有符合条件的元素
    for (var i = 0; i < tagname.length; i++) {     //遍历获得的元素
        if (tagname[i].className.indexOf(className)>=0){     //如果获得的元素中的class的值等于指定的类名，就赋值给tagnameAll
            tagnameAll[tagnameAll.length] = tagname[i];
        }
    }
    return tagnameAll;
}
window.onload=function(){//载入事件
    var btn=getClass('tab_btn');//获取按钮数组
    var div=getClass('tab_div');//获取div数组
    for(i=0;i<btn.length;i++){
        btn[i].onclick=function(){//按钮点击事件
            var index=(this.getAttribute('index')-0);//获取是第几个按钮按下
            if(btn[index].className.indexOf('curr_btn')>=0) return;//如果按下的按钮为当前选中的按钮则无反应
            for(i=0;i<btn.length;i++){
                if(index==i){
                    btn[i].className='tab_btn';
                    div[i].className='tab_div curr_div';
                }else{
                    btn[i].className='tab_btn';
                    div[i].className='tab_div';
                }
            }
        }
    }
};
//显示公司LOGO






//显示页面


