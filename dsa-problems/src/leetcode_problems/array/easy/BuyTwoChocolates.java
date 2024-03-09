package leetcode_problems.array.easy;

public class BuyTwoChocolates {
    public static void main(String[] args) {

        System.out.println("Hello BuyTwoChocolates!");

        int [] chocolatePrice = {1,1,1};
        int money = 3;
        int minPrice = 4;
        int secondMinPrice = 0;

        for(int i=0; i<chocolatePrice.length; i++){
            if(minPrice >= chocolatePrice[i]){
                secondMinPrice = minPrice;
                minPrice = chocolatePrice[i];
            } else if (secondMinPrice >= chocolatePrice[i]) {
                secondMinPrice = chocolatePrice[i];
            }
        }
        int cost = minPrice+secondMinPrice;
        if(money < cost){
            System.out.println(money);
        }else {
             System.out.println("buy 2 chocolate and remainging money:" + (money - cost));
        }

    }
}
