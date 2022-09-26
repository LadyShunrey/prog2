package clase5.ejemploThis;

public class A {
	
	public int atributoPublico; //NUNCA PONER PUBLICO;
	protected int atributoProtected;
	private int atributoPrivate;
	int atributoSolito;
	
	public int a1(){
		return 1;
	}
	public int a2(){
		return 2;
	}
	public int a3(){
		return this.a1() + this.a2();
	}
}
