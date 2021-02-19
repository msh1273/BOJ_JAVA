import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2447 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
	}
	public static void star(int num) {
		for(int i=0; i<num; i++) {
			System.out.print("*");
		}
	}

}
