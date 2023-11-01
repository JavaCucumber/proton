package protontests;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class StepDefTypeConfig {
	
//	@DataTableType
//    public Author authorEntryTransformer(Map<String, String> entry) {
//        return new Author(
//            entry.get("firstName"),
//            entry.get("lastName"),
//            entry.get("birthDate"));
//    }

    @Given("a list of authors in a table")
    public void aListOfAuthorsInATable(List<Author> authors) {
        
    }
    
    @ParameterType("([^;]+);?")
    public List<String> list(String[] vals){
        return Arrays.asList(vals);
    }
    
    
    @DocStringType
    public JsonNode json(String docString) throws JsonProcessingException {	
    	ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readTree(docString);
    }
    
    
    
    
    
    

}

class Author{
	public String firstName;
	public String lastName;
	public String birthDate;
}
