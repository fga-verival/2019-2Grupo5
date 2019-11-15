package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.Cdb;

public class RendimentoLiquido {
	@Test
	public void testeRendimentoLiquido() {
		Cdb cdb = new Cdb(390, 100f, 7.5f);
		assertEquals(cdb.getRendimentoLiquido(), 6.6113f, 0.001);
	}
	@Test
	public void testeRendimentoLiquido2() {
		Cdb cdb = new Cdb(420, 350f, 8f);
		assertEquals(cdb.getRendimentoLiquido(), 7.5945f, 0.001);
	}
}
