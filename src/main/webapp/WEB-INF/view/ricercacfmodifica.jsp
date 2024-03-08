<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method=POST action=ricercaPerCfMod>

CF DA RICERCARE<input type=text name=cfDaRic>

<input type=submit>
</form>



<form method=post action=modificacliente>

<input type=text name=nomeModificato value=${nomeTrovato }>
<input type=text name=cognomeModificato value=${cognomeTrovato }>
<input type=text name=cfModificato value=${cfTrovato }>

<input type=submit value=invia>
</form>


</body>
</html>