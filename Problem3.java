package projectEuler;

public class Problem3 {
	
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
		Long n = 600851475143L;
	
		/*long square=0;
		for(long count=1;square>n;count++) square = count*count;
		long sq = (count-1)*(count-1);
		*/
	
		long c = (long)Math.sqrt(n);
		System.out.println(c);
		Boolean nofound = false;
		for(;c>0 && !nofound ;c--){
			if(n%c==0) {	
			        if(isPrime(c)){
			            nofound = true;
			            System.out.println(c);}
			}	
		}
		
	}

}
