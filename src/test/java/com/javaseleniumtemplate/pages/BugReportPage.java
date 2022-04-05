package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class BugReportPage extends PageBase {

    By successMessageLabel = By.xpath("/html/body/div[2]");

    public String retornaMensagemSucessoCadastro(){
        return getText(successMessageLabel);
    }
}
