import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M11729 {
		static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		bw.write((int)(Math.pow(2, N)-1)+"\n");
		Hanoi(N,1,2,3);
		
		bw.flush();
		bw.close();
	}
	/*N: 원판 개수
	start: 출발 원판
	mid: 중간에 거치는 원판
	to: 목적지 원판
	*/
	public static void Hanoi(int N, int start, int mid, int to) throws IOException {
		if(N==1) {
			bw.write(start+" "+to+"\n");
			return;
		}
		Hanoi(N-1,start, to, mid);
		bw.write(start+" "+to + "\n");
		Hanoi(N-1,mid, start, to);
	}
}
