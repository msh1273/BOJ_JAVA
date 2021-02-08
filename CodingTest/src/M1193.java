import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		StringTokenizer sT = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(sT.nextToken());
		int B = Integer.parseInt(sT.nextToken());
		int V = Integer.parseInt(sT.nextToken());
		int day=0;
		int now=0;
		
		day = (V-B)/(A-B);
		if((V-B)%(A-B)!=0) {
			day++;
		}
		System.out.println(day);
	}

}
