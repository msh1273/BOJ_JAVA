import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2292 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i=0;
		while(true) {
			i++;
			if(N<=3*i*i-3*i+1) {
				System.out.println(i);
				break;
			}
		}

	}

}
