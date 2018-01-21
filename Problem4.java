package projectEuler;

public class Problem4 {

	public static Boolean isPalindrome(int f){
		String s = Integer.toString(f);
		String l =  new StringBuffer(s).reverse().toString();
		if (s.equals(l))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		int p=0,l=0;
		Boolean noFound=false;
		for(int i =999; i> 100 && !noFound; i--){
			for(int j =999; j> 100 && !noFound; j--){
				p=i*j;
				if(isPalindrome(p) && p>l){
					l=p;
				}
			}
		}
		System.out.println(l);
	}

}
