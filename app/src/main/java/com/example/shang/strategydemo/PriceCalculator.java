package com.example.shang.strategydemo;

/**
 * Created by shang on 2017/11/4.
 */

public class PriceCalculator {
    private static final int BUS = 1;
    private static final int SUBWAY = 2;
    public static void main(String []args){
        PriceCalculator priceCalculator = new PriceCalculator();
        System.out.println("坐16公里的公车的花费为："+priceCalculator.calculatorPrice(16,BUS));
        System.out.println("坐16公里的地铁的花费为："+priceCalculator.calculatorPrice(16,BUS));
    }

    private int calculatorPrice(int km, int type) {
        if (type == BUS){
            return busPrice(km);
        }else if (type == SUBWAY){
            return subwayPrice(km);
        }
        return 0;
    }

    // 地铁收费
    private int subwayPrice(int km) {
        if (km <=6){
            return 3;
        }else if (km >6 && km <12){
            return 4;
        }else if (km >12){
            return 5;
        }else {
            return 6;
        }
    }

    // 公车收费：10公里以内 1 块，超过的每5公里 1 块
    private int busPrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1+extraFactor *1;
        return fraction > 0 ? ++price : price;
    }

}
