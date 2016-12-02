<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<TABLE BORDER=5 ALIGN="CENTER"> <TR>
<TH CLASS="TITLE">Su saldo </TABLE>
<P>
<IMG SRC="imagenes/billetes.jpg" width="304" height="228" ALIGN="RIGHT"> <UL>
<LI>Nombre: ${clienteregular.nombre} <LI>Apellido: ${clienteregular.apellido} <LI>ID: ${clienteregular.id}
<LI>Saldo: $${clienteregular.saldo}
</UL>
</body>
</html>