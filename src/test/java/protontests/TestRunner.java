package protontests;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.EXECUTION_DRY_RUN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.FILTER_NAME_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;;
//import static io.cucumber.junit.platform.engine.Constants.




@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,value="html:target/cucumber-report.html")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "protontests")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "orangetests")
//@ConfigurationParameter(key = FILTER_NAME_PROPERTY_NAME, value = ".*Create Admin User")
//@ConfigurationParameter(key = FILTER_NAME_PROPERTY_NAME, value = ".*check login and logout")
//@ConfigurationParameter(key = EXECUTION_DRY_RUN_PROPERTY_NAME, value = "true")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value ="@protonlogin")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value ="@wip")
public class TestRunner   {
    
}