import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=2; i<=N; i++) {
			if(N%i==0) {
				N=N/i;
				System.out.println(i);
				i--;
			}
			
		}
	}

}
