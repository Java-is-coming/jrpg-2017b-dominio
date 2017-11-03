package dominio;

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
		
	public Mochila(int idMochila, int item1, int item2, int item3, int item4, int item5, int item6, int item7,
			int item8, int item9, int item10, int item11, int item12, int item13, int item14, int item15, int item16,
			int item17, int item18, int item19, int item20) {
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

	
	public Mochila(int idMochila) {
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
	
	public void setInt(int pos, int val) {
		switch (pos) {
		case 1:
			setItem1(val);
		case 2:
			setItem2(val);
		case 3:
			setItem3(val);
		case 4:
			setItem4(val);
		case 5:
			setItem5(val);
		case 6:
			setItem6(val);
		case 7:
			setItem7(val);
		case 8:
			setItem8(val);
		case 9:
			setItem9(val);
		case 10:
			setItem10(val);
		case 11:
			setItem11(val);
		case 12:
			setItem12(val);
		case 13:
			setItem13(val);
		case 14:
			setItem14(val);
		case 15:
			setItem15(val);
		case 16:
			setItem16(val);
		case 17:
			setItem17(val);
		case 18:
			setItem18(val);
		case 19:
			setItem19(val);
		case 20:
			setItem20(val);
		}
		
	}
	
	public int getById(int i) {
		switch (i) {
		case 1:
			return getItem1();
		case 2:
			return getItem2();
		case 3:
			return getItem3();
		case 4:
			return getItem4();
		case 5:
			return getItem5();
		case 6:
			return getItem6();
		case 7:
			return getItem7();
		case 8:
			return getItem8();
		case 9:
			return getItem9();
		case 10:
			return getItem10();
		case 11:
			return getItem11();
		case 12:
			return getItem12();
		case 13:
			return getItem13();
		case 14:
			return getItem14();
		case 15:
			return getItem15();
		case 16:
			return getItem16();
		case 17:
			return getItem17();
		case 18:
			return getItem18();
		case 19:
			return getItem19();
		case 20:
			return getItem20();
		}
		
		return -1;
	}
	
	public int getIdMochila() {
		return idMochila;
	}
	public void setIdMochila(int idMochila) {
		this.idMochila = idMochila;
	}
	public int getItem1() {
		return item1;
	}
	public void setItem1(int item1) {
		this.item1 = item1;
	}
	public int getItem2() {
		return item2;
	}
	public void setItem2(int item2) {
		this.item2 = item2;
	}
	public int getItem3() {
		return item3;
	}
	public void setItem3(int item3) {
		this.item3 = item3;
	}
	public int getItem4() {
		return item4;
	}
	public void setItem4(int item4) {
		this.item4 = item4;
	}
	public int getItem5() {
		return item5;
	}
	public void setItem5(int item5) {
		this.item5 = item5;
	}
	public int getItem6() {
		return item6;
	}
	public void setItem6(int item6) {
		this.item6 = item6;
	}
	public int getItem7() {
		return item7;
	}
	public void setItem7(int item7) {
		this.item7 = item7;
	}
	public int getItem8() {
		return item8;
	}
	public void setItem8(int item8) {
		this.item8 = item8;
	}
	public int getItem9() {
		return item9;
	}
	public void setItem9(int item9) {
		this.item9 = item9;
	}
	public int getItem10() {
		return item10;
	}
	public void setItem10(int item10) {
		this.item10 = item10;
	}
	public int getItem11() {
		return item11;
	}
	public void setItem11(int item11) {
		this.item11 = item11;
	}
	public int getItem12() {
		return item12;
	}
	public void setItem12(int item12) {
		this.item12 = item12;
	}
	public int getItem13() {
		return item13;
	}
	public void setItem13(int item13) {
		this.item13 = item13;
	}
	public int getItem14() {
		return item14;
	}
	public void setItem14(int item14) {
		this.item14 = item14;
	}
	public int getItem15() {
		return item15;
	}
	public void setItem15(int item15) {
		this.item15 = item15;
	}
	public int getItem16() {
		return item16;
	}
	public void setItem16(int item16) {
		this.item16 = item16;
	}
	public int getItem17() {
		return item17;
	}
	public void setItem17(int item17) {
		this.item17 = item17;
	}
	public int getItem18() {
		return item18;
	}
	public void setItem18(int item18) {
		this.item18 = item18;
	}
	public int getItem19() {
		return item19;
	}
	public void setItem19(int item19) {
		this.item19 = item19;
	}
	public int getItem20() {
		return item20;
	}
	public void setItem20(int item20) {
		this.item20 = item20;
	}	
}
