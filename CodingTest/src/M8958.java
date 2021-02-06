import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int count;
		int countSum;
		String str;
		for(int i=0; i<n; i++) {
			str = br.readLine();
			count=0;
			countSum=0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='O') {
				count++;
				countSum+=count;
				}
				else count=0;
			}
			System.out.println(countSum);
		}

	}

}
