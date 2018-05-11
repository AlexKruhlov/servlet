<html>
<body>
	<div>
		The name is:
		<jsp:useBean id="person" class="com.example.noscripting.model.Person" scope="request" />
		<jsp:getProperty name="person" property="name"/>
	</div>
</body>
</html>
