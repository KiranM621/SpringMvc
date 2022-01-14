
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<%-- <%

String name = (String)request.getAttribute("name");

%> --%>

<h2>About Page</h2>
<h2>Name Is ${name }</h2>
 <c:forEach var = "friends" items = "${friends}">
 	<h2>${friends}</h2>
 </c:forEach>
</body>
</html>
