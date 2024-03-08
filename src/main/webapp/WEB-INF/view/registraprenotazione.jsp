<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.util.List" %>
    <%@ page import="it.rf.gestsalone.model.Servizio" %>
 
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>

<%String cfloggato=(String)session.getAttribute("cfLoggato"); 


%>



<h1> ELENCO SERVIZI DISPONIBILI</h1>
<form action=inserisciprenotazione method=POST>

<h2>Utente Loggato</h2><input type=text name=cfCliente value="<%=cfloggato%>" readonly><br><br>
In quale giorno desideri avvalerti dei Ns servizi?<input type=Date name=dataEsecuzione required><br>

<%List<Servizio>listaottenuta=(List<Servizio>)request.getAttribute("listaservizi");
for(Servizio s:listaottenuta){%>
<%=s.getNomeServizio() %><input type=checkbox value=<%=s.getCodServizio() %>	name=elencoservizi onclick="abilita();" ><br>
<%}%>



<input id="tastoCrea" type="submit" disabled = "true" value="Crea">
</form>

<script>
function abilita()
{
console.log("chiamata");
	 var submitButton = document.getElementById("tastoCrea");
	    submitButton.disabled = false;
	}

</script>
</body>
</html>