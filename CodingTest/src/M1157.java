import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		String S = br.readLine();
		
		for(int i=0; i<S.length(); i++) {
			if('A' <= S.charAt(i) && S.charAt(i)<= 'Z') {
				arr[S.charAt(i) - 'A']++;
			}
			else {
				arr[S.charAt(i)-'a']++;
			}
		}
		int max=0;
		char ch = '?';
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch = (char) (i+65);
			}
			else if(arr[i]==max){
				ch = '?';
			}
		}
		System.out.println(ch);
		
	}

}
