package com.example.shang.strategydemo;

/**
 * Created by shang on 2017/11/4.
 */


// 具体策略1
public class SubwayStrategy extends Strategy {
    @Override
    public int calculatorPrice(int km) {
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
}
