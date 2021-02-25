import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class M2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] index = new int[8001];
		double sum=0; 	//산술평균: N개의 수들의 합을 N으로 나눈 값
		int avg;
		int centerVal;	//중앙값: N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
		int most;	//최빈값: N개의 수들 중 가장 많이 나타나는 값
		int range;	//범위: N개의 수들 중 최댓값과 최솟값의 차이
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		int maxindex = 0;
		for(int i=0; i<N; i++) {
			index[arr[i]+4000]++;
		}
		for(int i=0; i<index.length; i++) {
			if(index[i] >= maxindex) {
				maxindex = index[i];
			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<index.length; i++) {
			if(index[i]==maxindex) {
				al.add(i-4000);
			}
		}


		Arrays.sort(arr);
		centerVal = arr[N/2];
		avg= (int) Math.round((sum/N));

		range = arr[N-1]-arr[0];
		System.out.println(avg);
		System.out.println(centerVal);
		Collections.sort(al);
		if(al.size()==1) {
			System.out.println(al.get(0));
		}else {
			System.out.println(al.get(1));
		}
		System.out.println(range);
	}

}
