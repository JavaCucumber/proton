package protontests;

import io.cucumber.java.en.When;

public class StepDefCommon {
	
	
	@When("user wait for {int} secs")
	public void sleepTime(int wait) {
		int t= 1000*wait;
		try { Thread.sleep(t); } catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println(String.format("wait for %d secs",wait));
	}
	

	
	@When("hover mouse {string} Testing")
    public void hover_mouse_testing(String string) {
    
	}
	

}
