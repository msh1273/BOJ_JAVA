import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M4948 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N; 
		int count = 0;
		while(true){
			N = Integer.parseInt(br.readLine());
			if(N==1) {
				count=1;
			}
			else if(N==0) {
				break;
			}
			else {
				for(int i=N+1; i<=2*N; i++) {
					if(Pn(i)) {
						count++;
					}
				}
			}

			System.out.println(count);
			count=0;
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
