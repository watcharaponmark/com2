import java.util.Scanner;

public class W2P8_TheVoiceSU {
	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		int n=sacn.nextInt();
		int k=sacn.nextInt();
		int count1=1,count2=1;
		for(int i=1;i<=n;++i){
			int sex=sacn.nextInt();
			int score1=sacn.nextInt();
			int score2=sacn.nextInt();
			if(sex==1){
				if(score1>=9&&score2<9&&count1<=k){
					System.out.println(i+" "+1);
					count1++;
				}else if(score2>=9&&score1<9&&count2<=k){
					System.out.println(i+" "+2);
					count2++;
				}else if(score1>=9&&score2>=9&&count1<=k){
					System.out.println(i+" "+1);
					count1++;
				}else if(score1>=9&&score2>=9&&count1>k&&count2<=k){
					System.out.println(i+" "+2);
					count2++;
				}
				
			}else{
				if(score1>=9&&score2<9&&count1<=k){
					System.out.println(i+" "+1);
					count1++;
				}else if(score2>=9&&score1<9&&count2<=k){
					System.out.println(i+" "+2);
					count2++;
				}else if(score1>=9&&score2>=9&&count2<=k){
					System.out.println(i+" "+2);
					count2++;
				}else if(score1>=9&&score2>=9&&count2>k&&count1<=k){
					System.out.println(i+" "+1);
					count1++;
				}
				
			}
			
		}
		
	}

}
