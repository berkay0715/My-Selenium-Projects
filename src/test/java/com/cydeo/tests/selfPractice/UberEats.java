package com.cydeo.tests.selfPractice;

import com.cydeo.pages.UberEatsPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class UberEats {


    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://www.ubereats.com/pl-en?utm_source=AdWords_Brand&utm_campaign=CM2087359-search-google-brand_139_-99_PL-National_e_web_acq_cpc_en_Generics_Exact_ubereats_kwd-111332437702_549031059001_126676025971_e_c&campaign_id=12765890353&adg_id=126676025971&fi_id=&match=e&net=g&dev=c&dev_m=&ad_id=549031059001&cre=549031059001&kwid=kwd-111332437702&kw=ubereats&placement=&tar=&gclid=EAIaIQobChMI8uTTs6Lx-gIVhpSyCh3KnA_WEAAYASAAEgIEz_D_BwE&gclsrc=aw.ds");
    }

    UberEatsPage uberEatsPage = new UberEatsPage();

    @Test
    public void OrderFood() throws InterruptedException {

        uberEatsPage.deliveryInput.sendKeys("Smocza 1");
        Thread.sleep(2000);
        uberEatsPage.findFoodButton.click();
        Thread.sleep(2000);
        uberEatsPage.searchFood.sendKeys("Trattoria Toscana"+ Keys.ENTER);
        Thread.sleep(2000);
        uberEatsPage.trattoriaToscana.click();

        Thread.sleep(5000);
        uberEatsPage.selectMargarita.click();

        Thread.sleep(2000);
        uberEatsPage.addToOrder.click();

        Thread.sleep(2000);
        uberEatsPage.goToCheckOut.click();

    }


}

