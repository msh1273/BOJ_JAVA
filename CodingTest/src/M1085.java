import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M1085 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x,y,w,h;
		StringTokenizer sT = new StringTokenizer(br.readLine(), " ");
		
		x=Integer.parseInt(sT.nextToken());
		y=Integer.parseInt(sT.nextToken());
		w=Integer.parseInt(sT.nextToken());
		h=Integer.parseInt(sT.nextToken());
		
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = w-x;
		arr[2] = h-y;
		arr[3] = y;
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}
