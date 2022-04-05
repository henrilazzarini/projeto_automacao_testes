package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.bases.PageBase;
import com.javaseleniumtemplate.utils.DriverUtils;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public void efetuarLogin(){
        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "henrique.viciedo";
        String senha = "minhaSenha_123";
    
        //Test
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        String url = DriverUtils.INSTANCE.getCurrentUrl();

        Assert.assertEquals("https://mantis-prova.base2.com.br/my_view_page.php", url);
    }
}
