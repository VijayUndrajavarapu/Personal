package craze;

public class ClassForInterface implements O_Interface{

	private Object x;
	@Override
	public void abstractmethod() {
		System.out.println("UnImplemented menthod which is declared in interface we are using it here");
		
	}
	@Override
	public void noBody() {
		System.out.println("we must need to use all the un implemented set of rules which are given in the interface");
	}

	@Override
	public void EndsSemiColon() {
		System.out.println("we wil just tell what to do in the interface but in class we wil tell everything like how it will be done");
		
	}

	@Override
	public void KindOFRules() {
		System.out.println("interface is a blueprint of a class");
		
	}

	@Override
	public void CannotInstantiated() {
		System.out.println("interface lo implementation emi undadhu kabatti dhaniki object cheyyadam kudhardhu, kani indirect ga object ni creat cheyachu polymorphsm use chesi");
		
	}
	/**
	 *
	 */
	/**
	 *Java 8 ni override cheyyadam valana kindha unna method call avuthundhi 
	 */
	@Override
	public void Java8() {
		//System.out.println("OVERRIDE");
		//int y=10;
		//long z =10l;
		//System.out.println(y);
		System.out.println("empy");
		
	}

	}
