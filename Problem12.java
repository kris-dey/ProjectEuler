package projectEuler;

public class Problem12 {

	public static void main(String[] args) {
		int n=0;
		for(int i = 1; ;i++){
			n=i+n;
			int count=0;
			for(int j=1;j<=(n/2);j++){
				if(n%j==0) {
					count++;
				}
			}
			if(count>500)break;
			System.out.println(n);
		}
		System.out.println(n);
	}
}
