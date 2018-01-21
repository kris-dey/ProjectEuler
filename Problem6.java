package projectEuler;

public class Problem6 {

	public static void main(String[] args) {
		int sum=0, p=1,s=0;
		for(int i =1; i<=100; i++){
			sum = sum + i;
			s = s + (i*i);		
		}
		p = sum * sum;
		System.out.println(s-p);
	}
}
