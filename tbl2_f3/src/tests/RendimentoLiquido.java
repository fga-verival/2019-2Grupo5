package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import src.Cdb;

@RunWith(Parameterized.class)

public class RendimentoLiquido {
	
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {120,500f,8f,2.0384f},
                 {240,3000f,9f,4.7342f},
                 {270,2000f,8.5f,5.0301f}
           });
    }
    
    private int a;
    private float b;
    private float c;
    private float d;
    
    public RendimentoLiquido(int a, float b, float c ,float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Test
    public void testeImpostoDeRendaParametrizado() {
    	Cdb cdb = new Cdb(a,b,c);
        assertEquals(d, cdb.getRendimentoLiquido(), 0.0001);
    }
	@Test
	public void testeRendimentoLiquido() {
		Cdb cdb = new Cdb(390, 100f, 7.5f);
		assertEquals(cdb.getRendimentoLiquido(), 6.6113f, 0.0001);
	}
	@Test
	public void testeRendimentoLiquido2() {
		Cdb cdb = new Cdb(420, 350f, 8f);
		assertEquals(cdb.getRendimentoLiquido(), 7.5945f, 0.0001);
	}
}
