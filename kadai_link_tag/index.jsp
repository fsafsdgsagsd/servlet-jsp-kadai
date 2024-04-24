<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Servletからのメッセージを表示しよう</title>
</head>

<body>

	<%
		//リクエストスコープからのデータの取得
		String success = (String)request.getAttribute("success");
	%>

    <a href="<%= request.getContextPath() %>/link?name=侍太郎">名前「侍太郎」をServletに送信</a><br>
    
    <%
    	 //値がnullかを判定
         if( success != null ) {
        	 out.println(success);
         }
     %>
</body>

</html>
