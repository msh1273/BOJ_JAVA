import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class M3052 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> hashSet = new HashSet<>();
		int num;
		String str;
		for(int i=0; i<10; i++) {
			num = Integer.parseInt(br.readLine());
			str = Integer.toString(num%42);
			hashSet.add(str);
		}
		System.out.println(hashSet.size());

	}
}
