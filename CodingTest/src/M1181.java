import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class M1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<>();
		for(int i=0; i<N; i++) {
			hs.add(br.readLine());
		}
		String[] arr = new String[hs.size()];
		hs.toArray(arr);
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
		for(int i=0; i<hs.size(); i++) {
			System.out.println(arr[i]);
		}
	}

}
