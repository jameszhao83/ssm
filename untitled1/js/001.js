/**
 * Created by jms on 2018/4/12.
 */
$(function () {
    $("#dvinput").hide();
    $("#myModal").hide();
    $("#closewindow").click(function () {
        $("#myModal").hide();
    });
    $("#kuozhan").click(function () {


        if( $("#kuozhan").val() == "∧"){
            $("#kuozhan").val("∨");
            $("#dvinput").show();
        }else{
            $("#kuozhan").val("∧");
            $("#dvinput").hide();
        }
    });
    $("#closewindows").click(function () {
        $("#myModal").hide();
    });

//打开新增窗口
    $("#btn").click(function () {
        $("#workname").val("");
        $("#zrr").val("");
        $("#fromstarttime").val("");
        $("#fromendtime").val("");
        $("#myModal").show();
    });
//保存
    $("#saveWork").click(function () {

        alert($("#updateflag").val());
        var workname=$("#workname").val();
        var zrr=$("#zrr").val();
        var fromstarttime=$("#fromstarttime").val();
        var fromendtime=$("#fromendtime").val();
        $("<tr><td><input type='checkbox'></td><td>*</td><td>"+workname+"</td><td>"+fromstarttime+"</td><td>"+fromendtime+"</td><td>"+zrr+"</td><td></td></tr>").appendTo("#tbodyb");
        $("#myModal").hide();
        $("#updateflag").val("0");

    });
    //修改
    $("#btupdate").click(function () {
        $("#updateflag").val("1");
        var alength=$("#tbodyb").find("input").length;
        var blength=$("#tbodyb :checked").length;
        var b=$("#tbodyb :checked");
        if(blength>1){
            alert("修改时只能选择1项");
        }else  if(blength == 1){
            var a=b.parent().parent().children("td:nth-child(3)").text();
            var starttime=b.parent().parent().children("td:nth-child(4)").text();
            var endtime=b.parent().parent().children("td:nth-child(5)").text();
            var q=b.parent().parent().children("td:nth-child(6)").text();
            $("#workname").val(a);
            $("#zrr").val(q);
            $("#fromstarttime").val(starttime);
            $("#fromendtime").val(endtime);
            $("#myModal").show();
        }else{
            alert("请选择");
        }
    });
//删除
    $("#btdelete").click(function () {
        var alength=$("#tbodyb").find("input").length;
        var blength=$("#tbodyb :checked").length;
        var b=$("#tbodyb :checked");
        if (blength>1){
            $("#tbodyb :checked").each(function (index,item) {
                $(this).parent().parent().remove();
            });
        }
        else  if (blength == 1){
            b.parent().parent().remove();
        }else{
            alert("请选择");
        }
    });
//信息复制
    $("#btcopy").click(function () {
        var alength=$("#tbodyb").find("input").length;
        var blength=$("#tbodyb :checked").length;
        var b=$("#tbodyb :checked");
        if(blength>1){
            alert("修改时只能选择1项");
        }else if(blength == 1){
            var a=b.parent().parent().children("td:nth-child(3)").text();
            var starttime=b.parent().parent().children("td:nth-child(4)").text();
            var endtime=b.parent().parent().children("td:nth-child(5)").text();
            var q=b.parent().parent().children("td:nth-child(6)").text();
            $("<tr><td><input type='checkbox'></td><td>*</td><td>"+a+"</td><td>"+starttime+"</td><td>"+endtime+"</td><td>"+q+"</td><td></td></tr>").appendTo("#tbodyb");                }else{
                alert("请选择");
        }
    });
//绑定时间选择控件
    $(".starttim").datetimepicker({
        format:"yyyy-mm-dd hh:ii"
    });
    $(".endtim").datetimepicker({
        format:"yyyy-mm-dd hh:ii"
    });

    $("#fromstarttime").datetimepicker({
        format:"yyyy-mm-dd hh:ii"
    });
    $("#fromendtime").datetimepicker({
        format:"yyyy-mm-dd hh:ii"
    });
//自动生成多条记录
    $("#geren").click(function () {
        var alength=$("#tbodyb").find("input").length;
        var blength=$("#tbodyb :checked").length;
        var b=$("#tbodyb :checked");
        if (blength>1){
            alert("只能选择一条");
        }
        else  if (blength == 1){

            var startdate=$(".starttim").val();
            var enddate=$(".endtim").val();
            var date=new Date(startdate);
            var dateb=new Date(enddate);

            var mday=Math.floor((dateb.valueOf()-date.valueOf())/1000/60/60/24+1);
            for(var i=0;i<mday;i++){

                if (date.getDay() == 0 || date.getDay() == 6){
                    date.setDate(date.getDate()+1);
                    dateb.setDate(date.getDate());
                    dateb.setMonth(date.getMonth());
                }else{
                    var workname=b.parent().parent().children("td:nth-child(3)").text();
                    var zrr=b.parent().parent().children("td:nth-child(6)").text();


                    $("<tr><td><input type='checkbox'></td><td>*</td><td>"+workname+"</td><td>"+date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getSeconds()+"</td><td>"+dateb.getFullYear()+"-"+(dateb.getMonth()+1)+"-"+dateb.getDate()+" "+dateb.getHours()+":"+dateb.getSeconds()+"</td><td>"+zrr+"</td></tr>").appendTo("#tbodyb");
                    date.setDate(date.getDate()+1);
                    dateb.setDate(date.getDate());
                    dateb.setMonth(date.getMonth());
                }
            }
        }else{
            alert("请选择");
        }
    });
    
    $("#savegeren").click(function () {
        alert("savegeren");
    });

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
});