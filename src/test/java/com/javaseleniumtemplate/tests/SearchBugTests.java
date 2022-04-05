package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.HomePage;
import com.javaseleniumtemplate.pages.SearchBugPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchBugTests extends TestBase {

    HomePage homePage;
    SearchBugPage searchBugPage;

    @Before
    public void realizarLogin(){
        LoginFlows.efetuarLogin();
    }

    @Test
    public void realizarBusca() {

        HomePage homePage;
        SearchBugPage searchBugPage;
        homePage = new HomePage();
        searchBugPage = new SearchBugPage();

        String busca = "texto";
        String mensagemErroEsperada = "A number was expected for bug_id.";

        homePage.preencherBusca(busca);
        homePage.clicarEmBusca();

        //System.out.println(searchBugPage.retornaMensagemErroBusca());
        //System.out.println(mensagemErroEsperada);

        Assert.assertEquals(searchBugPage.retornaMensagemErroBusca(), mensagemErroEsperada);

    }
}