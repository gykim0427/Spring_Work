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
	�ۼ��� : ${ board.writer} <br>
	���� : <input type="text" name="title" value="${board.title }"><br>
	���� <br>
	<textarea rows="6" cols="70" name="contents">${board.contents }</textarea>
	<br>
	<input type="submit" value="�����Ϸ�">
</form>
</body>
</html>