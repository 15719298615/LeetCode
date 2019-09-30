package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 希尔排序法基本思想

希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，
每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止
 * @author 10249
 *我认为希尔排序中，最重要的就是能够搞清楚循环时对每个分组的关系，
 *就是这两步，其实也是在一个一个的向后推进，但是比较的数为gap的距离
 *而这两种的方式，第二种的效率高得多
 *第一种一直在交换
 *for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
		
		
		shellSort(arr); //交换式
		shellSort2(arr);//移位方式
		
	}

	// 使用逐步推导的方式来编写希尔排序
	// 希尔排序时， 对有序序列在插入时采用交换法, 
	public static void shellSort(int[] arr) {
		
		int temp = 0;
		int count = 0;
		// 根据前面的逐步分析，使用循环处理
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {//分多少次
			for (int i = gap; i < arr.length; i++) {
				// 遍历各组中所有的元素(共gap组，每组有个元素), 步长gap
				for (int j = i - gap; j >= 0; j -= gap) {//j每减一次gap表示在这一组中和前面的进行一次比较，
					//最终会把最小的放在最前面。
					// 如果当前元素大于加上步长后的那个元素，说明交换
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
	
	//对交换式的希尔排序进行优化->移位法
	public static void shellSort2(int[] arr) {
		
		// 增量gap, 并逐步的缩小增量
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// 从第gap个元素，逐个对其所在的组进行直接插入排序
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				if (arr[j] < arr[j - gap]) {//如果前面的大于后面的，则进入类似于插入排序
					while (j - gap >= 0 && temp < arr[j - gap]) {//之后继续在组内进行判断
						//只要前面的大于这个数，就一直进行while循环，直到不小于时，退出
						//移动
						arr[j] = arr[j-gap];
						j -= gap;
					}
					//当退出while后，就给temp找到插入的位置
					arr[j] = temp;//赋值
				}

			}
		}
		System.out.println( Arrays.toString(arr));
	}

}
