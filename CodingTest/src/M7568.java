import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		int[] rank = new int[N];
		for(int i=0; i<rank.length; i++) {
			rank[i] = 1;
		}
		for(int i=0; i<N; i++) {
			StringTokenizer sT = new StringTokenizer(br.readLine(), " ");

			for(int j=0; j<2; j++) {
				arr[i][j] = Integer.parseInt(sT.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=1; j<N; j++) {
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
					rank[i] = 1;
				}
				else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank[i] = N;
				}
				else {
					rank[i]++;
				}
			}

		}
		for(int i=0; i<N; i++) {
			System.out.print(rank[i] + " ");
		}
	}

}
