import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class M1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0;
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			if(check()) {
				count++;
			}
		}
		System.out.println(count);
			
		
		
	}
	public static boolean check() throws IOException {
		boolean[] alpha = new boolean[26];
		String str = br.readLine();
		int preview=0;
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(preview!=now) {
				if(!alpha[now-'a']) {
					alpha[now-'a']=true;
					preview = now;
				}
				else return false;
			}
		}
		return true;
		
	}

}
