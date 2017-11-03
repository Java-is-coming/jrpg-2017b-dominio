package dominio;

public class Inventario {
/*
idInventario,manos1,manos2,pie,cabeza,pecho,accesorio
*/
	private int idInventario;
	private int manos1;
	private int manos2;
	private int pie;
	private int cabeza;
	private int pecho;
	private int accesorio;
	public int getIdInventario() {
		return idInventario;
	}
	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}
	public int getManos1() {
		return manos1;
	}
	public void setManos1(int manos1) {
		this.manos1 = manos1;
	}
	public int getManos2() {
		return manos2;
	}
	public void setManos2(int manos2) {
		this.manos2 = manos2;
	}
	public int getPie() {
		return pie;
	}
	public void setPie(int pie) {
		this.pie = pie;
	}
	public int getCabeza() {
		return cabeza;
	}
	public void setCabeza(int cabeza) {
		this.cabeza = cabeza;
	}
	public int getPecho() {
		return pecho;
	}
	public void setPecho(int pecho) {
		this.pecho = pecho;
	}
	public int getAccesorio() {
		return accesorio;
	}
	public void setAccesorio(int accesorio) {
		this.accesorio = accesorio;
	}
	public Inventario(int idInventario, int manos1, int manos2, int pie, int cabeza, int pecho, int accesorio) {
		this.idInventario = idInventario;
		this.manos1 = manos1;
		this.manos2 = manos2;
		this.pie = pie;
		this.cabeza = cabeza;
		this.pecho = pecho;
		this.accesorio = accesorio;
	}
	public Inventario(int idInventario) {
		this.idInventario = idInventario;
		this.manos1 = -1;
		this.manos2 = -1;
		this.pie = -1;
		this.cabeza = -1;
		this.pecho = -1;
		this.accesorio = -1;
	}	
}
