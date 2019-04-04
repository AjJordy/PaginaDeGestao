<html>
    <body>
        <h2>Aluno</h2>     
        <form action="${pageContext.request.contextPath}/DashboardServlet" method="post">
            <input type="text" name="nomeAluno" placeholder="Nome"><br>
            <input type="text" name="matriculaAluno" placeholder="Matrícula"><br>
            <input type="text" name="materiaAluno" placeholder="Matéria"><br>
            <input type="submit" name="cadastrar" value="Cadastrar"> 
            <input type="submit" name="pesquisar" value="Pesquisar"> 
            <input type="submit" name="editar" value="Editar"> 
        </form>   
        
    </body>
</html>
