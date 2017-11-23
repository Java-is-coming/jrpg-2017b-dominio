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
	private static final long serialVersionUID = 1L;
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
	 *
	 * @param idItem
	 *            Entero que representa el id del item.
	 * @param nombre
	 *            String que representa el nombre del item.
	 * @param wearLocation
	 *            Entero que representa donde se usa el item.
	 * @param bonusSalud
	 *            Entero que representa el bonus de salud del item.
	 * @param bonusEnergia
	 *            Entero que representa el bonus de energia del item.
	 * @param bonusFuerza
	 *            Entero que representa el bonus de fuerza del item.
	 * @param bonusDestreza
	 *            Entero que representa el bonus de destreza del item.
	 * @param bonusInteligencia
	 *            Entero que representa el bonus de inteligencia del item.
	 * @param foto
	 *            String que representa el path de la foto del item.
	 * @param fotoEquipado
	 *            String que representa la foto cuando el item está equipado.
	 * @throws IOException
	 *             Cuando no se encuentra la foto del item.
	 */
	public Item(final int idItem, final String nombre, final int wearLocation, final int bonusSalud,
			final int bonusEnergia, final int bonusFuerza, final int bonusDestreza, final int bonusInteligencia,
			final String foto, final String fotoEquipado) throws IOException {
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

	/**
	 * Constructor vacio
	 */
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
	 *
	 * @return retorna la foto del item.
	 * @throws IOException
	 *             Cuando no se encuentra la foto del item.
	 */
	public BufferedImage getBufferedFoto() throws IOException {
		// TODO Auto-generated method stub
		return ImageIO.read(new File("recursos//" + foto));
	}

	/**
	 * Get id item
	 *
	 * @return int id item
	 */
	public int getIdItem() {
		return idItem;
	}

	/**
	 * Set id item
	 *
	 * @param idItem
	 *            int
	 */
	public void setIdItem(final int idItem) {
		this.idItem = idItem;
	}

	/**
	 * Get foto
	 *
	 * @return String foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * Set foto
	 *
	 * @param foto
	 *            string
	 */
	public void setFoto(final String foto) {
		this.foto = foto;
	}

	/**
	 * Get nombre
	 *
	 * @return nombre string
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set nombre
	 *
	 * @param nombre
	 *            string
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Get wear location
	 *
	 * @return int location
	 */
	public int getWearLocation() {
		return wearLocation;
	}

	/**
	 * Set wear location
	 *
	 * @param wearLocation
	 *            int
	 */
	public void setWearLocation(final int wearLocation) {
		this.wearLocation = wearLocation;
	}

	/**
	 * Get bonus salud
	 *
	 * @return int salud
	 */
	public int getBonusSalud() {
		return bonusSalud;
	}

	/**
	 * Set bonus salud
	 *
	 * @param bonusSalud
	 *            int
	 */
	public void setBonusSalud(final int bonusSalud) {
		this.bonusSalud = bonusSalud;
	}

	/**
	 * Get bonus energia
	 *
	 * @return int bonus
	 */
	public int getBonusEnergia() {
		return bonusEnergia;
	}

	/**
	 * Set bonus energia
	 *
	 * @param bonusEnergia
	 *            int
	 */
	public void setBonusEnergia(final int bonusEnergia) {
		this.bonusEnergia = bonusEnergia;
	}

	/**
	 * Get bonus fuerza
	 *
	 * @return int bonus fuerza
	 */
	public int getBonusFuerza() {
		return bonusFuerza;
	}

	/**
	 * Set bonus fuerza
	 *
	 * @param bonusFuerza
	 *            int
	 */
	public void setBonusFuerza(final int bonusFuerza) {
		this.bonusFuerza = bonusFuerza;
	}

	/**
	 * Get bonus fuerza
	 *
	 * @return int bonus fuerza
	 */
	public int getBonusDestreza() {
		return bonusDestreza;
	}

	/**
	 * Set bonus destreza
	 *
	 * @param bonusDestreza
	 *            int
	 */
	public void setBonusDestreza(final int bonusDestreza) {
		this.bonusDestreza = bonusDestreza;
	}

	/**
	 * Get bonus inteligencia
	 *
	 * @return int bonus inteligencia
	 */
	public int getBonusInteligencia() {
		return bonusInteligencia;
	}

	/**
	 * Set bonus inteligencia
	 *
	 * @param bonusInteligencia
	 *            int
	 */
	public void setBonusInteligencia(final int bonusInteligencia) {
		this.bonusInteligencia = bonusInteligencia;
	}

	/**
	 * Fuerza requerida
	 *
	 * @return int fuerzaRequerida
	 */
	public int getFuerzaRequerida() {
		return fuerzaRequerida;
	}

	/**
	 * Set fuerza requerida
	 *
	 * @param fuerzaRequerida
	 *            int
	 */
	public void setFuerzaRequerida(final int fuerzaRequerida) {
		this.fuerzaRequerida = fuerzaRequerida;
	}

	/**
	 * Destreza requerida
	 *
	 * @return int destrezaRequerida
	 */
	public int getDestrezaRequerida() {
		return destrezaRequerida;
	}

	/**
	 * Set destreza requerida
	 *
	 * @param destrezaRequerida
	 *            int
	 */
	public void setDestrezaRequerida(final int destrezaRequerida) {
		this.destrezaRequerida = destrezaRequerida;
	}

	/**
	 * Foto item equipado
	 *
	 * @return String foto
	 */
	public String getFotoEquipado() {
		return fotoEquipado;
	}

	/**
	 * Set foto item equipado
	 *
	 * @param fotoEquipado
	 *            string
	 */
	public void setFotoEquipado(final String fotoEquipado) {
		this.fotoEquipado = fotoEquipado;
	}

	/**
	 * Inteligencia requerida
	 *
	 * @return int inteligencia req
	 */
	public int getInteligenciarequerida() {
		return inteligenciarequerida;
	}

	/**
	 * Set inteligencia requerida
	 *
	 * @param inteligenciarequerida
	 *            int
	 */
	public void setInteligenciarequerida(final int inteligenciarequerida) {
		this.inteligenciarequerida = inteligenciarequerida;
	}

}
