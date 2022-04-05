package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReportBugTests extends TestBase {
    //Objects
    HomePage homePage;
    ReportIssuePage reportIssuePage;
    BugReportPage bugReportPage;

    //Tests
    @Before
    public void realizarLogin(){
        LoginFlows.efetuarLogin();
    }

    @Test
    public void reportarBug(){
        //Page and Steps Objects
        homePage = new HomePage();
        reportIssuePage = new ReportIssuePage();
        bugReportPage = new BugReportPage();

        String sumario = "Título do meu bug";
        String descricao = "Descrição do meu bug";
        String mensagemSucesso = "Operation successful.";

        homePage.clicarEmReportIssues();
        homePage.selecionarPrimeiroProjeto();
        reportIssuePage.selecionarCategoria();
        reportIssuePage.preencherSummary(sumario);
        reportIssuePage.preencherDescription((descricao));
        reportIssuePage.efetuarCadastroBug();

        String response = bugReportPage.retornaMensagemSucessoCadastro();

        Assert.assertTrue(response.contains(mensagemSucesso));

    }

}
