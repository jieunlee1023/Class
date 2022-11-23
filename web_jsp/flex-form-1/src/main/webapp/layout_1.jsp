<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	background-color: #f2f2f2;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

h1, h2, h3, h4, h5, h6 {
	margin: 0;
}

section {
	width: 1300px;
	margin: 40px 20px;
	padding: 20px;
	display: flex;
}

article.main {
	display: flex;
	flex: 3;
	order: 2;
	flex-direction: column;
}

article.side1 {
	flex: 1;
	order: 1;
}

article.side2 {
	flex: 1;
	order: 3;
	text-align: right;
}
</style>


</head>


<body>
	<section>
		<article class="main">
			<img alt="main_img" src="image/main_img.jpg">
			<h2>Main Content</h2>
			<p>Why do we use it? It is a long established fact that a reader
				will be distracted by the readable content of a page when looking at
				its layout.</p>
		</article>

		<article class="side1">
			<h2>Side Content1</h2>
			<p>Why do we use it? It is a long established fact that a reader
				will be distracted by the readable content of a page when looking at
				its layout.</p>
		</article>
		<article class="side2">
			<h2>Side Content2</h2>
			<p>Why do we use it? It is a long established fact that a reader
				will be distracted by the readable content of a page when looking at
				its layout.</p>
		</article>
	</section>

</body>
</html>