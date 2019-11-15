package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Cdb;

public class TesteRendimentoBruto {
	
	@Test
	public void testeRendimentoBruto()
	{
		Cdb cdb = new Cdb(60f,1000f,8.5f);
		
		assertNotNull(cdb);
		assertEquals(cdb.getRendimentoBruto(),13.97,0.001);
	}
}
