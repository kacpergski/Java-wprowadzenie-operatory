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
	System.out.println("");
	System.out.println("****************Zadanie 2***************");
	System.out.println("R: " +r);
	System.out.println("Obwód: " +obwod);
	
	// ZADANIE 3
	
	double kilometers = 152.32;
	double accountBalance  =  -168.28;
	double days;
	int minutes = 2536;
	
	
	days = (double)minutes / 1440;
	
	System.out.println("");
	System.out.println("****************Zadanie 3***************");
	
	
	System.out.println("Podsumowanie podróży:");
	System.out.println("Kilometers: " + kilometers);
	System.out.println("Minutes: " + minutes);
	System.out.println("Days: " + days);
	System.out.println("Account Balance: " + accountBalance);
	
	System.out.println("");
	System.out.println("****************Zadanie 4***************");
	
	int x = 10;
	int y = 20;
	int z = x + y;
	
	System.out.println("x + y = " + z);
	
	System.out.println("");
	System.out.println("****************Zadanie 5***************");
	
	int a = 7,  b = 9, c = 12;
	int triangleRegion = a + b + c;
	
	System.out.println("Obwód trójkąta = " + triangleRegion);
	
	
	System.out.println("");
	System.out.println("****************Zadanie 6***************");
	
	int m=-4;
	int n=m*-1;
	
	 int o=  m<0?n:m;
	
	System.out.println("Wart  m = " + m);
	System.out.println("Wart bezwgl m = " + o);
	
	System.out.println("");
	System.out.println("****************Zadanie 7***************");
	
	int rn;
	double rm;
	rn = 47 % 10;
	rm = 35.5 % 6;
	 
	
	System.out.println("Reszta z dzielnia 47 przez 10 = " + rn);
	System.out.println("Reszta z dzielnia 35.5 przez 6 = " + rm);
	
	}


}
