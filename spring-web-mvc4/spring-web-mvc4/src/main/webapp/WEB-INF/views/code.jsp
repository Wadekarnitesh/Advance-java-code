<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	 * @GetMapping("/simple") public String simplePagination(
	 * 
	 * @RequestParam(defaultValue = "0") int page, Model model) {
	 * 
	 * int size = 4;
	 * 
	 * org.springframework.data.domain.Pageable of = PageRequest.of(page, size); //
	 * Pageable pageable = PageRequest.of(page, size); // List<Employee> list =
	 * repo.findWithPagination(pageable); List<Employee> list =
	 * repo.findWithPagination(of);
	 * 
	 * model.addAttribute("list", list); model.addAttribute("page", page);
	 * 
	 * return "display"; }
	 
	 
	 	<!--  @Query("from Employee")
	public List<Employee> findWithPagination(org.springframework.data.domain.Pageable of); -->



<h2>Simple Pagination</h2>

<table border="1">
<c:forEach var="e" items="${list}">
<tr>
    <td>${e.id}</td>
    <td>${e.name}</td>
    <td>${e.salary}</td>
    <td>${e.skill}</td>
</tr>
</c:forEach>
</table>

<br>

<a href="simple?page=${page - 1}">⬅ Previous</a>
<a href="simple?page=${page + 1}">Next ➡</a>




</body>
</html>