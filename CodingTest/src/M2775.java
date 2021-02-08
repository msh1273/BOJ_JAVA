import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2775 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[15][15];
		int T = Integer.parseInt(br.readLine());
		int K=0;	//Ãþ
		int N=0;	//È£
		
		for(int i=0; i<15; i++) {
			arr[0][i] = i; //0Ãþ iÈ£
			arr[i][1]= 1;	//iÃþ 1È£
		}
		
		for(int k=0; k<T; k++) {
			K=Integer.parseInt(br.readLine());
			N=Integer.parseInt(br.readLine());

		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++) {
				arr[i][j]=arr[i][j-1]+arr[i-1][j];
				}
			}
		
			System.out.println(arr[K][N]);
		}
	}

}
