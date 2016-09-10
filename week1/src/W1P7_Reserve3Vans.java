import java.util.Scanner;

public class W1P7_Reserve3Vans {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=0,b=0,c=0;
		for(int i=0;i<n;++i){
			int k=scan.nextInt();
			if(a<=b&&a<=c){
				System.out.println("A");
				a+=k;
			}else if(b<a&&b<=c){
				System.out.println("B");
				b+=k;
			}else if(c<a&&c<b){
				System.out.println("C");
				c+=k;
			}
		}
	}

}
