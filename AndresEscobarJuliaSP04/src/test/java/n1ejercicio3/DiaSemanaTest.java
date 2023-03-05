package n1ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiaSemanaTest {
 
	DiasSemana diassemana = new DiasSemana();


	@Test 
	final void testGetDiaSemana() {
  
	    Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
	         diassemana.getDiaSemana(8);
	    });
	
	 
	}

}
