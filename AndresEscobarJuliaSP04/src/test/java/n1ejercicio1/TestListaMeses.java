package n1ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestListaMeses {
	ListaMeses listameses = new ListaMeses();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void test() {
		 assertEquals("Agosto", listameses.getMes(7)); 
	 
		 assertEquals(12 , listameses.getTamaño() );
		 
		 assertEquals(false, listameses.getIsnulo() );
		 
	}

}
