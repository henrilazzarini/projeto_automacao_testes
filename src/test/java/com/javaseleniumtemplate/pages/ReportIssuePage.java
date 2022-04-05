package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ReportIssuePage extends PageBase {

    By selectCategoryCombo = By.name("category_id");
    By summaryField = By.name("summary");
    By descriptionField = By.name("description");
    By submitReportButton = By.cssSelector("input[type='submit'][class='button'][value='Submit Report']");

    public void selecionarCategoria(){
        Select comboCategorias = new Select(driver.findElement((selectCategoryCombo)));
        comboCategorias.selectByIndex(1);
    }

    public void preencherSummary(String sumario){
        sendKeys(summaryField, sumario);
    }
    public void preencherDescription(String descricao){
        sendKeys(descriptionField, descricao);
    }
    public void efetuarCadastroBug() { click(submitReportButton); }

}
