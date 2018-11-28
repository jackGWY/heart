<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <title>心管家</title>
</head>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js" type="text/javascript" charset="utf-8" ></script>
<style>
    .clearfix:after{
        content: '';
        display: block;
        height: 0px;
        clear:both;
        overflow: hidden;
    }
    li{
        list-style: none;
        float: left;
        width: 80px;
        height: 20px;
        padding: 10px;
        margin-left: 5px;
        text-align: center;
    }
    ul{
        position: relative;
    }
    ul:hover{
        cursor: pointer;
    }
    ul> div>a{
        content: '';
        position: absolute;
        top:45px;
        left:45px;
        width: 100px;
        height: 3px;
        background: green;
        transition: left .2s linear;
    }
</style>

<body>
<%--<nav>--%>
    <%--<a href="https://www.baidu.com">Home</a>--%>
    <%--<a href="https://developers.weixin.qq.com/">Test1</a>--%>
    <%--<a href="https://developers.weixin.qq.com/">Test2</a>--%>
<%--</nav>--%>
<%--<h2><a href="/heart/drug/getDrugInfo">点---abc---击</a></h2>--%>

<ul class="clearfix">
    <li>首页</li>
    <li>新闻</li>
    <li>资讯</li>
    <li>活动信息</li>
    <div>
        <a href="#"></a>
    </div>
</ul>
<script>
    $(function(){
        console.log($('li').length)
        for (var i = 0; i < $('li').length; i++) {
            (function(i){
                $('li').eq(i).hover(function(){
                    console.log(i)
                    if (i == 0) {
                        $('ul>div>a').eq(0).css('left',45)
                    }else {
                        $('ul>div>a').eq(0).css('left',45+i*105)
                    }

                })
            })(i)

        }
    })
</script>

</body>
</html>
