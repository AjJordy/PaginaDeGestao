<html>
    <body>
        <h2>Login</h2>  
        <form action="${pageContext.request.contextPath}/LoginServerlet" method="post">
            <input type="text" name="login" placeholder="Login"><br>
            <input type="text" name="senha" placeholder="Senha"><br>
            <input type="submit" name="logar" value="Logar"> 
        </form>
        
    </body>
</html>
