package craze;

public class superjey extends Parent{
	
	public void parentUse() {
		String n = "string";
		System.out.println("Callng methode with same name in child class");
	}
	public void m1() {
		System.out.println("child1 method");
		super.parentUse();
		System.out.println(super.n);
	}
	
	public static void main(String[] args) {
		
		superjey sj = new superjey();
		sj.m1();

	}

}
