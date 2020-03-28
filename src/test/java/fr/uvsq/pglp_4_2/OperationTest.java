package fr.uvsq.pglp_4_2;


import static org.junit.Assert.*;

import org.junit.Test;

import fr.uvsq.pglp_4_2.exceptions.DivisionParZeroException;





//Classe de test OperationTest - Tests sur les methodes de Operation

public class OperationTest {
	
	private Operation op;
	
	//test la constante Plus de la classe Operation
	
	@Test
	public void testPlus() throws DivisionParZeroException {
		op= Operation.PLUS;
		boolean test=(op.eval(2,3)==5.0);
		assertEquals(test,true);
	}
	/**
	 * test la constante Moins de la classe Operation
	 */
	@Test
	public void testMoins() throws DivisionParZeroException {
		op= Operation.MOINS;
		boolean test=(op.eval(2,3)==1.0);
		assertEquals(test,true);
	}
	/**
	 * test la constante Mult de la classe Operation
	 */
	@Test
	public void testMult() throws DivisionParZeroException {
		op= Operation.MULT;
		boolean test=(op.eval(2,3)==6.0);
		assertEquals(test,true);
	}
	/**
	 * test la constante Div de la classe Operation
	 */
	@Test
	public void testDiv() throws DivisionParZeroException {
		op= Operation.DIV;
		boolean test=(op.eval(2,3)==1.5);
		assertEquals(test,true);
	}
	/**
	 * Ce test effectue l'operation de division par 0 et doit retourner une exception
	 */
	@Test(expected=DivisionParZeroException.class)
	public void testDivParZero() throws DivisionParZeroException {
		op= Operation.DIV;
		op.eval(0,3);
	}	
}
