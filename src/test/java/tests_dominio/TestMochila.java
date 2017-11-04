package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Mochila;

public class TestMochila {

    @Test
    public void testMochila() {
        final int id = 0;
        final Mochila mochila = new Mochila();

        Assert.assertEquals(id, mochila.getIdMochila());

        for (int i = 1; i <= 20; i++) {
            Assert.assertEquals(-1, mochila.getById(i));
        }
    }

    @Test
    public void testMochilaSeteoValores() {
        final int id = 1;
        final Mochila mochila = new Mochila(id);

        Assert.assertEquals(id, mochila.getIdMochila());

        for (int i = 1; i <= 20; i++) {
            Assert.assertEquals(-1, mochila.getById(i));
        }

        for (int i = 1; i <= 20; i++) {
            mochila.setInt(i, i);
        }

        for (int i = 1; i <= 20; i++) {
            Assert.assertEquals(i, mochila.getById(i));
        }
    }

    @Test
    public void testMochilaConValores() {
        final int id = 1000;
        final Mochila mochila = new Mochila(id, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        Assert.assertEquals(id, mochila.getIdMochila());

        for (int i = 1; i <= 20; i++) {
            Assert.assertEquals(i, mochila.getById(i));
        }

        Assert.assertEquals(1, mochila.getItem1());
        Assert.assertEquals(2, mochila.getItem2());
        Assert.assertEquals(3, mochila.getItem3());
        Assert.assertEquals(4, mochila.getItem4());
        Assert.assertEquals(5, mochila.getItem5());
        Assert.assertEquals(6, mochila.getItem6());
        Assert.assertEquals(7, mochila.getItem7());
        Assert.assertEquals(8, mochila.getItem8());
        Assert.assertEquals(9, mochila.getItem9());
        Assert.assertEquals(10, mochila.getItem10());
        Assert.assertEquals(11, mochila.getItem11());
        Assert.assertEquals(12, mochila.getItem12());
        Assert.assertEquals(13, mochila.getItem13());
        Assert.assertEquals(14, mochila.getItem14());
        Assert.assertEquals(15, mochila.getItem15());
        Assert.assertEquals(16, mochila.getItem16());
        Assert.assertEquals(17, mochila.getItem17());
        Assert.assertEquals(18, mochila.getItem18());
        Assert.assertEquals(19, mochila.getItem19());
        Assert.assertEquals(20, mochila.getItem20());

    }
}
