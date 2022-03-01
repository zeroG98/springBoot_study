<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- -------------------- header ------------------- -->
<%@include file="./inc/header.jsp" %>

<!-- -------------------- visual ------------------- -->    
<div id="demo" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ol>
  <!-- slideshow -->
  <div class="carousel-inner">
    <div class="carousel-item citem-01 active">
      <div class="carousel-caption d-none d-md-block">
        <h5>First slide label</h5>
        <p>Some representative placeholder content for the first slide.</p>
      </div>
    </div>
    <div class="carousel-item citem-02">      
      <div class="carousel-caption d-none d-md-block">
        <h5>Second slide label</h5>
        <p>Some representative placeholder content for the second slide.</p>
      </div>
    </div>
    
    <div class="carousel-item  citem-03">
      <div class="carousel-caption d-none d-md-block">
        <h5>Third slide label</h5>
        <p>Some representative placeholder content for the third slide.</p>
      </div>
    </div>
  </div> <!-- .carousel-inner -->
  
  <a class="carousel-control-prev" type="button" data-target="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  
  <a class="btn carousel-control-next" type="button" data-target="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>

<!-- -------------------- contents ------------------- -->
<div class="container mt-5">
	<div class="d-flex justify-content-between">
		<div class="card" style="width: 18rem;">
			<div style="width: 280px; height: 160px; paddng: 20px">이미지</div>
			<div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-primary">Go somewhere</a>
			</div>
		</div>
		<div class="card" style="width: 18rem;">
			<div style="width: 280px; height: 160px; paddng: 20px">이미지</div>
			<div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-primary">Go somewhere</a>
			</div>
		</div>
		<div class="card" style="width: 18rem;">
			<div style="width: 280px; height: 160px; paddng: 20px">이미지</div>
			<div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-primary">Go somewhere</a>
			</div>
		</div>
	</div>
</div>
<!-- -------------------- footer ------------------- -->
<%@include file="./inc/footer.jsp" %>


</body>
</html>