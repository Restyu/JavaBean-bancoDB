<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN"> <HTML>
<HEAD>
<TITLE>Su saldo</TITLE>
<LINK REL=STYLESHEET HREF="./recursos/JSP-Styles.css" TYPE="text/css"> </HEAD>
<BODY>
<TABLE BORDER=5 ALIGN="CENTER">
<TR>
<TH CLASS="TITLE">Su saldo
</TABLE>
<P>
<CENTER>
<IMG SRC="imagenes/barco.jpg" width="304" height="228"> 
</CENTER>
<BR CLEAR="ALL"> Es un honor poderle atender,
${grancliente.nombre} ${grancliente.apellido}!
<P>Ya que usted es uno de nuestros mejores clientes, le queremos ofrecer ofrecer la oportunidad de gastar una pequeña cantidad de sus $${grancliente.saldo} en un barco digno de su estatus. Por favor, visite nuestra web de barcos para más información.
</BODY>
</HTML>