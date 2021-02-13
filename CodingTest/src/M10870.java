import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M10870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(Fib(N));
	}
	public static int Fib(int num) {
		if(num==1) {
			return 1;
		}
		else if(num==0) {
			return 0;
		}
		return Fib(num-1)+Fib(num-2);
	}

}
