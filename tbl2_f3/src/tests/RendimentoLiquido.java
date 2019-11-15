package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.Cdb;

public class RendimentoLiquido {
	@Test
	public void testeRendimentoLiquido() {
		Cdb dcb = new Cdb(390, 100f, 7.5f);
		assertEquals(cdb.getRendimentoLiquido(), 6.6113f, 0.01);
	}
}
