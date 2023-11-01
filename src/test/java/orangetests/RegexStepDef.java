package orangetests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegexStepDef {

	
	
	@Given("^I am on \"([^\"]*)\"$")
	public void i_follow_on_page(String link) {
	    System.out.println("user input as :"+link);
	}  
	
	@When("^I see (gr.y) text$")
	public void p0(String arg0) {
		System.out.println(String.format("user see %s text :",arg0));
	}
	
	@When("^(?i)there is \"([^\"]*)\" in double quotes$")
	public void p1(String arg1) {
		System.out.println(String.format("handle case insenstive step def in %s text :",arg1));
	}
	
	@When("^handle or situation (A|B|C|D) in step def$")
	public void p2(String arg2) {
		System.out.println(String.format("Step found %s text to handle:",arg2));
	}
	
	
	
	
	
	
}
