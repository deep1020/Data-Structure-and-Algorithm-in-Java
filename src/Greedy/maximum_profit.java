package Greedy;

public class maximum_profit {
    static int maximumProfit(int stockprices[]){
        int minPrice=stockprices[0];
        int maxProfit=0;
        for(int i=1;i<stockprices.length;i++){
            if(stockprices[i]<minPrice){
                minPrice=stockprices[i];
            }
            else{
                int profit=stockprices[i]-minPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int stockprices[]={3,2,4,2,1,5};
        System.out.println(maximumProfit(stockprices));
    }
}
