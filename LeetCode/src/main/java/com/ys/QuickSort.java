package sort;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {-9,78,0,23,-567,70};
		
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static void quickSort(int arr[],int left,int right){
		int l = left;
		int r = right;
		//中轴
		int pivot =arr[(left+right)/2];
		int temp = 0;//作为交换时使用
		//循环的目的是让比pivot小的放左边，反之
		while(l<r){
			
			while(arr[l]<pivot){
				l+=1;
			}
			while(arr[r]>pivot){
				r-=1;
			}
			//如果l>=r，说明pivot的左边已经全部小于pivot，右边全部大于等于pivot
			if(l>=r){
				break;
			}
		
		//交换
		temp = arr[l];
		arr[l] = arr[r];
		arr[r]=temp;
		
		//如果交换完之后，发现这个arr[l] == pivot ，就把r--，不用再算他了，前移。
		if(arr[l]==pivot){
			r-=1;
		}
		//如果交换完之后，发现这个arr[r] == pivot ，就把l++，不用再算他了，后移。
		if(arr[r]==pivot){
			l+=1;
		}
		} 
		if(l==r){
			l+=1;
			r-=1;
		}
		//向左递归
		if(left<r){
			quickSort(arr,left,r);
		}
		//向右递归
		if(l<right){
			quickSort(arr,l,right);
		}
		
	}
	
}
	

