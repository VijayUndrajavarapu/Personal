package SepsPracy;

public class Frosy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("vija");	
			int x= 100;
			Integer x1 = Integer.valueOf(x);
			System.out.println(x1);
			
			String s1 =  "vijay";
			Float i1 = Float.valueOf(s1);
			float f1 = Float.parseFloat(s1);
			System.out.println(f1);
			try{
			    int i = Integer.parseInt(s1);
			    System.out.println(i);
			} catch(NumberFormatException ex){ // handle your exception
			   
			}
	}
}
