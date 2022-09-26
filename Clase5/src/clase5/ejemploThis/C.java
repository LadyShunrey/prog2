package clase5.ejemploThis;

public class C extends A {
	
	public int c2(){
		atributoProtected = 8;
		return 10; 
	}
	
	public static void main (String[]args){
		A a1 = new A();
		
		a1.atributoPublico =2;
		a1.atributoProtected =5;
		a1.atributoSolito = 5;
	}
}
