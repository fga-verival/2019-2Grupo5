package tests;

import org.junit.Test;

public class TesteRendimentoBruto {
	
	@Test
	public void testeRendimentoBruto()
	{
		Cdb cdb = new Cdb(60,1000,8.5);
		
		assertNull(cdb);
		assertEquals(cdb.getRendimentoBruto(),13.97);
	}
}
