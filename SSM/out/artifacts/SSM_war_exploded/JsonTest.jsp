<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<h1>this is items insert page</h1>
this is items insert page

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script  type="text/javascript">
        function jsonResponse() {
                $.ajax({
                    type:'post',
                    url:'jsonResponse.action',
                    contentType:'application/json;charset=utf-8',
                    data:'{"id":"5","name":"ophone","detail":"3rere","price":"32.2","createTime":"2012-01-01 21:21:21"}',
                    success:function (data){
                        alert(data)
                    }
                });
        }
        function jsonRequest() {

        }

</script>

外面
<input type="button" onclick="jsonResponse()" value="jsonResponse">
<input type="button" onclick="jsonRequest()" value="jsonRequest">
</form>
</html>
