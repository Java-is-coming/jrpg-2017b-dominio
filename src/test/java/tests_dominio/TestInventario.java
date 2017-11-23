package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Inventario;

public class TestInventario {

    @Test
    public void testInventario() {
        final int id = 1;
        final Inventario inventario = new Inventario(id);

        Assert.assertEquals(id, inventario.getIdInventario());

        Assert.assertEquals(-1, inventario.getAccesorio());
        Assert.assertEquals(-1, inventario.getCabeza());
        Assert.assertEquals(1, inventario.getIdInventario());
        Assert.assertEquals(-1, inventario.getManos1());
        Assert.assertEquals(-1, inventario.getManos2());
        Assert.assertEquals(-1, inventario.getPecho());
        Assert.assertEquals(-1, inventario.getPie());
    }

    @Test
    public void testInventarioConValores() {
        final int id = 1;
        final Inventario inventario = new Inventario(id, 1, 2, 3, 4, 5, 6);

        Assert.assertEquals(id, inventario.getIdInventario());

        Assert.assertEquals(6, inventario.getAccesorio());
        Assert.assertEquals(4, inventario.getCabeza());
        Assert.assertEquals(1, inventario.getManos1());
        Assert.assertEquals(2, inventario.getManos2());
        Assert.assertEquals(5, inventario.getPecho());
        Assert.assertEquals(3, inventario.getPie());
    }

    @Test
    public void testInventarioSeteoValores() {
        final int id = 1;
        final Inventario inventario = new Inventario(id);

        Assert.assertEquals(id, inventario.getIdInventario());

        Assert.assertEquals(-1, inventario.getAccesorio());
        Assert.assertEquals(-1, inventario.getCabeza());
        Assert.assertEquals(1, inventario.getIdInventario());
        Assert.assertEquals(-1, inventario.getManos1());
        Assert.assertEquals(-1, inventario.getManos2());
        Assert.assertEquals(-1, inventario.getPecho());
        Assert.assertEquals(-1, inventario.getPie());

        inventario.setAccesorio(1);
        inventario.setCabeza(2);
        inventario.setIdInventario(3);
        inventario.setManos1(4);
        inventario.setManos2(5);
        inventario.setPecho(6);
        inventario.setPie(7);

        Assert.assertEquals(1, inventario.getAccesorio());
        Assert.assertEquals(2, inventario.getCabeza());
        Assert.assertEquals(3, inventario.getIdInventario());
        Assert.assertEquals(4, inventario.getManos1());
        Assert.assertEquals(5, inventario.getManos2());
        Assert.assertEquals(6, inventario.getPecho());
        Assert.assertEquals(7, inventario.getPie());
    }
}
