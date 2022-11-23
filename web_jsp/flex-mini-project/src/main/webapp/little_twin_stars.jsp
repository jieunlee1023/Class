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
	background-color: #dedef8;
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
	color: #c1bbf7;
	border: 10px dotted #a79ee4;
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
	color: #c1bbf7;
	padding-left: 20px;
	padding-right: 20px;
	padding-top: 5px;
	padding-bottom: 5px;
	border-radius: 15px;
	border: 2px solid #c1bbf7;
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
		<p id="name">LittleTwinStars</p>
		<img alt="" src="image/n_twinstars.png">
		<h1>[ 리틀트윈스타 ]</h1>
		<div class="birth">
			<button>생일</button>
			<p>12월 24일</p>
		</div>

		<p id="info">리틀트윈스타는 꿈별구름의 '배려하기 별'에서 태어난 쌍둥이 형제 별이에요. 훌륭하게 빛나는 별이
			되기 위해 먼 나라에서 왔지요. 누나인 라라는 겁이 많고 가끔 울보가 되기도 해요. 그림 그리고 시 쓰는 걸 좋아하며 특기는
			요리예요! 동생인 키키는 호기심 많은 말썽꾸러기이고 별 낚시와 발명을 매우 좋아한답니다.</p>

	</section>

</body>
</html>