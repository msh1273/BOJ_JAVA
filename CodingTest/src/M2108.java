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
		int avg=0; 	//������: N���� ������ ���� N���� ���� ��
		int centerVal;	//�߾Ӱ�: N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
		int most;	//�ֺ�: N���� ���� �� ���� ���� ��Ÿ���� ��
		int range;	//����: N���� ���� �� �ִ񰪰� �ּڰ��� ����
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
