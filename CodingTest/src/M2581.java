import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2581 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum=0;
		int minimum=N;
		for(int i=M; i<=N; i++) {
			if(primeN(i)) {
				sum+=i;
				if(minimum>i) {
					minimum = i;
				}
			}
		}
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(minimum);
		}
	}
	public static boolean primeN(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
