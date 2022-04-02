package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public static void efetuarLogin(){
        LoginPage loginPage;
        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "henrique.viciedo";
        String senha = "minhaSenha_123";
        //String mensagemErroEsperada = "Your account may be disabled or blocked or the username/password you entered is incorrect.";

        //Test
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        //Assert.assertEquals(loginPage.retornaMensagemErroLogin(), mensagemErroEsperada);
    }
}
