package n1ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LetraDniTest {
	
	LetraDNI    letradni = new LetraDNI();
	
	
	@Test
	final void testLetraDNI() {
 
	}

// 
 
 
//	R
//	S
//	X
//	64659009Y
//	63161303Z

	
	
	
	@Test
 	final void testCalculaLetra1() {
		
		assertEquals( "03878510C" ,    "03878510" + letradni.calculaLetra(3878510) ); 
	}
	@Test
	final void testCalculaLetra2() {

		assertEquals( "50843786D" ,   "50843786" + letradni.calculaLetra(50843786)); ;
	}
	@Test
	final void testCalculaLetra3() {
		assertEquals( "51707353H" ,  "51707353" +  letradni.calculaLetra(51707353)); ;
	}
	@Test
	final void testCalculaLetra4() {
		assertEquals( "01467666J" , "01467666"  +  letradni.calculaLetra(1467666)); ;
	}
	@Test
	final void testCalculaLetra5() {
		assertEquals( "46087237K" , "46087237"  +  letradni.calculaLetra(46087237)); ;
	}
	@Test
	final void testCalculaLetra6() {
		assertEquals( "73936150M" , "73936150"   +  letradni.calculaLetra(73936150)); ;
	}
	@Test
	final void testCalculaLetra7() {
  		assertEquals( "67347527P" , "67347527"  +  letradni.calculaLetra(67347527)); ;
 	}
	@Test
	final void testCalculaLetra8() {
		assertEquals( "98183965R" ,  "98183965" +  letradni.calculaLetra(98183965)); ;
	}
	@Test
	final void testCalculaLetra9() {
		assertEquals( "39180722S" , "39180722"  +  letradni.calculaLetra(39180722)); ;
	}
	@Test
	final void testCalculaLetra10() {
		assertEquals( "28745571X" , "28745571"  +  letradni.calculaLetra(28745571)); ;
	}
	
}
