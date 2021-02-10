import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer sT = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(sT.nextToken());
		int N = Integer.parseInt(sT.nextToken());
		
		int[] Prime = new int[N+1];
		
		for(int i=2; i<Prime.length; i++) {
			Prime[i]=i;
		}
		
		for(int i=2; i<=N; i++) {
			
			for(int j=i+i; j<=N; j=j+i) {
				Prime[j] =0;
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(Prime[i]!=0) {
				System.out.println(i);
			}
		}
	}
}
