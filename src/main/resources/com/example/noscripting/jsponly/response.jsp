<html>
<body>
	<div>
		The name is:
		<jsp:useBean id="person"
			class="com.example.noscripting.jsponly.model.Person">
			<jsp:setProperty name="person" property="*" />
		</jsp:useBean>
		<jsp:getProperty name="person" property="name" />
	</div>
</body>
</html>
