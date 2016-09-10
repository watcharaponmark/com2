import java.util.Scanner;
public class CountClosestNum {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int min = Integer.MAX_VALUE,count=0;
		//vnwnvownv
		int arr[] = new int[N];
		for (int i = 0; i < N; ++i) {
			arr[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		for (int i = 0; i < N; ++i) {
			
			
			
			if (arr[i] >= k) {
				if (arr[i] - k <= min) {
					min = (arr[i] - k);
				}
			} else {
				if (k - arr[i] < min) {
					min = (k - arr[i]);
				}

			}
		}
		for(int i=0;i<N;++i){
			if(arr[i]+min==k||arr[i]-min==k){
				count++;
			}
		}
     System.out.print(min+"\n"+count);
	}
 }