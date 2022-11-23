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
	font-family: Arial, Helvetica;
}

header {
	background-color: #555;
	padding: 30px;
	text-align: center;
	font-size: 30px;
	color: white;
}

section {
	display: flex;
	background: #CA5EFF
}

nav {
	flex: 1;
	padding: 20px;
}

nav ul {
	list-style: none;
	padding: 0;
}

article {
	flex: 3;
	padding: 20px;
}

footer {
	padding: 30px;
	background-color: #555;
	text-align: center;
	color: white;
}

a:link {
	color: white;
	text-decoration: none;
}

a:visited {
	color: white;
	text-decoration: none;
}

a:hover {
	color: blue;
	text-decoration: underline;
}
</style>
</head>
<body>
	<header>First JSP Web</header>

	<section>
		<nav>
			<ul>
				<li><a href="#">홈</a></li>
				<li><a href="home.jsp">구독화면</a></li>
				<li><a href="form_row.jsp">flex form</a></li>
				<li><a href="layout_1.jsp">레이아웃 화면1</a></li>
				<li><a href="layout_2.jsp">플렉스 센터</a></li>
				<li><a href="layout_3.jsp?age=10&name=이지은">레아이웃 화면3</a></li>
			</ul>
		</nav>

		<article>
			<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
				Maxime mollitia, molestiae quas vel sint commodi repudiandae
				consequuntur voluptatum laborum numquam blanditiis harum quisquam
				eius sed odit fugiat iusto fuga praesentium optio, eaque rerum!
				Provident similique accusantium nemo autem. Veritatis obcaecati
				tenetur iure eius earum ut molestias architecto voluptate aliquam
				nihil, eveniet aliquid culpa officia aut! Impedit sit sunt quaerat,
				odit, tenetur error, harum nesciunt ipsum debitis quas aliquid.
				Reprehenderit, quia. Quo neque error repudiandae fuga? Ipsa
				laudantium molestias eos sapiente officiis modi at sunt excepturi
				expedita sint? Sed quibusdam recusandae alias error harum maxime
				adipisci amet laborum. Perspiciatis minima nesciunt dolorem!
				Officiis iure rerum voluptates a cumque velit quibusdam sed amet
				tempora. Sit laborum ab, eius fugit doloribus tenetur fugiat,
				temporibus enim commodi iusto libero magni deleniti quod quam
				consequuntur! Commodi minima excepturi repudiandae velit hic maxime
				doloremque. Quaerat provident commodi consectetur veniam similique
				ad earum omnis ipsum saepe, voluptas, hic voluptates pariatur est
				explicabo fugiat, dolorum eligendi quam cupiditate excepturi
				mollitia maiores labore suscipit quas? Nulla, placeat. Voluptatem
				quaerat non architecto ab laudantium modi minima sunt esse
				temporibus sint culpa, recusandae aliquam numquam totam ratione
				voluptas quod exercitationem fuga. Possimus quis earum veniam quasi
				aliquam eligendi, placeat qui corporis!</p>
		</article>
	</section>

	<footer>footer</footer>

</body>
</html>