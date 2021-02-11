import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M9020 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int N;
		int a,b;
		int min;
		for(int i=0; i<T; i++) {
			N = Integer.parseInt(br.readLine());
			for(int j=N-1; j>=2; j--) {
				a=j;
				b=N-a;
				if(Pn(a)&&Pn(b)&&b!=1) {
					if(a<=b) {
						System.out.println(a + " " + b);
						break;
					}

				}
			}
			
		}
	}
	public static boolean Pn(int num) {
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
