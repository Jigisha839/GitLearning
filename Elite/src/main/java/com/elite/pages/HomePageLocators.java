package com.elite.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePageLocators {
	
	@FindBy(css="a.uitk-tab-anchor[href='?pwaLob=wizard-flight-pwa']")
	public WebElement flightLink;
	@FindBy(css="button.uitk-faux-input[aria-label='Leaving from']")
	public WebElement leaving;
	@FindBy(css="button.uitk-button.uitk-button-medium.uitk-button-fullWidth.uitk-button-typeahead.uitk-type-left.has-subtext[data-stid='location-field-leg1-origin-result-item-button']")
	public WebElement leavingSelect;
	
	@FindBy(css="button.uitk-faux-input[aria-label='Going to']")
	public WebElement destination;
	@FindBy(css="button.uitk-button.uitk-button-medium.uitk-button-fullWidth.uitk-button-typeahead.uitk-type-left.has-subtext[data-stid='location-field-leg1-destination-result-item-button']")
	public WebElement destinationSelect;
	
	@FindBy(css="button[type='submit'][data-testid='submit-button']")
	public WebElement search;
	@FindBy(css="a[aria-label='Preferred flight class Economy']")
	public WebElement dropD;
	@FindBy(css="div.uitk-menu-container.uitk-menu-pos-left.uitk-menu-container-text-nowrap>div[role='menu']>a:nth-child(2)")
	public WebElement classTypeEco;
	
	

}
