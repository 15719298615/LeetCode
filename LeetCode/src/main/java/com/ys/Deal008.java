/**
 * 题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 * @author 10249
 *
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array.length==0){
            return false;
        }
        if(array[0].length==0){
            return false;
        }
        int rows = array.length-1;
		int cols = array[0].length-1;
        
        for(int i=0;i<=rows;i++){
			if(array[i][cols]==target){
                return true;
            }else{
				if(array[i][cols]>target){
					for(int j=cols-1;0<=j;j--){
						if(array[i][j]==target){
                            return true;
                        }
					}
				}else{
					System.out.println(i+"行没有");
				}
			
				
			}
		}
        return false;
    }
}