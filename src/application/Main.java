package application;
/*
 * 2. Stw�rz program do obs�ugi bankomatu. 
 * W bankomacie masz np. 520 z�otych w banknotach: 2x10, 6x50 2x100.
 *  Wczytaj z klawiatury kwot� do wyp�aty i albo wypisz jakie banknoty 
 *  zostan� wysuni�te (jakie nomina�y i w jakich ilo�ciach) 
 *  albo je�li to jest niemo�liwe to b��d.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm bankomat = new Atm();
		
		bankomat.printContent();
		bankomat.payment(120);
		bankomat.printContent();
		bankomat.payment(5000);
		bankomat.printContent();
		bankomat.payment(400);
		bankomat.printContent();
		
	}

}