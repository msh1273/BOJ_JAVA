import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] index = new int[4001];
		int avg=0; 	//산술평균: N개의 수들의 합을 N으로 나눈 값
		int centerVal;	//중앙값: N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
		int most;	//최빈값: N개의 수들 중 가장 많이 나타나는 값
		int range;	//범위: N개의 수들 중 최댓값과 최솟값의 차이
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			avg+=arr[i];
		}
		Arrays.sort(arr);
		centerVal = arr[N/2];
		avg=avg/N;

		for(int i=0; i<index.length; i++) {
			index[arr[i]]++;
		}
		
		Arrays.sort(index);
		most = index[4000];
		range = arr[N-1]-arr[0];
		System.out.println(avg);
		System.out.println(centerVal);
		System.out.println(most);
		System.out.println(range);
	}

}
