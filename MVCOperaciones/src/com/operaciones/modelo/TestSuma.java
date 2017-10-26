package com.operaciones.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuma {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		OperacionesMatematicas test;
		test=new OperacionesMatematicas();
		
		test.setNumero1(1.0f);
		test.setNumero2(2.0f);
		float result = test.sumar();
		assertEquals(4.0f,result,0.1f);
		
	    
	}

}
