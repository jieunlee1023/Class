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
	background-color: #fff6cd;
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
	color: #f8b802;
	border: 10px dotted #662f2f;
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
	color: #f8b802;
	padding-left: 20px;
	padding-right: 20px;
	padding-top: 5px;
	padding-bottom: 5px;
	border-radius: 15px;
	border: 2px solid #f8b802;
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
		<p id="name">POMPOMPURIN</p>
		<img alt="" src="image/n_pompompurin.png">
		<h1>[ 폼폼푸린 ]</h1>
		<div class="birth">
			<button>생일</button>
			<p>4월 16일 날씨가 좋은 날</p>
		</div>

		<p id="info">폼폼푸린은 짙은 갈색의 베레모가 트레이드마크인 골든리트리버랍니다. 좋아하는 말은 '외출'이고
			싫어하는 말은 '혼자 집 지키기'이지요. 취미는 신발 모으기로 주인인 아빠의 가죽 신발, 엄마의 샌들을 한 짝씩 몰래 숨겨
			둔답니다. 우유와 푹신푹신한 팬케이크, 엄마가 만들어주는 푸딩을 가장 좋아해요. 특기는 낮잠과 푸딩 체조예요. 누구와도 잘
			친해지며, 주인 누나의 집 현관에 있는 푸린용 바구니에 살고 있어요. 푸린의 꿈은 점점 더 커지는 것이라고 하네요.</p>

	</section>

</body>
</html>