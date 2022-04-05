package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ConfirmDeletePage extends PageBase {

    By confirmDeleteButton = By.cssSelector("input[type='submit'][class='button'][value='Delete Issues']");;

    public void clicarEmConfirmarDelecao(){
        click(confirmDeleteButton);
    }
}
