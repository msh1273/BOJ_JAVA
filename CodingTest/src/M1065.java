import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int answer = hansu(num);
		System.out.println(answer);
	}
	static int hansu(int num) {
		int count=0;
		if(num<100) {
			return num;
		}
		else {
			count=99;
			if(num==1000) {
				num=999;
			}
		}
			for(int i=100; i<=num; i++) {
				int a3 = i/100;
				int a2 = (i/10)%10;
				int a1 = i%10;
				
				if(a3-a2==a2-a1) {
					count++;
				}
			}
		return count;
	}
}
