import java.util.Scanner;

public class mark {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int arr[] = new int[n + 1];
		int b[] = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			arr[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		for (int i = 1; i <= k; ++i) {
			for (int j = 1; j <= n; ++j) {
				b[j] = scan.nextInt();

			}
			for (int j = 1; j <= n; ++j) {
				if (b[j] >= arr[j]) {
					System.out.print(b[j] + " ");
					arr[j] = b[j];
				} else if (b[j] < arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}

	}
	
}

