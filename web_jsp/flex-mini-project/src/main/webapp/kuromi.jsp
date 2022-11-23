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
	background-color: #ebebeb;
}

section {
	padding-left: 200px;
	padding-right: 200px;
	padding-top: 60px;
	display: flex;
	flex-direction: column;
	justify-content: center;
}

section #name {
	display: flex;
	justify-content: center;
	font-size: 50px;
	font-weight: bold;
	color: #a69bdd;
	border: 10px dotted grey;
	border-radius: 50px;
	margin-bottom: 50px;
	font-size: 50px;
}

section img {
	margin-bottom: 30px;
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
	color: grey;
	padding-left: 20px;
	padding-right: 20px;
	padding-top: 5px;
	padding-bottom: 5px;
	border-radius: 15px;
	border: 2px solid grey;
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
		<p id="name">KUROMI</p>
		<img alt="" src="image/kuromi.png">
		<h1>[ 쿠로미 ]</h1>
		<div class="birth">
			<button>생일</button>
			<p>10월 31일 (할로윈)</p>
		</div>

		<p id="info">자칭 마이멜로디의 라이벌인 쿠로미. 난폭하게 보일 때도 있지만 사실은 아주 여성스러운
			타입이지요!? 검은색 두건과 핑크색 해골이 포인트랍니다. 취미는 일기 쓰기. 잘생긴 남자 애를 좋아하고 최근에는 연애 소설에
			빠져있어요. 좋아하는 색은 검은색이고 좋아하는 음식은 락교예요.</p>

	</section>

</body>
</html>