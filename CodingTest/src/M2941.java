import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count=0;
		String S = br.readLine();
		
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i)=='c'&&i<S.length()-1) {
				if(S.charAt(i+1)=='='||S.charAt(i+1)=='-') {
					i+=1;
				}
			}
			else if(S.charAt(i)=='d') {
				if(i<S.length()-2&&S.charAt(i+1)=='z'&&S.charAt(i+2)=='=') {
					i+=2;
				}
				else if(i<S.length()-1&&S.charAt(i+1)=='-'&&i<S.length()-1) {
					i+=1;
				}
			}
			else if(S.charAt(i)=='l'&&i<S.length()-1) {
				if(S.charAt(i+1)=='j') {
					i+=1;
				}
			}
			else if(S.charAt(i)=='n'&&i<S.length()-1) {
				if(S.charAt(i+1)=='j') {
					i+=1;
				}
			}
			else if(S.charAt(i)=='s'&&i<S.length()-1) {
				if(S.charAt(i+1)=='=') {
					i+=1;
				}
			}
			else if(S.charAt(i)=='z'&&i<S.length()-1) {
				if(S.charAt(i+1)=='=') {
					i+=1;
				}
			}
			
			count++;
		}
		System.out.println(count);
		
	}

}
