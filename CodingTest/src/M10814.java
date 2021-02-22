import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N =  Integer.parseInt(br.readLine());
		String[][] person = new String[N][2];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			person[i][0] = st.nextToken();
			person[i][1] = st.nextToken();
		}
		Arrays.sort(person, (a1, a2)->{
			
			return Integer.parseInt(a1[0])-Integer.parseInt(a2[0]);
			
		});
		for(int i=0; i<N; i++) {
			bw.write(person[i][0] + " " + person[i][1] + "\n");
		}
		bw.flush();
		bw.close();
	}

}
