package dominio;

/**
 * Mochila del jugador
 */
public class Mochila {
    private int idMochila;
    private int item1;
    private int item2;
    private int item3;
    private int item4;
    private int item5;
    private int item6;
    private int item7;
    private int item8;
    private int item9;
    private int item10;
    private int item11;
    private int item12;
    private int item13;
    private int item14;
    private int item15;
    private int item16;
    private int item17;
    private int item18;
    private int item19;
    private int item20;

    private static final int POS1 = 1, POS2 = 2, POS3 = 3, POS4 = 4, POS5 = 5, POS6 = 6, POS7 = 7, POS8 = 8, POS9 = 9,
            POS10 = 10;
    private static final int POS11 = 11, POS12 = 12, POS13 = 13, POS14 = 14, POS15 = 15, POS16 = 16, POS17 = 17,
            POS18 = 18, POS19 = 19, POS20 = 20;

    /**
     * Construye la mochila
     *
     * @param idMochila
     *            id
     * @param item1
     *            1
     * @param item2
     *            2
     * @param item3
     *            3
     * @param item4
     *            4
     * @param item5
     *            5
     * @param item6
     *            6
     * @param item7
     *            7
     * @param item8
     *            8
     * @param item9
     *            9
     * @param item10
     *            10
     * @param item11
     *            11
     * @param item12
     *            12
     * @param item13
     *            13
     * @param item14
     *            14
     * @param item15
     *            15
     * @param item16
     *            16
     * @param item17
     *            17
     * @param item18
     *            18
     * @param item19
     *            19
     * @param item20
     *            20
     */
    public Mochila(final int idMochila, final int item1, final int item2, final int item3, final int item4,
            final int item5, final int item6, final int item7, final int item8, final int item9, final int item10,
            final int item11, final int item12, final int item13, final int item14, final int item15, final int item16,
            final int item17, final int item18, final int item19, final int item20) {
        this.idMochila = idMochila;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.item7 = item7;
        this.item8 = item8;
        this.item9 = item9;
        this.item10 = item10;
        this.item11 = item11;
        this.item12 = item12;
        this.item13 = item13;
        this.item14 = item14;
        this.item15 = item15;
        this.item16 = item16;
        this.item17 = item17;
        this.item18 = item18;
        this.item19 = item19;
        this.item20 = item20;
    }

    /**
     * Constructor
     *
     * @param idMochila
     *            id
     */
    public Mochila(final int idMochila) {
        this.idMochila = idMochila;
        this.item1 = -1;
        this.item2 = -1;
        this.item3 = -1;
        this.item4 = -1;
        this.item5 = -1;
        this.item6 = -1;
        this.item7 = -1;
        this.item8 = -1;
        this.item9 = -1;
        this.item10 = -1;
        this.item11 = -1;
        this.item12 = -1;
        this.item13 = -1;
        this.item14 = -1;
        this.item15 = -1;
        this.item16 = -1;
        this.item17 = -1;
        this.item18 = -1;
        this.item19 = -1;
        this.item20 = -1;
    }

    /**
     * Constructor
     */
    public Mochila() {
        this.idMochila = 0;
        this.item1 = -1;
        this.item2 = -1;
        this.item3 = -1;
        this.item4 = -1;
        this.item5 = -1;
        this.item6 = -1;
        this.item7 = -1;
        this.item8 = -1;
        this.item9 = -1;
        this.item10 = -1;
        this.item11 = -1;
        this.item12 = -1;
        this.item13 = -1;
        this.item14 = -1;
        this.item15 = -1;
        this.item16 = -1;
        this.item17 = -1;
        this.item18 = -1;
        this.item19 = -1;
        this.item20 = -1;
    }

    /**
     * Set int
     *
     * @param pos
     *            posicion
     * @param val
     *            valor
     */
    public void setInt(final int pos, final int val) {

        switch (pos) {
        case POS1:
            setItem1(val);
        case POS2:
            setItem2(val);
        case POS3:
            setItem3(val);
        case POS4:
            setItem4(val);
        case POS5:
            setItem5(val);
        case POS6:
            setItem6(val);
        case POS7:
            setItem7(val);
        case POS8:
            setItem8(val);
        case POS9:
            setItem9(val);
        case POS10:
            setItem10(val);
        case POS11:
            setItem11(val);
        case POS12:
            setItem12(val);
        case POS13:
            setItem13(val);
        case POS14:
            setItem14(val);
        case POS15:
            setItem15(val);
        case POS16:
            setItem16(val);
        case POS17:
            setItem17(val);
        case POS18:
            setItem18(val);
        case POS19:
            setItem19(val);
        case POS20:
            setItem20(val);
        default:
            break;
        }

    }

    /**
     * Get by id
     *
     * @param i
     *            indice
     * @return int item
     */
    public int getById(final int i) {
        switch (i) {
        case POS1:
            return getItem1();
        case POS2:
            return getItem2();
        case POS3:
            return getItem3();
        case POS4:
            return getItem4();
        case POS5:
            return getItem5();
        case POS6:
            return getItem6();
        case POS7:
            return getItem7();
        case POS8:
            return getItem8();
        case POS9:
            return getItem9();
        case POS10:
            return getItem10();
        case POS11:
            return getItem11();
        case POS12:
            return getItem12();
        case POS13:
            return getItem13();
        case POS14:
            return getItem14();
        case POS15:
            return getItem15();
        case POS16:
            return getItem16();
        case POS17:
            return getItem17();
        case POS18:
            return getItem18();
        case POS19:
            return getItem19();
        case POS20:
            return getItem20();
        default:
            break;
        }

        return -1;
    }

    /**
     * Get id mochila
     *
     * @return int id mochila
     */
    public int getIdMochila() {
        return idMochila;
    }

    /**
     * Set id mochila
     *
     * @param idMochila
     *            int id
     */
    public void setIdMochila(final int idMochila) {
        this.idMochila = idMochila;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem1() {
        return item1;
    }

    /**
     * Set item 1
     *
     * @param item1
     *            int
     */
    public void setItem1(final int item1) {
        this.item1 = item1;
    }

    /**
     * Get item 2
     *
     * @return int item2
     */
    public int getItem2() {
        return item2;
    }

    /**
     * Set item 1
     *
     * @param item2
     *            int
     */
    public void setItem2(final int item2) {
        this.item2 = item2;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem3() {
        return item3;
    }

    /**
     * Set item 1
     *
     * @param item3
     *            int
     */
    public void setItem3(final int item3) {
        this.item3 = item3;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem4() {
        return item4;
    }

    /**
     * Set item 1
     *
     * @param item4
     *            int
     */
    public void setItem4(final int item4) {
        this.item4 = item4;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem5() {
        return item5;
    }

    /**
     * Set item 1
     *
     * @param item5
     *            int
     */
    public void setItem5(final int item5) {
        this.item5 = item5;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem6() {
        return item6;
    }

    /**
     * Set item 1
     *
     * @param item6
     *            int
     */
    public void setItem6(final int item6) {
        this.item6 = item6;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem7() {
        return item7;
    }

    /**
     * Set item 1
     *
     * @param item7
     *            int
     */
    public void setItem7(final int item7) {
        this.item7 = item7;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem8() {
        return item8;
    }

    /**
     * Set item 1
     *
     * @param item8
     *            int
     */
    public void setItem8(final int item8) {
        this.item8 = item8;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem9() {
        return item9;
    }

    /**
     * Set item 1
     *
     * @param item9
     *            int
     */
    public void setItem9(final int item9) {
        this.item9 = item9;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem10() {
        return item10;
    }

    /**
     * Set item 1
     *
     * @param item10
     *            int
     */
    public void setItem10(final int item10) {
        this.item10 = item10;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem11() {
        return item11;
    }

    /**
     * Set item 1
     *
     * @param item11
     *            int
     */
    public void setItem11(final int item11) {
        this.item11 = item11;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem12() {
        return item12;
    }

    /**
     * Set item 1
     *
     * @param item12
     *            int
     */
    public void setItem12(final int item12) {
        this.item12 = item12;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem13() {
        return item13;
    }

    /**
     * Set item 1
     *
     * @param item13
     *            int
     */
    public void setItem13(final int item13) {
        this.item13 = item13;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem14() {
        return item14;
    }

    /**
     * Set item 1
     *
     * @param item14
     *            int
     */
    public void setItem14(final int item14) {
        this.item14 = item14;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem15() {
        return item15;
    }

    /**
     * Set item 1
     *
     * @param item15
     *            int
     */
    public void setItem15(final int item15) {
        this.item15 = item15;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem16() {
        return item16;
    }

    /**
     * Set item 1
     *
     * @param item16
     *            int
     */
    public void setItem16(final int item16) {
        this.item16 = item16;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem17() {
        return item17;
    }

    /**
     * Set item 1
     *
     * @param item17
     *            int
     */
    public void setItem17(final int item17) {
        this.item17 = item17;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem18() {
        return item18;
    }

    /**
     * Set item 1
     *
     * @param item18
     *            int
     */
    public void setItem18(final int item18) {
        this.item18 = item18;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem19() {
        return item19;
    }

    /**
     * Set item 1
     *
     * @param item19
     *            int
     */
    public void setItem19(final int item19) {
        this.item19 = item19;
    }

    /**
     * Get item 1
     *
     * @return int item1
     */
    public int getItem20() {
        return item20;
    }

    /**
     * Set item 1
     *
     * @param item20
     *            int
     */
    public void setItem20(final int item20) {
        this.item20 = item20;
    }
}
