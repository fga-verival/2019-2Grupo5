package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Cdb;

public class TesteRendimentoBruto {
	
	@Test
	public void testeRendimentoBruto()
	{
		Cdb cdb = new Cdb(60,1000f,8.5f);
		System.out.println(cdb.getRendimentoBruto());
		assertNotNull(cdb);
		assertEquals(cdb.getRendimentoBruto(),13.97,0.01);
	}
	
	@Test
	public void testeRendimentoBruto2() {
		Cdb cdb = new Cdb(120,500f,8.0f);
		
		assertNotNull(cdb);
		assertEquals(cdb.getRendimentoBruto(),13.15,0.01);
	}
	
}
