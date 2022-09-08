package pages;
/**
 * @Author: Ivan Barajas
 * @Date: 08/09/2022
 * @Version 1.0
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Prueba extends BasePage{
    private String usernameText = "//input[@id='user-name']";
    private String passwordText = "//input[@id='password']";
    private String buttonLogin  = "//input[@id='login-button']";
    private String filterbutton = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']" +
            "/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]";
    private String addtocartonesieButton = "//button[@id='add-to-cart-sauce-labs-onesie']";
    private String addtocartlightsButton = "//button[@id='add-to-cart-sauce-labs-bike-light']";
    private String addtocarttshirtButton = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']";
    private String addtocartthirtredButton = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']";
    private String buttonshopingcart = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']" +
            "/div[@id='header_container']/div[1]/div[3]/a[1]";
    private String removeonesiebutton ="//button[@id='remove-sauce-labs-onesie']";
    private String removebikeligthbutton = "//button[@id='remove-sauce-labs-bike-light']";
    private String checkoutButton = "//button[@id='checkout']";
    private String firstnameField = "//input[@id='first-name']";
    private String lastnameField = "//input[@id='last-name']";
    private String zipcodeField = "//input[@id='postal-code']";
    private String continueButton = "//input[@id='continue']";
    //private String subtotalLabel = "//div[@class='summary_subtotal_label']";
    private String finishButton = "//button[@id='finish']";

    private String checkouComplete = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']" +
            "/div[@id='checkout_complete_container']/img[1]";
    public Prueba(){super(driver);}

    public void navigateToLoginPage(){

        navigateTo("https://www.saucedemo.com/");
    }
    public void enterCredentials(){
        clickElement(usernameText);
        write(usernameText,"standard_user");
        clickElement(passwordText);
        write(passwordText,"secret_sauce");
        clickElement(buttonLogin);
    }
    public void selectFilter(){
        selectFromDropdownByValue(filterbutton,"lohi");
    }

    public void addtoCart(){
        clickElement(addtocartonesieButton);
        clickElement(addtocartlightsButton);
        clickElement(addtocarttshirtButton);
        clickElement(addtocartthirtredButton);
    }

    public void shopingCart(){
        clickElement(buttonshopingcart);
    }
    public void removeElements(){
        clickElement(removeonesiebutton);
        clickElement(removebikeligthbutton);
    }

    public void checkoutButton(){
        clickElement(checkoutButton);
    }
    public void checkoutInformation(){
        write(firstnameField,"Ivan");
        write(lastnameField,"Barajas");
        write(zipcodeField,"111631");
    }

    public void buttonContinue(){
        clickElement(continueButton);
    }

    public void  extractText(){
        System.out.println("Texto Extraido:");
        System.out.println(driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='summary_tax_label']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText());
    }

    public void buttonFinish() throws IOException {
        clickElement(finishButton);
        getScreenshot(checkouComplete,"checkoutComplete");
    }



}
