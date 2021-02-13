import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M10872 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ans=1;
		if(N==0) {
			System.out.println(1);
		}
		else {
		for(int i=1; i<=N; i++) {
			ans=ans*i;
		}
		System.out.println(ans);
		}
		}
}
