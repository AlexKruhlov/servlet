<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br> [All with dot]
	<br> The name of the person is ${person.name}
	<br> The breed of the person's dog is ${person.dog.breed}
	<br>
	<br> [All with "[]"]
	<br> The name of the person is ${person.name}
	<br> The breed of the person's dog is ${person["dog"]["breed"]}
	<br>
	<br> [List]
	<br> This person has such ids as ${person.ids}
	<br> The first and main id is ${person["ids"][0]}
	<br>
	<br> [Map]
	<br> This person has also a couple of cars.
	<br> The BMW has the ${person["carColor"]["BMW"]} color
	<br> The Mercedes has the ${person["carColor"]["MERCEDES"]} color
	<br>
	<br> [Header information]
	<br> Current header host: ${header.host}
	<br>
	<br> [Method type]
	<br> Current request method type: ${pageContext.request.method}
</body>
</html>
