import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M2798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer sT = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(sT.nextToken());
		int M = Integer.parseInt(sT.nextToken());

		int[] arr = new int[N];
		StringTokenizer sT1 = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(sT1.nextToken());
		}
		Arrays.sort(arr);
		int max=0;
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(max<(arr[i]+arr[j]+arr[k])&&(arr[i]+arr[j]+arr[k])<=M) {
						max=arr[i]+arr[j]+arr[k];
					}
				}
			}
		}
		
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}

}
