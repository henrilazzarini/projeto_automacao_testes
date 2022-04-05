package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.ConfirmDeletePage;
import com.javaseleniumtemplate.pages.HomePage;

import com.javaseleniumtemplate.pages.ViewIssuePage;
import com.javaseleniumtemplate.utils.DriverUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeleteBugTests extends TestBase {
    //Objects
    HomePage homePage;
    ViewIssuePage viewIssuePage;
    ConfirmDeletePage confirmDeletePage;

    //Tests
    @Before
    public void realizarLogin(){
        LoginFlows.efetuarLogin();
    }

    @Test
    public void deletarBug(){
        homePage = new HomePage();
        viewIssuePage = new ViewIssuePage();
        confirmDeletePage = new ConfirmDeletePage();

        String urlEsperada = "https://mantis-prova.base2.com.br/view_all_bug_page.php";

        homePage.selecionarTodosOsProjetos();
        //homePage.clicarEmMyView();
        homePage.clicarEmBug();
        viewIssuePage.clicarEmDelete();
        confirmDeletePage.clicarEmConfirmarDelecao();

        String urlAtual = DriverUtils.INSTANCE.getCurrentUrl();
        Assert.assertEquals(urlEsperada, urlAtual);
    }
}
