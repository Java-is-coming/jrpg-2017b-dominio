package tests_dominio;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import dominio.Item;

public class TestItem {

    @Test
    public void testItem() {
        final Item item = new Item();

        Assert.assertEquals(0, item.getIdItem());
        Assert.assertEquals(0, item.getBonusDestreza());
        Assert.assertEquals(0, item.getBonusEnergia());
        Assert.assertEquals(0, item.getBonusFuerza());
        Assert.assertEquals(0, item.getBonusInteligencia());
        Assert.assertEquals(0, item.getBonusSalud());
        Assert.assertEquals(0, item.getDestrezaRequerida());
        Assert.assertEquals(0, item.getFuerzaRequerida());
        Assert.assertEquals(0, item.getInteligenciarequerida());
        Assert.assertEquals(0, item.getWearLocation());
        Assert.assertEquals("", item.getFoto());
        Assert.assertEquals("", item.getFotoEquipado());
    }

    @Test
    public void testItemSetValues() throws IOException {
        final Item item = new Item(0, "", 0, 0, 0, 0, 0, 0, "", "");

        Assert.assertEquals(0, item.getIdItem());
        Assert.assertEquals(0, item.getBonusDestreza());
        Assert.assertEquals(0, item.getBonusEnergia());
        Assert.assertEquals(0, item.getBonusFuerza());
        Assert.assertEquals(0, item.getBonusInteligencia());
        Assert.assertEquals(0, item.getBonusSalud());
        Assert.assertEquals(0, item.getDestrezaRequerida());
        Assert.assertEquals(0, item.getFuerzaRequerida());
        Assert.assertEquals(0, item.getInteligenciarequerida());
        Assert.assertEquals(0, item.getWearLocation());
        Assert.assertEquals("", item.getFoto());
        Assert.assertEquals("", item.getFotoEquipado());

        item.setIdItem(1);
        item.setBonusDestreza(2);
        item.setBonusEnergia(3);
        item.setBonusFuerza(4);
        item.setBonusInteligencia(5);
        item.setBonusSalud(6);
        item.setDestrezaRequerida(7);
        item.setFuerzaRequerida(8);
        item.setInteligenciarequerida(9);
        item.setWearLocation(10);
        item.setFoto("11");
        item.setFotoEquipado("12");
        item.setNombre("13");

        Assert.assertEquals(1, item.getIdItem());
        Assert.assertEquals(2, item.getBonusDestreza());
        Assert.assertEquals(3, item.getBonusEnergia());
        Assert.assertEquals(4, item.getBonusFuerza());
        Assert.assertEquals(5, item.getBonusInteligencia());
        Assert.assertEquals(6, item.getBonusSalud());
        Assert.assertEquals(7, item.getDestrezaRequerida());
        Assert.assertEquals(8, item.getFuerzaRequerida());
        Assert.assertEquals(9, item.getInteligenciarequerida());
        Assert.assertEquals(10, item.getWearLocation());
        Assert.assertEquals("11", item.getFoto());
        Assert.assertEquals("12", item.getFotoEquipado());
        Assert.assertEquals("13", item.getNombre());
    }

    @Test(expected = IOException.class)
    public void testItemBufferedFoto() throws IOException {
        final Item item = new Item(0, "", 0, 0, 0, 0, 0, 0, "", "");
        final BufferedImage image = item.getBufferedFoto();
    }
}
