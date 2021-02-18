import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class M11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr =  new int[N][2];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
				if(a1[0]==a2[0]) {
					return a1[1]-a2[1];
				}
				else
				return a1[0] - a2[0];
			}
		});
		  for(int i=0; i<N; i++) { 
			  for(int j=0; j<2; j++) { 
				  System.out.print(arr[i][j]+ " ");
				  }
			  System.out.println();
			  }

	}

}
