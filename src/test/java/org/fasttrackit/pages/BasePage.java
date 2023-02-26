package org.fasttrackit.pages;


import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

    public int getIntFromPrice (String price) {
        return Integer.parseInt(price
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll(" lei", ""));
    }






}
