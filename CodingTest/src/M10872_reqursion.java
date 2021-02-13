import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M10872_reqursion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(fac(N));
	}
	public static int fac(int num) {
		if(num==0||num==1) {
			return 1;
		}
		return num*fac(num-1);
	}

}
