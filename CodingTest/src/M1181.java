import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class M1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			
			public int compare(String a, String b) {
				if(a.length()==b.length()) {
					return a.compareTo(b);
				}
				else {
				return a.length()-b.length();
				}
			}
		});
		StringBuilder sb = new StringBuilder();

		sb.append(arr[0]).append("\n");
		for(int i=1; i<arr.length; i++) {
			if(!arr[i-1].equals(arr[i]))
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}

}
