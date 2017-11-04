package com.example.shang.strategydemo;

/**
 * Created by shang on 2017/11/4.
 */

public class TranficCalculator {

    private Strategy mStragety;

    public void setmStragety(Strategy strategy){
        mStragety = strategy;
    }

    public  int calculatorPrice(int km){
        return mStragety.calculatorPrice(km);
    }


    public static void main(String []args){
        TranficCalculator calculator = new TranficCalculator();
        calculator.setmStragety(new BusStrategy());
        int price  = calculator.calculatorPrice(16);
    }
}
