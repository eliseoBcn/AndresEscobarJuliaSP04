package n1ejercicio3;

import java.util.Arrays;
import java.util.List;

public class DiasSemana {

	
   	List<String> numbersList2 = Arrays.asList("Lunes","Martes","Miercoles");
	 
   	public  DiasSemana() {
   		
   	}
   	
   	public String getDiaSemana(int i) {
   		
   		return numbersList2.get(i);
   	}
 
}
