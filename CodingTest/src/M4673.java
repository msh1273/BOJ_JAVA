
public class M4673 {
	public static void main(String[] args) {
		 
		boolean[] printlist = new boolean[10001];
		
		for(int i=1; i<10001; i++) {
			int a= d(i);
			if(a < 10001) {
				printlist[a] = true;
			}
			if(!printlist[i]) {
				System.out.println(i);
			}
		}
	}
	public static int d(int num) {
		int n = num;
		while(num!=0) {
			n = n + (num%10);
			num = num/10;
		}
		return n;
	}
}
