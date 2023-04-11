package com.preciado.utilities.meth;

import java.util.Random;

public class RandomNumberGenerator {
    private Random random;
    public RandomNumberGenerator() {
    }

    public int randInt(){
        return (int)(Math.random() * 100);
    }
    public int randInt(int min, int max){
        return (int)(random.nextInt(max - min + 1) + min);
    }
}
