package clase5.ejemploThis;


public class C extends A {
	
	public int a3(){
		return super.a3()-3;
	}
	
	public int a2(){
		return 100;
	}
	
	public int c2(){
		atributoProtected = 8;
		return 10; 
	}
	
	public static void main (String[]args){
		A a1 = new A();
		
		a1.atributoPublico =2;
		/*a1.atributoProtected = 5;  //ESTOS ANTES ANDABAN PORQUE ESTABAN EN EL MISMO PAQUETE PERO AHORA YA NO.
		a1.atributoSolito = 5;*/
	}
}
