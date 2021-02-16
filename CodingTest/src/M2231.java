import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		int num = Integer.parseInt(N);
		int ans = 0;

		for(int i=0; i<num; i++) {
			int number = i;
			int sum=i;
			while(number!=0) {
				sum += number%10;
				number=number/10;
			}
			if(sum==num) {
				ans = i;
				break;
			}
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();

	}

}
