package come.roughtest;

import com.elite.base.BaseTest;
import com.elite.pages.actions.HomePage;

public class HomePageTest {

	public static void main(String[] args) {
		
		BaseTest.initConfiguration();
		HomePage home=new HomePage();
		home.goToFlight().goToFlightBook("Delhi (DEL - Indira Gandhi Intl.)", "Munich (MUC - Franz Josef Strauss Intl.)", "Premium economy");
	}

}
