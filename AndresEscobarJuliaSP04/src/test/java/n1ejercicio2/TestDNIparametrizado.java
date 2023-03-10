package n1ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestDNIparametrizado {

 
	@ParameterizedTest
	@CsvSource(value = { "51707353:H","46087237:K","73936150:M","67347527:P","98183965:R",
			 			 "1467666:J" ,"39180722:S","28745571:X","20165284:B","12345678:Z"}, delimiter = ':')
	final void testCalculaLetra(int dni, char letra ) {
		
		 LetraDNI letradni = new LetraDNI();
		 assertEquals( letra, letradni.calculaLetra(dni));
	}



}
