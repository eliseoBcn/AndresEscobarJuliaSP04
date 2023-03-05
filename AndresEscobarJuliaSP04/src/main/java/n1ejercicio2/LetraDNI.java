package n1ejercicio2;

public class LetraDNI {

	
	public LetraDNI() {
		
		
	}
	
	
	public char calculaLetra(int dni){
		
	        char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	        int resto = dni%23;
	        return letras[resto];
	}
	
}
