import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer sT = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(sT.nextToken());
		int B = Integer.parseInt(sT.nextToken());
		int C = Integer.parseInt(sT.nextToken());
		int n=0;
		if(B>=C) {
			n = -1;
		}
		else {
			n = A/(C-B)+1;
		}
		System.out.println(n);
	}
}
