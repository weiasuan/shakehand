$(function () {
    $(".go_res").click(function () {
        $("#login").hide();
        $("#home").show();
    });
    $(".go_master").click(function () {
        $("#login").hide();
        $("#login_master").show();
    });
    $(".go_people").click(function () {
        $("#login_master").hide();
        $("#login").show();
    });
    $(".peo_go").click(function () {
        $("#home").hide();
        $("#find_job").show();
    });
    $(".want_people").click(function () {
        $("#find_job").hide();
        $("#find_peoper").show();
    });
    $(".want_login").click(function () {
        $("#find_job").hide();
        $("#login").show();
    });
    $(".want_job").click(function () {
        $("#find_peoper").hide();
        $("#find_job").show();
    });
    $(".go_company").click(function () {
        $("#home").hide();
        $("#find_peoper").show();
    });
});


<!--判断登录手机号-->
$(function () {
    $("input[name='tel']").keyup(function () {
        if ($(this).next().prop("tagName") == "SPAN") {
            $(this).next().remove();
        }
        var str = $(this).val();
        var regStr = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
        if (!regStr.test(str)) {
            var $error = $('<span class="error">请输入正确的手机号</span>');
            $(this).after($error);
        }
    });
});

<!--登录密码-->
$(function () {
    $("input[name='text']").keyup(function () {
        if($(this).next().prop("tagName")=="SPAN"){
            $(this).next().remove();
        }
        var str=$(this).val();
        if(str.length!=6){
            var $error=$('<span class="error">请输入正确的密码</span>');
            $(this).after($error);
        }
    })
});

<!-- 判断注册手机号-->
$(function () {
    $("input[name='phone_num']").keyup(function () {
        if ($(this).next().prop("tagName") == "DIV") {
            $(this).next().remove();
        }
        var str = $(this).val();
        var regStr = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
        if (!regStr.test(str)) {
            var $error = $('<div class="re_phone">请输入正确的手机号</div>');
            $(this).after($error);
        }
    });
});

<!--注册验证码-->
$(function () {
    $("input[name='back_phone']").keyup(function () {
        if($(this).next().next().prop("tagName")=="DIV"){
            $(this).next().next().remove();
        }
        var str=$(this).val();
        if(str.length!=6){
            var $error=$('<div class="back_phone">请输入正确的验证码</div>');
            $(this).next().after($error);
        }
    })
});



