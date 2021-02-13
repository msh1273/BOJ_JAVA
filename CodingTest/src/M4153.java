import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M4153 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
			StringTokenizer sT = new StringTokenizer(br.readLine(), " ");
			double a1 = Double.parseDouble(sT.nextToken());
			double a2 = Double.parseDouble(sT.nextToken());
			double a3 = Double.parseDouble(sT.nextToken());
				if(a1==0&&a2==0&&a3==0) {
					break;
				}
				else {
					if((a1*a1)+(a2*a2)==a3*a3) {
						System.out.println("right");
					}
					else if((a1*a1)+(a3*a3)==a2*a2) {
						System.out.println("right");
					}
					else if((a3*a3)+(a2*a2)==a1*a1) {
						System.out.println("right");
					}
					else System.out.println("wrong");
				}
			}
		
	}

}
