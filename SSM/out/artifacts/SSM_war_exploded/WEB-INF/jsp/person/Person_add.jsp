<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html >
<
<link rel="stylesheet" href="../js/css/bootstrap.min.css">
<link rel="stylesheet" href="../js/css/bootstrap-theme.css">
<script type="text/javascript">

        
        
</script>
<div class="container">
<form name="itemsForm"  action="savePerson.action"  method="post">
商品名称：

<hr>


                <div class="form-group">
                pName<input name="personCustom.pname" class="form-control" size="20" placeholder="please input you chinese name"/>
                </div>
                pType<input  name="personCustom.ptype"  />
                pComp<input  name="personCustom.pcomp"  />
                passWord<input  name="personCustom.password"  />
                userName<input  name="personCustom.username"  />
                phone<input  name="personCustom.phone"  />
                telephone<input  name="personCustom.telephone"  />
                scope<input  name="personCustom.scope"  />
                entrytime<input  name="personCustom.entrytime"  />
                leavetime<input  name="personCustom.leavetime"  />
                projectname<input  name="personCustom.projectname"  />
                officeaddress<input  name="personCustom.officeaddress"  />
                teminalip<input  name="personCustom.teminalip"  />
                servicedep<input  name="personCustom.servicedep"  />

        <button type="submit" value="">提交</button>
</form>

</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
