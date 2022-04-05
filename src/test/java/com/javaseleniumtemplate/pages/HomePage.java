package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

    By projectIdCombo = By.name("project_id");
    By openMyViewLink = By.linkText("My View");
    By openReportIssuesLink = By.linkText("Report Issue");
    By searchBugField = By.name("bug_id");
    By jumpButton = By.cssSelector("input[type='submit'][class='button-small'][value='Jump']");
    By openBugButton = By.xpath("/html/body/div[3]/table[1]/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[1]/span/a[1]");
    By openMyAccountLink = By.linkText("My Account");
    By openSummary = By.linkText("Summary");

    public void selecionarTodosOsProjetos(){
        Select todosProjetos = new Select(driver.findElement((projectIdCombo)));
        todosProjetos.selectByValue("0");
    }

    public void selecionarPrimeiroProjeto(){
        Select primeiroProjeto = new Select(driver.findElement((projectIdCombo)));
        primeiroProjeto.selectByIndex(1);
    }

    /*public void clicarEmMyView(){
        click(openMyViewLink);
    } */

    public void clicarEmReportIssues() { click(openReportIssuesLink); }

    public void preencherBusca(String busca){
        sendKeys(searchBugField, busca);
    }

    public void clicarEmBusca() { click(jumpButton); }

    public void clicarEmBug(){ click(openBugButton); }

    public void clicarEmMyAccount(){ click(openMyAccountLink); }

    public void clicarEmSummary(){ click(openSummary); }

}
