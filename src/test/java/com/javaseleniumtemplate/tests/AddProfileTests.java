package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddProfileTests extends TestBase {
    //Objects
    HomePage homePage;
    MyAccountPage myAccountPage;
    ProfilesPage profilesPage;
    ErrorProfilePage errorProfilePage;

    //Tests
    @Before
    public void realizarLogin(){
        LoginFlows.efetuarLogin();
    }

    @Test
    public void addProfile(){
        //Page and Steps Objects
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
        profilesPage = new ProfilesPage();
        errorProfilePage = new ErrorProfilePage();


        //Parameteres
        String plataforma = "Notebook Lenovo Ideapad";
        String os = "";
        String versao = "11";
        String mensagemErro = "A necessary field \"Operating System\" was empty. Please recheck your inputs.";

        //Tests
        homePage.clicarEmMyAccount();
        myAccountPage.clicarEmProfiles();
        profilesPage.preencherPlataforma(plataforma);
        profilesPage.preencherOS(os);
        profilesPage.preencherVersao(versao);
        profilesPage.clicarEmAdicionarProfile();


        String response = errorProfilePage.retornaMensagemErroProfile();
        Assert.assertTrue(response.contains(mensagemErro));
        System.out.print(response);
        System.out.print(mensagemErro);

    }
}
