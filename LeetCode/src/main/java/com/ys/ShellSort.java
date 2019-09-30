package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * ϣ�����򷨻���˼��

ϣ�������ǰѼ�¼���±��һ���������飬��ÿ��ʹ��ֱ�Ӳ��������㷨�������������𽥼��٣�
ÿ������Ĺؼ���Խ��Խ�࣬����������1ʱ�������ļ�ǡ���ֳ�һ�飬�㷨����ֹ
 * @author 10249
 *����Ϊϣ�������У�����Ҫ�ľ����ܹ������ѭ��ʱ��ÿ������Ĺ�ϵ��
 *��������������ʵҲ����һ��һ��������ƽ������ǱȽϵ���Ϊgap�ľ���
 *�������ֵķ�ʽ���ڶ��ֵ�Ч�ʸߵö�
 *��һ��һֱ�ڽ���
 *for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
		
		
		shellSort(arr); //����ʽ
		shellSort2(arr);//��λ��ʽ
		
	}

	// ʹ�����Ƶ��ķ�ʽ����дϣ������
	// ϣ������ʱ�� �����������ڲ���ʱ���ý�����, 
	public static void shellSort(int[] arr) {
		
		int temp = 0;
		int count = 0;
		// ����ǰ����𲽷�����ʹ��ѭ������
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {//�ֶ��ٴ�
			for (int i = gap; i < arr.length; i++) {
				// �������������е�Ԫ��(��gap�飬ÿ���и�Ԫ��), ����gap
				for (int j = i - gap; j >= 0; j -= gap) {//jÿ��һ��gap��ʾ����һ���к�ǰ��Ľ���һ�αȽϣ�
					//���ջ����С�ķ�����ǰ�档
					// �����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ�أ�˵������
					if (arr[j] > arr[j + gap]) {
						temp = arr[j];
						arr[j] = arr[j + gap];
						arr[j + gap] = temp;
					}
				}
			}
		}
		System.out.println( Arrays.toString(arr));
		

	}
	
	//�Խ���ʽ��ϣ����������Ż�->��λ��
	public static void shellSort2(int[] arr) {
		
		// ����gap, ���𲽵���С����
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// �ӵ�gap��Ԫ�أ�����������ڵ������ֱ�Ӳ�������
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				if (arr[j] < arr[j - gap]) {//���ǰ��Ĵ��ں���ģ�����������ڲ�������
					while (j - gap >= 0 && temp < arr[j - gap]) {//֮����������ڽ����ж�
						//ֻҪǰ��Ĵ������������һֱ����whileѭ����ֱ����С��ʱ���˳�
						//�ƶ�
						arr[j] = arr[j-gap];
						j -= gap;
					}
					//���˳�while�󣬾͸�temp�ҵ������λ��
					arr[j] = temp;//��ֵ
				}

			}
		}
		System.out.println( Arrays.toString(arr));
	}

}
