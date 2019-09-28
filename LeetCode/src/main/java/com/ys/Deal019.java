package com.ys;


/**
 * 0-1背包
有 N 件物品和一个容量是 V

的背包。每件物品只能使用一次。

第 i
件物品的体积是 vi，价值是 wi

。

求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
输出最大价值。
输入格式

第一行两个整数，N，V

，用空格隔开，分别表示物品数量和背包容积。

接下来有 N
行，每行两个整数 vi,wi，用空格隔开，分别表示第 i

件物品的体积和价值。
输出格式

输出一个整数，表示最大价值。
 */
public class Deal019 {
	
	public static void main(String[] args) {
		int V = 5;
		int N = 4;
		int[] weight = {1,2,3,4};
		int[] value = {2,4,4,5};
		System.out.println(ZeroOnePack(V,N,weight,value));
		
	}
	
	
	
    public static String ZeroOnePack(int V,int N,int[] weight,int[] value){

        //初始化动态规划数组
        int[][] dp = new int[N+1][V+1];
        //为了便于理解,将dp[i][0]和dp[0][j]均置为0，从1开始计算
        for(int i=1;i<N+1;i++){
            for(int j=V;j>0;j--){
                //如果第i件物品的重量大于背包容量j,则不装入背包
                //由于weight和value数组下标都是从0开始,故注意第i个物品的重量为weight[i-1],价值为value[i-1]
                if(weight[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1]);
            }
        }
        //则容量为V的背包能够装入物品的最大值为
        int maxValue = dp[N][V];
        //逆推找出装入背包的所有商品的编号
//        int j=V;
//        String numStr="";
//        for(int i=N;i>0;i--){
//            //若果dp[i][j]>dp[i-1][j],这说明第i件物品是放入背包的
//            if(dp[i][j]>dp[i-1][j]){
//                numStr = i+" "+numStr;
//                j=j-weight[i-1];
//            }
//            if(j==0)
//                break;
//        }
        for(int i=1;i<5;i++){
        	for(int k=1;k<6;k++){
        		System.out.println(i+" "+k+":"+dp[i][k]);
        	}
        }
        return maxValue+"";  
    }

}
