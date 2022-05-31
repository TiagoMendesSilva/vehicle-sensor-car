<%@ page contentType="text/html;charset=UTF-8"language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <title>Projeto Vehicle Sensor Car</h:title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="css/login.css"/>

<head>
<body>
    <div id="login-container">
    <h1>Login</h1>


        <form action="">
            <outputLabel for="cpf">CPF</outputLabel>
            <inputText name="cpf" id="cpf" placeholder="Digite seu cpf" autocomplete="off" value="${User.cpf}" />
            <outputLabel for="password">Senha</outputLabel>
            <inputText type="password" id="password" name="password" placeholder="Digite sua senha" value="${User.password}"/>
            <a href="#" id="forgot-password">Esqueceu a senha?</a>
            <inputSubmit type="submit" value="Login"/>
        </form>

        <div id="social-container">
            <p>Ou entre pelas redes sociais.</p>
            <i class="fa fa-facebook"></i>
            <i class="fa fa-linkedin"></i>
        </div>
        <div id="register-container">
            <p>Ainda não tem uma conta?</p>
            <a href="register.xhtml">Registre-se</a>
        </div>

    </div>



</body>
</html>