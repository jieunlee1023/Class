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
	background-color: #fde8e7;
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
	color: red;
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
	color: #ffa79e;
	padding-left: 20px;
	padding-right: 20px;
	padding-top: 5px;
	padding-bottom: 5px;
	border-radius: 15px;
	border: 2px solid #ffa79e;
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
		<p id="name">HELLO KITTY</p>
		<img alt="" src="image/hellokitty_v1.png">
		<h1>[ 헬로키티 ]</h1>
		<div class="birth">
			<button>생일</button>
			<p>11월 1일</p>
		</div>

		<p id="info">사과 5개를 쌓은 높이의 키와, 사과 3개 정도의 몸무게가 나가는 헬로키티는 밝고 상냥한
			여자아이예요. 쿠키를 만들고 피아노 치는 것을 가장 좋아하며, 피아니스트와 시인이 되는 것이 꿈이에요. 특기는 음악과 영어.
			좋아하는 음식은 엄마가 만들어준 애플 파이. 쌍둥이 동생 미미와 가장 친하답니다.</p>

	</section>

</body>
</html>