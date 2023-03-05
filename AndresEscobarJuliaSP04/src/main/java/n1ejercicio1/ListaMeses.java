package n1ejercicio1;

import java.util.ArrayList;

public class ListaMeses {


	ArrayList<String> listameses = new ArrayList<String>();
	
	public ListaMeses() {
		
		listameses.add("Enero");
		listameses.add("Febrero");
		listameses.add("Marzo");
		listameses.add("Abril");  
		listameses.add("Mayo");
		listameses.add("Junio");
		listameses.add("Julio");
		listameses.add("Agosto");
		listameses.add("Septienbre");
		listameses.add("Octubre");
		listameses.add("Novienbre");
		listameses.add("Diciembre"); 
	}
	
	public String  getMes(int i)    {
		
		return listameses.get(i);
		
	}
	public int  getTamaño () {
		
		return listameses.size();
		
	}
 	public boolean  getIsnulo () {

		if( listameses != null ) {
			return false;
		} 
		return true;

	
	}
}
