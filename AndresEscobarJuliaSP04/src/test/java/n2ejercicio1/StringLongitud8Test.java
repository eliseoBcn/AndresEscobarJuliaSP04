package n2ejercicio1;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static n2ejercicio1.IsStringLongitud8.StringLongitud8;
public class StringLongitud8Test {

	@Test
	final void  StringLongitud8Test() {
		// TODO Auto-generated constructor stub
		
		assertThat( "Mordor" , not(StringLongitud8()) ); 
	}

}
