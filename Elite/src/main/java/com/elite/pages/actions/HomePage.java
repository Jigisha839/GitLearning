package com.elite.pages.actions;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.elite.base.BaseTest;
import com.elite.pages.HomePageLocators;

public class HomePage extends BaseTest {

		public HomePageLocators home;
		
		public HomePage() {
			
			this.home=new HomePageLocators();
			PageFactory.initElements(driver, this.home);
		}
		
		public HomePage goToFlight() {
			home.flightLink.click();
			return this;
			
			
		}
		
		public void goToFlightBook(String to, String destination, String cType){
			
			
			home.leaving.sendKeys(to);
			home.leavingSelect.click();
			home.destination.sendKeys(destination);
			home.destinationSelect.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			home.dropD.click();
			home.classTypeEco.click();
			
			home.search.click();
			
		}
		
		public void goToHotel() {
			
		}
		
		public void goToThingToDo() {
			
		}
		
		public void goToCar() {
			
		}
}
