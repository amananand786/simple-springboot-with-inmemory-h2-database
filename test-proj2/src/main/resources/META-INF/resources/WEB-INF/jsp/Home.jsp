<%@page import="java.util.*" %>
<%@page import="com.example.testproj.model.Employee" %>
<html>
<title>
Home
</title><body BGCOLOR=CYAN>
<div>
	<h1 align=center>
	Welcome to Home-page
	</h1>
	<form action="saveEmployee2" align=center>
		Name: <input type="text" name="name" required /><br/>
		Department:<input type="text" name="dept" required/><br/>
		Salary:<input type="text" name="salary" required/><br/>
		<button type="submit">Save Entry</button>
	</form>
</div>

<div>
<table border="1" align=center>
<tr><th>Id</th><th>Name</th><th>Department</th><th>Salary</th></tr>
<%ArrayList<Employee> al=(ArrayList<Employee>)request.getAttribute("alldata"); 
for(Employee d:al)
{%>
	<tr>
		<td><%=d.getId() %></td>
		<td><%=d.getName() %></td>
		<td><%=d.getDept() %></td>
		<td><%=d.getSalary() %></td>			
	</tr>
<%}%>
</table>
</div>
</body>
</html>





