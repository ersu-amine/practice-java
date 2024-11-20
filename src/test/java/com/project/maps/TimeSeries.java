package com.project.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TimeSeries {
        /*
        Time Series

        Create a method that will return the summation of the given time series. A time series will be a Map holding a time/value pair. Given two time series combine them together. When a time is matched in both series the values are combined
            parameter: Map<Integer, Double>
            return: Map<Integer, Double>

        Ex:
            input:
                 series A: {1=1.0, 2=1.5, 3=2.0}
                 series B: {2=1.0, 3=2.5, 5=1.0}
            output:
                 {1=1.0, 2=2.5, 3=4.5, 5=1.0}
     */

    public static void main(String[] args) {

        Map<Integer, Double> map1 = new HashMap<>();
        map1.put(1, 1.0); map1.put(2, 1.5); map1.put(3, 2.0);

        Map<Integer, Double> map2 = new LinkedHashMap<>();
        map2.put(2, 1.0); map2.put(3, 2.5); map2.put(5, 1.0);

        Map<Integer, Double> summation = summation(map1, map2);
        System.out.println("summation = " + summation);

    }

    public static Map<Integer, Double> summation (Map<Integer, Double> map1, Map<Integer, Double> map2){
        //create a map with keys and values of map1
        Map<Integer, Double> summedMap = new HashMap<>(map1);

        //add map2 into summedMap
        for (Integer key : map2.keySet()) {

            //if summedMap has existing key, add the values of the same keys
            if (summedMap.containsKey(key)){
                summedMap.put(key,(summedMap.get(key) + map2.get(key)));
            }else {
                summedMap.put(key,map2.get(key));
            }
        }

        return summedMap;
    }

}
