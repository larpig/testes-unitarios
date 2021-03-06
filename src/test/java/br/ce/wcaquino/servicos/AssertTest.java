package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {

	@Test
	@Ignore
	public void Test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);

		Assert.assertEquals("Erro de comparacao", 1, 2);
		Assert.assertEquals(0.512, 0.51234, 0.001);
		Assert.assertEquals(Math.PI, 3.14, 0.01);

		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());

		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("bola", "casa");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));

		Usuario u1 = new Usuario("Usuario");
		Usuario u2 = new Usuario("Usuario");
		Usuario u3 = null;

		Assert.assertEquals(u1, u2);

		Assert.assertSame(u2, u2);
		Assert.assertNotSame(u1, u2);

		Assert.assertNull(u3);
		Assert.assertNotNull(u2);

	}

}
