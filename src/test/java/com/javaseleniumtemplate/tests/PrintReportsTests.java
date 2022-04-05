package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.HomePage;
import com.javaseleniumtemplate.pages.SummaryPage;
import com.javaseleniumtemplate.utils.DriverUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintReportsTests extends TestBase {
    //Objects
    HomePage homePage;
    SummaryPage summaryPage;

    //Tests
    @Before
    public void realizarLogin(){
        LoginFlows.efetuarLogin();
    }

    @Test
    public void reportarBug(){
        homePage = new HomePage();
        summaryPage = new SummaryPage();

        String urlEsperada = "https://mantis-prova.base2.com.br/print_all_bug_page.php";

        homePage.clicarEmSummary();
        summaryPage.clicarEmPrintReports();

        String urlAtual = DriverUtils.INSTANCE.getCurrentUrl();
        Assert.assertEquals(urlEsperada, urlAtual);

    }


}
