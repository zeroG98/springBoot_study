<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!-- -------------------- header ------------------- -->
<tiles:insertAttribute name="header"/>



<!-- -------------------- visual ------------------- -->
<tiles:insertAttribute name="visual"/>


<div class="container d-flex mt-5">
<!-- -------------------- aside ------------------- -->
<tiles:insertAttribute name="aside"/>



<!-- -------------------- contents ------------------- -->
<tiles:insertAttribute name="contents"/>

</div>	
<!-- -------------------- footer ------------------- -->
<tiles:insertAttribute name="footer"/>
</body>
</html>