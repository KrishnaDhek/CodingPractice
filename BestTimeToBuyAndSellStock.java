public class BestTimeToBuyAndSellStock {
    public static int BestTime(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i : prices){
            if(minPrice>i){
                minPrice = i;
            }
            else if(i-minPrice>maxProfit){
                maxProfit = i-minPrice;
            }

        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int[] prices ={7,6,4,3,1};
        System.out.println(BestTime(prices));
    }
}
