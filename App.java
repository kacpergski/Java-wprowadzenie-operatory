class App {
	public static void main(String args[]) {

	// ZADANIE 1
	
	double tc, tf;
	
	tf = 23.31;
	
	tc = (tf - 32)*5/9;
	
	System.out.println("TF= :" +tf);
	System.out.println("TC= :" +tc);
	
	// ZADANIE 2
	
	double pi = 3.14;
	double obwod;
	int r = 7;
	
	obwod = 2*pi*r;
	System.out.println(" gi");
	System.out.println("****************Zadanie 2***************");
	System.out.println("R: " +r);
	System.out.println("Obwód: " +obwod);
	
	// ZADANIE 3
	
	double kilometers = 152.32;
	double accountBalance  =  -168.28;
	double days;
	int minutes = 2536;
	
	
	days = (double)minutes / 1440;
	System.out.println("****************Zadanie 2***************");
	
	
	System.out.println("Poodsumowanie podróży:");
	System.out.println("Kilometers: " + kilometers);
	System.out.println("Minutes: " + minutes);
	System.out.println("Days: " + days);
	System.out.println("Account Balance: " + accountBalance);
	
	}


}
