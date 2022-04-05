package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class SummaryPage extends PageBase {

    By printReportsLink = By.linkText("Print Reports");

    public void clicarEmPrintReports(){ click(printReportsLink); }

}
