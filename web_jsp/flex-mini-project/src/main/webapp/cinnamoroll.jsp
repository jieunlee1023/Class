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
	background-color: #c9eeff;
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
	color: #be926e;
	border: 10px dotted #3bbff3;
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
	color: #3bbff3;
	padding-left: 20px;
	padding-right: 20px;
	padding-top: 5px;
	padding-bottom: 5px;
	border-radius: 15px;
	border: 2px solid #3bbff3;
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
		<p id="name">CINNAMOROLL</p>
		<img alt="" src="image/m_cinnamo.png">
		<h1>[ 시나모롤 ]</h1>
		<div class="birth">
			<button>생일</button>
			<p>3월 6일</p>
		</div>

		<p id="info">시나모롤은 먼 하늘 구름 위에서 태어난 강아지예요. 어느 날 하늘에서 하늘하늘 날아오던
			시나모롤을 '카페 시나몬'의 주인 누나가 발견해 함께 살게 되었어요. 꼬리가 마치 시나몬롤처럼 돌돌 말려있어서
			'시나몬'이라고 이름이 붙여졌어요. 지금은 카페를 대표하는 간판 강아지로 활약 중이지요! 특기는 큰 귀를 파닥파닥 해서
			하늘을 나는 일! 얌전하지만 붙임성이 좋아 손님들의 무릎 위에서 자버리기도 한답니다.</p>

	</section>

</body>
</html>