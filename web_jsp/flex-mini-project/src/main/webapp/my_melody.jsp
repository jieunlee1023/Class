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
	background-color: #ffe7f2;
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
	color: pink;
	border: 10px dotted #bc794a;
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
		<p id="name">MY MELODY</p>
		<img alt="" src="image/n_mymelody.png">
		<h1>[ 마이멜로디 ]</h1>
		<div class="birth">
			<button>생일</button>
			<p>1월 18일</p>
		</div>

		<p id="info">마이멜로디는 밝고 명랑하며 남동생을 아끼는 여자아이예요. 마이멜로디의 보물은 할머니가 만들어준
			귀여운 두건이랍니다. 좋아하는 음식은 아몬드파운드 케이크고, 엄마와 함께 쿠키 굽는 것을 좋아해요.</p>

	</section>

</body>
</html>