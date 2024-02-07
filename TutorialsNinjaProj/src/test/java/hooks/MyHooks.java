package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	
	@Before
	public void setup(Scenario scenario) {
		System.out.println("** Execution started for scenario - "+scenario.getName());
		System.out.println("++ Browser got launched and maximized ++");
		System.out.println("++ Aplication URL got opened in the browser ++");
		
	}
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("-- Loggedout from the application --");
		System.out.println("-- Browser got closed --");
		System.out.println("** Execution ended for scenario - "+scenario.getName());

		
	}

}
