package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewIssuePage extends PageBase {

    By deleteButton = By.cssSelector("input[type='submit'][class='button'][value='Delete']");

    public void clicarEmDelete(){
        click(deleteButton);
    }

}
