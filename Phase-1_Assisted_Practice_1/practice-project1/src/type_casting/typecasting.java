package type_casting;

public class typecasting {
	public static void main(String[] args) {
		
		
		System.out.println("Implicit type casting");
		
		
		byte input = 7;
		System.out.println("value of input: " + input);
		
		//implicit type_casting
		
		int a = input;
		System.out.println("Value of a : " + a);
		
		double d = a;
		System.out.println("value of d : " + d);
		
		float f = a;
		System.out.println("value of f: " + f);
		
		short s = input;
		System.out.println("value of s: " + s);
		
		char b = 'B';
		System.out.println("Value of c : " + b);
		
		int n = b;
		System.out.println("value of n: " + n);
		
		float k = b;
		System.out.println("value of k: " + k);
		
		double e = b;
		System.out.println("value of e: " + e);
		
		long l = input;
		System.out.println("value of l: " + l);
		
		
		System.out.println(" ");
		
		
		System.out.println("Explicit type casting");
		
		double value = 38.42;
		int y = (int)value;
		System.out.println(y);
		
		float z = (float)value;
		System.out.println(z);
		
		long u = (long)value;
		System.out.println(u);
		
		short S = (short)value;
		System.out.println(S);
		
		
	}

}
