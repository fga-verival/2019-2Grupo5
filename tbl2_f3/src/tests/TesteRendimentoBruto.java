package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import src.Cdb;

@RunWith(Parameterized.class)

public class TesteRendimentoBruto {
 
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {60,1000f,8.5f,13.97f},
                 {270,2000f,8.5f,125.75f},
                 {390,100f,7.5f,8.01f}
           });
    }

    private int a;
    private float b;
    private float c;
    private float d;

    public TesteRendimentoBruto(int a, float b, float c ,float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Test
    public void testeRendimentoBrutoParametrizado() {
    	Cdb cdb = new Cdb(a,b,c);
        assertEquals(d, cdb.getRendimentoBruto(), 0.01);
    }
    
	@Test
	public void testeRendimentoBruto()
	{
		Cdb cdb = new Cdb(60,1000f,8.5f);
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
