package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;
/**
 * Clase que representa los Items que posee el personaje.
 */
public class Item implements Serializable {
	private int idItem;
	private String nombre;
	private int wearLocation;
	private int bonusSalud;
	private int bonusEnergia;
	private int bonusFuerza;
	private int bonusDestreza;
	private int bonusInteligencia; 
	private String foto;
	private String fotoEquipado;
	private int fuerzaRequerida;
	private int destrezaRequerida; 
	private int inteligenciarequerida; 
	/**
	 * Constructor del Item.
	 * @param idItem Entero que representa el id del item.
	 * @param nombre String que representa el nombre del item.
	 * @param wearLocation Entero que representa donde se usa el item.
	 * @param bonusSalud Entero que representa el bonus de salud del item.
	 * @param bonusEnergia Entero que representa el bonus de energia del item.
	 * @param bonusFuerza Entero que representa el bonus de fuerza del item.
	 * @param bonusDestreza Entero que representa el bonus de destreza del item.
	 * @param bonusInteligencia Entero que representa el bonus de inteligencia del item.
	 * @param foto String que representa el path de la foto del item.
	 * @param fotoEquipado String que representa la foto cuando el item está equipado.
	 * @throws IOException Cuando no se encuentra la foto del item.
	 */
	public Item(final int idItem, final String nombre, final int wearLocation,
			final int bonusSalud, final int bonusEnergia, final int bonusFuerza, final int bonusDestreza,
			final int bonusInteligencia, final String foto, final String fotoEquipado) throws IOException {
		this.foto = foto; 
		this.idItem = idItem;
		this.nombre = nombre; 
		this.wearLocation = wearLocation;
		this.bonusSalud = bonusSalud;
		this.bonusEnergia = bonusEnergia;
		this.bonusFuerza = bonusFuerza;
		this.bonusDestreza = bonusDestreza;
		this.bonusInteligencia = bonusInteligencia;
		this.fotoEquipado = fotoEquipado;
		this.fuerzaRequerida = 0;
		this.destrezaRequerida = 0;
		this.inteligenciarequerida = 0;
	}
	public Item() {
		this.foto = ""; 
		this.idItem = 0;
		this.nombre = ""; 
		this.wearLocation = 0;
		this.bonusSalud = 0;
		this.bonusEnergia = 0;
		this.bonusFuerza = 0;
		this.bonusDestreza = 0;
		this.bonusInteligencia = 0;
		this.fotoEquipado = "";
		this.fuerzaRequerida = 0;
		this.destrezaRequerida = 0;
		this.inteligenciarequerida = 0;
	}
	/**
	 * Método que retorna la foto del item.
	 * @return retorna la foto del item.
	 * @throws IOException Cuando no se encuentra la foto del item.
	 */
	public BufferedImage getBufferedFoto() throws IOException {
		// TODO Auto-generated method stub
		return ImageIO.read(new File("recursos//" + foto));
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getWearLocation() {
		return wearLocation;
	}
	public void setWearLocation(int wearLocation) {
		this.wearLocation = wearLocation;
	}
	public int getBonusSalud() {
		return bonusSalud;
	}
	public void setBonusSalud(int bonusSalud) {
		this.bonusSalud = bonusSalud;
	}
	public int getBonusEnergia() {
		return bonusEnergia;
	}
	public void setBonusEnergia(int bonusEnergia) {
		this.bonusEnergia = bonusEnergia;
	}
	public int getBonusFuerza() {
		return bonusFuerza;
	}
	public void setBonusFuerza(int bonusFuerza) {
		this.bonusFuerza = bonusFuerza;
	}
	public int getBonusDestreza() {
		return bonusDestreza;
	}
	public void setBonusDestreza(int bonusDestreza) {
		this.bonusDestreza = bonusDestreza;
	}
	public int getBonusInteligencia() {
		return bonusInteligencia;
	}
	public void setBonusInteligencia(int bonusInteligencia) {
		this.bonusInteligencia = bonusInteligencia;
	}
	public int getFuerzaRequerida() {
		return fuerzaRequerida;
	}
	public void setFuerzaRequerida(int fuerzaRequerida) {
		this.fuerzaRequerida = fuerzaRequerida;
	}
	public int getDestrezaRequerida() {
		return destrezaRequerida;
	}
	public void setDestrezaRequerida(int destrezaRequerida) {
		this.destrezaRequerida = destrezaRequerida;
	}
	public String getFotoEquipado() {
		return fotoEquipado;
	}
	public void setFotoEquipado(String fotoEquipado) {
		this.fotoEquipado = fotoEquipado;
	}
	public int getInteligenciarequerida() {
		return inteligenciarequerida;
	}
	public void setInteligenciarequerida(int inteligenciarequerida) {
		this.inteligenciarequerida = inteligenciarequerida;
	}
	
}
