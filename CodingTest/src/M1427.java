import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class M1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		int[] arr = new int [N.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = N.charAt(i)-'0';
		}
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			bw.write(String.valueOf(arr[i]));
		}
		bw.flush();
		bw.close();
	}

}
