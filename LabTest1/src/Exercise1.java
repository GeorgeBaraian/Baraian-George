import java.math.BigInteger;
import java.util.Scanner;

public class Exercise1{
	
	static BigInteger factorial(int n) {
		BigInteger f = new BigInteger("1");
		
		for(int i = 2; i <= n; i++)
			f = f.multiply(BigInteger.valueOf(i));
		return f;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();//6
		int n = sc.nextInt();//49
		
		if(k > n)
		{
			System.out.println("k is bigger than n");
		}
		else {
			int c = n - k;
			
			BigInteger K = factorial(k);
			BigInteger N = factorial(n);
			BigInteger C = factorial(c);//n-k
			
			BigInteger D = K.multiply(C);
			
			double rez = N.doubleValue() / D.doubleValue();
			
			System.out.println(rez);
			
			sc.close();
			
		}
	}
}