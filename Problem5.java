package projectEuler;

public class problem5 {

	public static void main(String[] args) {
		int l=1;
		for(int i=1; i<=20;i++){
			if(l%i!=0)	{
				int temp = i;
				for(int h=2; h<i; h++){
					if(temp%h==0) temp=temp/h;
				}
				l=temp*l;
			}
		}
		System.out.println(l);

	}

}
