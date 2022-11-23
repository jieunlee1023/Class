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
	margin: 0;
	background-color: #e2f7ac;
}

section {
	padding-left: 200px;
	padding-right: 200px;
	padding-top: 80px;
	display: flex;
	flex-direction: column;
	justify-content: center;
}

section #name {
	display: flex;
	justify-content: center;
	font-size: 50px;
	font-weight: bold;
	color: #00985a;
	border: 10px dotted black;
	border-radius: 50px;
	margin-bottom: 50px;
	font-size: 50px;
}

section img {
	margin-bottom: 50px;
}

section h1 {
	color: black;
	margin-bottom: 10px;
}

section .birth {
	display: flex;
	flex-direction: row;
	align-items: center;
	margin-bottom: 10px;
	'
}

section .birth button {
	font-size: 12px;
	font-weight: bold;
	color: #00985a;
	padding-left: 20px;
	padding-right: 20px;
	padding-top: 5px;
	padding-bottom: 5px;
	border-radius: 15px;
	border: 2px solid #00985a;
	font-size: 12px;
	margin-right: 10px;
}

section #info {
	font-size: 15px;
		margin-bottom: 100px;
}
</style>


</head>


<body>
	<section>
		<p id="name">KEROKEROKEROPPI</p>
		<img alt="" src="image/n_kero.png">
		<h1>[ 케로케로케로피 ]</h1>
		<div class="birth">
			<button>생일</button>
			<p>7월 10일</p>
		</div>

		<p id="info">케로케로케로피는 모험을 좋아하며 활기찬 성격의 도넛 연못의 인기 스타예요! 노래를 잘 부르고,
			개구리 수영은 잘 못하지만, 크롤 수영은 특기랍니다. 도너츠 연못의 케로케로하우스가 케로피의 집이랍니다.</p>

	</section>

</body>
</html>