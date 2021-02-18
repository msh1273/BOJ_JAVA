import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class M2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> sh = new HashSet<Integer>();
		int N = Integer.parseInt(br.readLine());
		Iterator<Integer> iter = null;
		for(int i=0; i<N; i++) {
			sh.add(Integer.parseInt(br.readLine()));		
			iter = sh.iterator();
			}
		while(iter.hasNext())
			System.out.println(iter.next());

	}

}
