import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M3009 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st1.nextToken());
		int y2 = Integer.parseInt(st1.nextToken());
		int x3 = Integer.parseInt(st2.nextToken());
		int y3 = Integer.parseInt(st2.nextToken());
		
		int ansX=0, ansY=0;
		if(x1==x2) {
			ansX=x3;
		}
		else if(x1==x3) {
			ansX=x2;
		}
		else if(x2==x3) {
			ansX=x1;
		}
		
		if(y1==y2) {
			ansY=y3;
		}
		else if(y1==y3) {
			ansY=y2;
		}
		else if(y2==y3) {
			ansY=y1;
		}
		System.out.println(ansX + " " + ansY);
	}

}
