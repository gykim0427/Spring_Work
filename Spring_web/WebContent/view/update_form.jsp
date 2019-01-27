<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="board_update2.do" method="post">
		<input type="hidden" name="seq" value="${board.seq }"> 
	작성자 : ${ board.writer} <br>
	제목 : <input type="text" name="title" value="${board.title }"><br>
	내용 <br>
	<textarea rows="6" cols="70" name="contents">${board.contents }</textarea>
	<br>
	<input type="submit" value="수정완료">
</form>
</body>
</html>