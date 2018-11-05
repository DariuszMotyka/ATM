package application;
/*
 * 2. Stwórz program do obs³ugi bankomatu. 
 * W bankomacie masz np. 520 z³otych w banknotach: 2x10, 6x50 2x100.
 *  Wczytaj z klawiatury kwotê do wyp³aty i albo wypisz jakie banknoty 
 *  zostan¹ wysuniête (jakie nomina³y i w jakich iloœciach) 
 *  albo jeœli to jest niemo¿liwe to b³¹d.
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