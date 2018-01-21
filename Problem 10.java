package projectEuler;

public class Problem10 {
	public static boolean isPrime(long n){
	    // Corner cases
	    if (n <= 1)  return false;
	    if (n <= 3)  return true;

	    // This is checked so that we can skip 
	    // middle five numbers in below loop
	    if (n%2 == 0 || n%3 == 0) return false;

	    for (int i=5; i*i<=n; i=i+6)
	        if (n%i == 0 || n%(i+2) == 0)
	           return false;

	    return true;
	}
	
	public static void main(String[] args) {
		long sum = 2; 
		double t = 2000000;
		for(long i=3; i<t;i++){
			
			if(isPrime(i)) sum = sum+i;
		}
		System.out.println(sum);	
		
	}
}
