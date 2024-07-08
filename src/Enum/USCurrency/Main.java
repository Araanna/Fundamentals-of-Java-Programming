package Enum.USCurrency;

public class Main {
    public static void main(String[] args) {

        USCurrency money = USCurrency.PENNY;

        System.out.println(money.value);

        for (int i = 0; i <= 5; i++) {
            System.out.println();
        }

        // You can also use the array of enum values

        USCurrency[] coins = new USCurrency[3];
        coins[0] = USCurrency.PENNY;
        coins[1] = USCurrency.DIME;
        coins[2] = USCurrency.QUARTER;

        float sum = 0;
        for (USCurrency coin : coins) {

            System.out.println(coin.name);

            sum += coin.value;

        }

        System.out.println(sum);

    }

}