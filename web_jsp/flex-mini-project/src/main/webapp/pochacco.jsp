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
	background-color: #d5f3ef;
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
	color: #4ec3bb;
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
	color: #4ec3bb;
	padding-left: 20px;
	padding-right: 20px;
	padding-top: 5px;
	padding-bottom: 5px;
	border-radius: 15px;
	border: 2px solid #4ec3bb;
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
		<p id="name">POCHACCO</p>
		<img alt="" src="image/pochacco.png">
		<h1>[ 포차코 ]</h1>
		<div class="birth">
			<button>생일</button>
			<p>2월 29일 (윤년생)</p>
		</div>

		<p id="info">호기심 많은 참견쟁이로 산책을 좋아하는 남자 강아지예요. '둥실둥실 마을'의 변두리에 있는
			꾀꼬리 마을에서 태어났어요. 키는 가장 좋아하는 바나나 아이스크림의 라지 사이즈 컵 4개 정도이며, 체중은 마을의 밭에 있는
			도깨비 당근 3개 정도의 무게랍니다. 좋아하는 꽃은 연화초이며 주변에 친구들도 많은 아이예요.</p>

	</section>

</body>
</html>