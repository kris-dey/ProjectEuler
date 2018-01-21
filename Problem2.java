package projectEuler;

public class Problem2 {

	public static void main(String[] args) {
		double n1 = 1, n2 = 2, n3 = 0;
		double sum = 0;
		while (n3 < 4000000) {
			n3 = n2 + n1;
			if (n2 % 2 == 0)
				sum = sum + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println(sum);
	}
}
