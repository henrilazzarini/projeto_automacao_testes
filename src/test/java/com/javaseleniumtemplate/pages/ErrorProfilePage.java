package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ErrorProfilePage extends PageBase {

    By errorProfileMessageLabel = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td/p");

    public String retornaMensagemErroProfile(){
        return getText(errorProfileMessageLabel);
    }

}
