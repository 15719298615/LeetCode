package com.ys;

import java.util.HashMap;
import java.util.Map;

public class Deal4 {
    	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
	   Map<Integer,Integer> map = new HashMap<>();
            int n = A.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				map.put(C[i] + D[j], map.getOrDefault(C[i] + D[j], 0) + 1);
				}
			}
		
		
		int count=0;
		for(int k=0;k<n;k++){
			for(int q=0;q<n;q++){
				count+=map.getOrDefault(-A[k] - B[q], 0);
			}
		}
		
		return count;
	}

}
