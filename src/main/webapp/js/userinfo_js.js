$(function () {
    $("#toudixiangNav div").click(function () {
        $(this).css("border-bottom","2px solid #00a57f");
        $(this).siblings().css("border-bottom","");
    });
    $("#toudixiangNav a").hover(function () {
        $(this).css("color","#00a57f");
    },function () {
        $(this).css("color","");
    });
    //左侧导航栏背景颜色
    $("#aside ul li").click(function () {
        $(this).css("background-color","#b1dfbb");
        $(this).siblings().css("background-color","");
    });

    //点击编辑，显示编辑页面
    $("#bianji").click(function () {
        $("#hadinfo").hide();
        $("#userform").show();
    });
    //点击左侧导航，更换右侧页面
    var temp = "none";
    $("#li-one").click(function () {
        openMatter(1);
        $("#hadinfo").show();
        $("#userform").hide();
    });
    $("#li-two").click(function () {
        openMatter(2);
    });
    $("#li-three").click(function () {
        openMatter(3);
    });
    $("#li-four").click(function () {
        openMatter(4);
    });
    $("#li-five").click(function () {
        openMatter(5);
    });
    function openMatter(obj) {
        for (var i = 1; i < 6; i++) {
            if (i == obj) {
                temp = "block";
            } else {
                temp = "none";
            }
            document.getElementById("matter" + i).style.display = temp;

        }
    };

    //点击简历状态，更换下面页面
    var state = "none";
    $("#maxA1").click(function () {
        openMax(1);
    });
    $("#maxA2").click(function () {
        openMax(2);
    });
    $("#maxA3").click(function () {
        openMax(3);
    });
    $("#maxA4").click(function () {
        openMax(4);
    });
    $("#maxA5").click(function () {
        openMax(5);
    });
    $("#maxA6").click(function () {
        openMax(6);
    });
    function openMax(obj) {
        for (var i = 1; i < 7; i++) {
            if (i == obj) {
                state = "block";
            } else {
                state = "none";
            }
            document.getElementById("max" + i).style.display = state;

        }
    };
    //
    $("#jianliBTN1").click(function () {
        $("#jianli1").hide();
        $("#jianli2").show();
    });
    //
    $("#jianliBTN2").click(function () {
        $("#jianli2").hide();
        $("#jianli1").show();
    });









})