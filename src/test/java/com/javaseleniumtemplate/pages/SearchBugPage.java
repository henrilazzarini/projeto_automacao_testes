package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class SearchBugPage extends PageBase {

    By errorMessageLabel = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td/p");

    public String retornaMensagemErroBusca(){
        return getText(errorMessageLabel);
    }

}
