package dominio;

/**
 * Inventario de un personaje
 */
public class Inventario {
    /*
     * idInventario,manos1,manos2,pie,cabeza,pecho,accesorio
     */
    private int idInventario;
    private int manos1;
    private int manos2;
    private int pie;
    private int cabeza;
    private int pecho;
    private int accesorio;

    /**
     * Get id inventario
     *
     * @return int id inventario
     */
    public int getIdInventario() {
        return idInventario;
    }

    /**
     * Set id inventario
     *
     * @param idInventario
     *            int id
     */
    public void setIdInventario(final int idInventario) {
        this.idInventario = idInventario;
    }

    /**
     * Get mano 1
     *
     * @return int mano 1
     */
    public int getManos1() {
        return manos1;
    }

    /**
     * Set manos 1
     *
     * @param manos1
     *            mano 1
     */
    public void setManos1(final int manos1) {
        this.manos1 = manos1;
    }

    /**
     * Get manos 2
     *
     * @return int mano 2
     */
    public int getManos2() {
        return manos2;
    }

    /**
     * Set mano 2
     *
     * @param manos2
     *            int mano
     */
    public void setManos2(final int manos2) {
        this.manos2 = manos2;
    }

    /**
     * Get pie
     *
     * @return int pie
     */
    public int getPie() {
        return pie;
    }

    /**
     * Set pie
     *
     * @param pie
     *            int
     */
    public void setPie(final int pie) {
        this.pie = pie;
    }

    /**
     * Get cabeza
     *
     * @return int cabeza
     */
    public int getCabeza() {
        return cabeza;
    }

    /**
     * Set cabeza
     *
     * @param cabeza
     *            int
     */
    public void setCabeza(final int cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * Get pecho
     *
     * @return int pecho
     */
    public int getPecho() {
        return pecho;
    }

    /**
     * Set pecho
     *
     * @param pecho
     *            int
     */
    public void setPecho(final int pecho) {
        this.pecho = pecho;
    }

    /**
     * Get accesorio
     *
     * @return int accesorio
     */
    public int getAccesorio() {
        return accesorio;
    }

    /**
     * Set accesorio
     *
     * @param accesorio
     *            int
     */
    public void setAccesorio(final int accesorio) {
        this.accesorio = accesorio;
    }

    /**
     * Constructor
     *
     * @param idInventario
     *            id
     * @param manos1
     *            mano 1
     * @param manos2
     *            mano 2
     * @param pie
     *            pie
     * @param cabeza
     *            cabeza
     * @param pecho
     *            pecho
     * @param accesorio
     *            accesorio
     */
    public Inventario(final int idInventario, final int manos1, final int manos2, final int pie, final int cabeza,
            final int pecho, final int accesorio) {
        this.idInventario = idInventario;
        this.manos1 = manos1;
        this.manos2 = manos2;
        this.pie = pie;
        this.cabeza = cabeza;
        this.pecho = pecho;
        this.accesorio = accesorio;
    }

    /**
     * Constructor
     *
     * @param idInventario
     *            id
     */
    public Inventario(final int idInventario) {
        this.idInventario = idInventario;
        this.manos1 = -1;
        this.manos2 = -1;
        this.pie = -1;
        this.cabeza = -1;
        this.pecho = -1;
        this.accesorio = -1;
    }
}
