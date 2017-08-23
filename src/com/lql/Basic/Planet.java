package com.lql.Basic;

/**
 * Created by zyczyc on 2017/7/16.
 */
public enum Planet {
    EARTH (5.975,6.052),
    VENUS (4.896,6.37);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double compute(){
        return 1.0;
    }
}
