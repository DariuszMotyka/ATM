package application;

public class Atm {
	int[][] bills = {{2,10},
			 		 {0,20},
			 		 {6,50},
			 		 {2,100},
			 		 {0,200},
			 		 {0,500}};
	
	
	public Atm() {
		System.out.println("Uruchamianie...");
	}
	
	
	public void printContent() {
		int sum = 0;
		System.out.println("--------------------------------");
		System.out.println("Zawarto�� bankomatu:");
		System.out.print("Nomina�y: ");
		for(int i =0;i<bills.length;i++) {
			System.out.print(bills[i][0]+" - "+bills[i][1]+" |");
			sum+=bills[i][0]*bills[i][1];
		}
		System.out.println();
		System.out.println("Suma:"+sum);
	}
	
	public int getContent() {
		int sum = 0;
		for(int i =0;i<bills.length;i++) {
			sum+=bills[i][0]*bills[i][1];
		}
		return sum;
	}
	
	
	public void payment(int value) {
		System.out.println("--------------------------------");
		System.out.println("Kwota do wyp�aty:"+value);
		if(value%10>0) {
			System.out.println("B��dnie wprowadzona kwota! Bankomat wyp�aca tylko banknoty.");
		}else if(value>getContent()) {
			System.out.println("Nie wystarczaj�ca ilo�� pieni�dzy w bankomacie!");
		}else {
			int paymentValue=value;
			int numberOfBills=0;
			for(int i=bills.length-1;i>=0;i--) {
				if(paymentValue>=bills[i][1] && bills[i][0] > 0) {
					numberOfBills = (paymentValue/bills[i][1]);
					if(numberOfBills> bills[i][0]) {
						numberOfBills=bills[i][0];
					}
					
					if(paymentValue<bills[i][1]) {
						continue;
					}else {
						paymentValue=paymentValue-bills[i][1]*numberOfBills;
					}
					bills[i][0]=bills[i][0]-numberOfBills;	
				}
			}
			
			if(paymentValue==0) {
				System.out.println("--------------------------------");
				System.out.println("Operacja powiod�a si�!");
				System.out.println("Wyp�acono:"+value);
			}else {
				System.out.println("--------------------------------");
				System.out.println("Operacja nie powiod�a si�!");
				System.out.println("Wyp�acono:"+(value-paymentValue)+" z "+value);
			}
		}
		
		
	}
}