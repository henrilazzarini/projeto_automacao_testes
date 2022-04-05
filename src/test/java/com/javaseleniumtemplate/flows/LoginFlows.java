package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Test;

public class LoginFlows {
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

        //Test
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

    }
}
