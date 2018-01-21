package projectEuler;

public class Problem7 {

	public static boolean isPrime(int n){
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
		int count=0;
		int i=2;
		for(; count!=10001 ;i++){
			if(isPrime(i)) count++;
		}
		i--;
		System.out.println(i);

	}

}
