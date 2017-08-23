package com.lql.Basic;

import javax.swing.*;
import java.util.*;

/**
 * Created by LQL on 2017/3/3.
 */
public class Test {



    public static void main(String[] args) {

        Planet planet = Planet.EARTH;
        Planet.values();
        planet.compute();
        System.out.println(planet.ordinal());
        List<Integer> strings = Arrays.asList(1,2);
        System.out.println(Arrays.asList(1,2));
    }

}
