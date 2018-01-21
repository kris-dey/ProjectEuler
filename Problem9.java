package projectEuler;

public class Problem9 {

	public static void main(String[] args) {
		int a = 1, b = 1, c = 1;
		Boolean f = false;

		for (; a < 1000 && !f ; a++) {
			for (b = 1; b < 1000 && !f; b++) {
				c = 1000 - a - b ;	
				if ((a*a)+(b*b)==c*c){
					f = true;
					System.out.println(a * b * c);
			}

		}

		}}

	}


