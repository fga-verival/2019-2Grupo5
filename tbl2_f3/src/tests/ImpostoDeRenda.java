package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import src.Cdb;

@RunWith(Parameterized.class)

public class ImpostoDeRenda {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {120,500f,8f,2.96f},
                 {240,3000f,9f,35.51f},
                 {270,2000f,8.5f,25.15f}
           });
    }
    
    private int a;
    private float b;
    private float c;
    private float d;
    
    public ImpostoDeRenda(int a, float b, float c ,float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Test
    public void testeImpostoDeRendaParametrizado() {
    	Cdb cdb = new Cdb(a,b,c);
        assertEquals(d, cdb.getImpostoRenda(), 0.01);
    }
    
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
