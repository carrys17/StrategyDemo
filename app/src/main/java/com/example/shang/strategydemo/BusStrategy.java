package com.example.shang.strategydemo;

/**
 *
 * Created by shang on 2017/11/4.
 */


// 具体策略2
public class BusStrategy extends Strategy {
    @Override
    public int calculatorPrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1+extraFactor *1;
        return fraction > 0 ? ++price : price;
    }
}
