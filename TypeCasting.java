package day_2;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 100;
		int i = 1230;
		System.out.println("b = "+b);
		System.out.println("i = "+i);
		System.out.println("Data Widening");
		i = b;
		System.out.println(i);
		System.out.println(b);
		int j = 1000;
		double d = 21.98;
		//d = j ;
		System.out.println("j = " +j);
		System.out.println("d = "+d);
		System.out.println("data Narrowing");
		j = (int)d;
		System.out.println(j);
		System.out.println(d);
	}

}
