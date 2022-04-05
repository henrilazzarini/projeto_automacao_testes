package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ProfilesPage extends PageBase {

    By platformField = By.name("platform");
    By osField = By.name("os");
    By osVersionField = By.name("os_build");
    By addProfileButton = By.cssSelector("input[type='submit'][class='button'][value='Add Profile']");
    //By selectProfileCombo = By.name("profile_id");

    public void preencherPlataforma(String plataforma){
        sendKeys(platformField, plataforma);
    }

    public void preencherOS(String os){
        sendKeys(osField, os);
    }

    public void preencherVersao(String versao){
        sendKeys(osVersionField, versao);
    }

    public void clicarEmAdicionarProfile(){ click(addProfileButton); }

}
