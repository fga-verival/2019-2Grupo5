package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import src.Cdb;

public class ImpostoDeRenda {
	@Test
	public void testeImpostoRenda()
	{
		Cdb cdb = new Cdb(60,1000f,8.5f);
		assertNotNull(cdb);
		assertEquals(cdb.getImpostoRenda(),3.14f,0.01);
	}
	
	@Test
	public void testeImpostoRenda2()
	{
		Cdb cdb = new Cdb(120,500f,8f);
		assertNotNull(cdb);
		assertEquals(cdb.getImpostoRenda(),2.96f,0.01);
	}
}
