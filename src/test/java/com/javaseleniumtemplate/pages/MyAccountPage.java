package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MyAccountPage extends PageBase {

    //By openProfilesButton = By.cssSelector("a[href^='/account_prof_menu_page.php']");
    By openProfilesLink = By.linkText("Profiles");

    public void clicarEmProfiles(){ click(openProfilesLink); }

}
