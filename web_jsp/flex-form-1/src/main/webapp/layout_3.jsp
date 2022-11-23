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
}

body {
	background-color: #aaa;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

h1, h2, h3, h4, h5, h6 {
	margin: 0;
}

section {
	width: 1000px;
	margin: 40px;
	padding: 20px;
	display: flex;
}

article.content {
	display: flex;
	flex-direction: column;
	flex-wrap: wrap;
	background-color: orange;
	padding: 20px;
	flex: 1;
}

article.sub {
	display: flex;
	flex-direction: column;
	flex: 1;
}

.sub1 {
	flex: 1;
	background-color: green;
	padding: 20px;
}

.sub2 {
	flex: 1;
	background-color: lime;
	padding: 20px;
}
</style>
</head>
<body>

	<%
	String age = request.getParameter("age");
	String name = request.getParameter("name");
	%>

	<section>
		<article class="content">
			<h2>Content1</h2>
			<h2>
				너의 나이는
				<%=age%></h2>
			<p>Lorem Ipsum is simply dummy text of the printing and
				typesetting industry. Lorem Ipsum has been the industry's standard
				dummy text ever since the 1500s, when an unknown printer took a
				galley of type and scrambled it to make a type specimen book. It has
				survived not only five centuries, but also the leap into electronic
				typesetting, remaining essentially unchanged. It was popularised in
				the 1960s with the release of Letraset sheets containing Lorem Ipsum
				passages, and more recently with desktop publishing software like
				Aldus PageMaker including versions of Lorem Ipsum.Lorem ipsum dolor
				sit amet consectetur adipisicing elit. Maxime mollitia, molestiae
				quas vel sint commodi repudiandae consequuntur voluptatum laborum
				numquam blanditiis harum quisquam eius sed odit fugiat iusto fuga
				praesentium optio, eaque rerum! Provident similique accusantium nemo
				autem. Veritatis obcaecati tenetur iure eius earum ut molestias
				architecto voluptate aliquam nihil, eveniet aliquid culpa officia
				aut! Impedit sit sunt quaerat, odit, tenetur error, harum nesciunt
				ipsum debitis quas aliquid. Reprehenderit, quia. Quo neque error
				repudiandae fuga? Ipsa laudantium molestias eos sapiente officiis
				modi at sunt excepturi expedita sint? Sed quibusdam recusandae alias
				error harum maxime adipisci amet laborum. Perspiciatis minima
				nesciunt dolorem! Officiis iure rerum voluptates a cumque velit
				quibusdam sed amet tempora. Sit laborum ab, eius fugit doloribus
				tenetur fugiat, temporibus enim commodi iusto libero magni deleniti
				quod quam consequuntur! Commodi minima excepturi repudiandae velit
				hic maxime doloremque. Quaerat provident commodi consectetur veniam
				similique ad earum omnis ipsum saepe, voluptas, hic voluptates
				pariatur est explicabo fugiat, dolorum eligendi quam cupiditate
				excepturi mollitia maiores labore suscipit quas? Nulla, placeat.
				Voluptatem quaerat non architecto ab laudantium modi minima sunt
				esse temporibus sint culpa, recusandae aliquam numquam totam ratione
				voluptas quod exercitationem fuga. Possimus quis earum veniam quasi
				aliquam eligendi, placeat qui corporis!</p>
		</article>
		<article class="sub">
			<article class="sub1">
				<h2>Sub1</h2>
				<h2>
					너의 이름은
					<%=name%></h2>
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry.</p>
			</article>
			<article class="sub2">
				<h2>Sub2</h2>
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry.</p>
			</article>

		</article>


	</section>

</body>
</html>