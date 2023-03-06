package n2ejercicio1;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class IsStringLongitud8 extends TypeSafeMatcher<String> {

	  public boolean matchesSafely(String name) { 
	     boolean longitud8 = false;
	     if( name.length()  == 8 ) { 
	    	 longitud8 = true;
		 };
	   
    	  return longitud8;
	  }

	  public void describeTo1(Description description) { 
	    description.appendText(" string longitud distita 8"); 
	  }

	  public static IsStringLongitud8  StringLongitud8 () { 
	    return new IsStringLongitud8(); 
	  }

	@Override
 	public void describeTo(Description description) {
		description.appendText("String debe tener longitud 8");
	 
	}

	} 