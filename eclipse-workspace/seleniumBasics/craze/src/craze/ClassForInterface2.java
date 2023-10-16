package craze;

public class ClassForInterface2 implements O_Interface{

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
	 *default interface ni ekkada call cheyyakapoyina parvaledhu adhi direct ga interface nundi call avuthadhi (Java8 ane method)
	 */
	

	}
