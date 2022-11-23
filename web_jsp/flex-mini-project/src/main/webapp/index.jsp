<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sanrio Home</title>
<link rel="stylesheet" href="css/index_style.css">
<style type="text/css">
a#kitty {
	display: inline-block;
	background: url('image/ch1-1.png') no-repeat;
}

a#kitty:hover {
	background: url('image/ch1-2.png') no-repeat;
}

a#my_melody {
	display: inline-block;
	background: url('image/ch2-1.png') no-repeat;
}

a#my_melody:hover {
	background: url('image/ch2-2.png') no-repeat;
}

a#kuromi {
	display: inline-block;
	background: url('image/ch3-1.png') no-repeat;
}

a#kuromi:hover {
	background: url('image/ch3-2.png') no-repeat;
}

a#pompompurin {
	display: inline-block;
	background: url('image/ch4-1.png') no-repeat;
}

a#pompompurin:hover {
	background: url('image/ch4-2.png') no-repeat;
}

a#cinnamoroll {
	display: inline-block;
	background: url('image/ch1-1.png') no-repeat;
}

a#cinnamoroll:hover {
	background: url('image/ch1-2.png') no-repeat;
}

a#my_melody {
	display: inline-block;
	background: url('image/ch2-1.png') no-repeat;
}

a#my_melody:hover {
	background: url('image/ch2-2.png') no-repeat;
}

a#kuromi {
	display: inline-block;
	background: url('image/ch3-1.png') no-repeat;
}

a#kuromi:hover {
	background: url('image/ch3-2.png') no-repeat;
}

a#pompompurin {
	display: inline-block;
	background: url('image/ch4-1.png') no-repeat;
}

a#pompompurin:hover {
	background: url('image/ch4-2.png') no-repeat;
}

a#cinnamoroll {
	display: inline-block;
	background: url('image/ch5-1.png') no-repeat;
}

a#cinnamoroll:hover {
	background: url('image/ch5-2.png') no-repeat;
}

a#little_twin_stars {
	display: inline-block;
	background: url('image/ch6-1.png') no-repeat;
}

a#little_twin_stars:hover {
	background: url('image/ch6-2.png') no-repeat;
}

a#pochacco {
	display: inline-block;
	background: url('image/ch7-1.png') no-repeat;
}

a#pochacco:hover {
	background: url('image/ch7-2.png') no-repeat;
}

a#kerokerokeroppi {
	display: inline-block;
	background: url('image/ch8-1.png') no-repeat;
}

a#kerokerokeroppi:hover {
	background: url('image/ch8-2.png') no-repeat;
}
#centerlogo {
	width: 200px;
	height: 50px;
	display: block;
	margin: auto;
	margin-bottom: 20px;
}
#centerkitty {
	width: 150px;
	height: 170px;
	display: block;
	margin: auto;
}

.recruit {
	background-image: url('image/bg1.png');
	background-position: center;
	background-size: cover;
	background-position: 30px 10px;
}
</style>
</head>
<body>

	<header>
		<img alt="logo" src="image/logo.png">
	</header>
	<section>

		<article class="main">
			<img alt="logo" src="image/main_visual_pc_v1.png">
		</article>
		.
		<article class="character">
			<p>CHARACTER</p>
			<div class="cha1">
				<div>
					<a href="hello_kitty.jsp" id="kitty"></a>
					<h3>헬로키티</h3>
					<h5>HELLO KITTY</h5>
				</div>
				<div>
					<a href="my_melody.jsp" id="my_melody"> </a>
					<h3>마이멜로디</h3>
					<h5>MY MELODY</h5>
				</div>
				<div>
					<a href="kuromi.jsp" id="kuromi"> </a>
					<h3>쿠로미</h3>
					<h5>KUROMI</h5>
				</div>
				<div>
					<a href="pompompurin.jsp" id="pompompurin"> </a>
					<h3>폼폼푸린</h3>
					<h5>POMPOMPURIN</h5>
				</div>
			</div>

			<div class="cha2">
				<div>
					<a href="cinnamoroll.jsp" id="cinnamoroll"> </a>
					<h3>시나몰롤</h3>
					<h5>CINNAMOROLL</h5>

				</div>
				<div>
					<a href="little_twin_stars.jsp" id="little_twin_stars"> </a>
					<h3>리틀트윈스타</h3>
					<h5>LITTLE TWIN STARS</h5>

				</div>
				<div>
					<a href="pochacco.jsp" id="pochacco"> </a>
					<h3>포차코</h3>
					<h5>POCHACCO</h5>

				</div>
				<div>
					<a href="kerokerokeroppi.jsp" id="kerokerokeroppi"> </a>
					<h3>케로케로피</h3>
					<h5>KEROKEROKEROPPI</h5>

				</div>
			</div>
		</article>

<img alt="" src="image/logo_w.png" id="centerlogo">
		<img alt="" src="image/contact_img.png" id="centerkitty">

		<article class="company">
			<p>COMPANY</p>
			<div class="com">
				<div>
					<img alt="" src="image/ico_company1.png">
					<h3>회사소개</h3>
					<p>
						맑고 깨끗한 강가에<br> 문화를 쌓아 올리자.
					</p>
					<button>more</button>
				</div>
				<div>
					<img alt="" src="image/ico_company2.png">
					<h3>회사연혁</h3>
					<p>
						산리오의 히스토리를<br>확인하세요.
					</p>
					<button ontc>more</button>
				</div>
				<div>
					<img alt="" src="image/ico_company3.png">
					<h3>사업영역</h3>
					<p>
						소셜 커뮤니케이션을<br>산리오가 시작합니다.
					</p>
					<button>more</button>
				</div>
			</div>
		</article>

		<article class="recruit">
			<p>RECRUIT</p>
			<div class="rec">
				<div>
					<img alt="" src="image/ico_recruit1.png">
					<h3>채용공고</h3>
					<p>
						산리오코리아에서<br> 인재를 찾습니다
					</p>
					<button>more</button>
				</div>
				<div>
					<img alt="" src="image/ico_recruit2.png">
					<h3>직무소개</h3>
					<p>
						산리오코리아에서는<br>어떤 일을 할까요?
					</p>
					<button ontc>more</button>
				</div>
				<div>
					<img alt="" src="image/ico_recruit3.png">
					<h3>복리후생</h3>
					<p>
						산리오코리아에서<br>누릴 수 있는 것!
					</p>
					<button>more</button>
				</div>
			</div>
		</article>

		<img alt="" src="image/banner.jpg">



	</section>

	<footer>
		㈜산리오코리아 대표 : 키요시 사이토, 사업자등록번호 : 214-86-24755, Tel : 02-543-3810 <br>
		ADD : 서울시 강남구 테헤란로 509, 4층 (삼성동, 엔씨타워1),
		E-MAIL:webmaster@sanriokorea.co.kr<br> <img alt=""
			src="image/copyright.png">
	</footer>

</body>
</html>