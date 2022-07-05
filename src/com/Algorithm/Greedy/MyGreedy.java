package com.Algorithm.Greedy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

import java.lang.reflect.Array;
import java.util.*;

public class MyGreedy {

    public static void main(String[] args) {
        HashMap<String, HashSet<String>> broadcasts = new HashMap<String, HashSet<String>>();
        HashSet<String> hashset1 = new HashSet<String>();
        hashset1.add("北京");
        hashset1.add("上海");
        hashset1.add("天津");

        HashSet<String> hashset2 = new HashSet<String>();
        hashset2.add("广州");
        hashset2.add("北京");
        hashset2.add("深圳");

        HashSet<String> hashset3 = new HashSet<String>();
        hashset3.add("成都");
        hashset3.add("上海");
        hashset3.add("杭州");

        HashSet<String> hashset4 = new HashSet<String>();
        hashset4.add("上海");
        hashset4.add("天津");

        HashSet<String> hashset5 = new HashSet<String>();
        hashset5.add("杭州");
        hashset5.add("大连");

        broadcasts.put("k1", hashset1);
        broadcasts.put("k2", hashset2);
        broadcasts.put("k3", hashset3);
        broadcasts.put("k4", hashset4);
        broadcasts.put("k5", hashset5);

        HashSet<String> allAreas = new HashSet<>();
        allAreas.add("北京");
        allAreas.add("上海");
        allAreas.add("天津");
        allAreas.add("广州");
        allAreas.add("成都");
        allAreas.add("深圳");
        allAreas.add("大连");
        allAreas.add("杭州");

        ArrayList<String> selects = new ArrayList<String>();

        HashSet<String> tempSet = new HashSet<>();

        String maxKey = null;
        while (allAreas.size() != 0) {
            maxKey = null;
            for (String key : broadcasts.keySet()) {
                tempSet.clear();
                HashSet<String> areas = broadcasts.get(key);
                tempSet.addAll(areas);
                tempSet.retainAll(allAreas);
                if (tempSet.size() > 0 && (maxKey == null ||tempSet.size() > broadcasts.get(maxKey).size())){
                    maxKey = key;
                }
            }
            if (maxKey != null) {
                selects.add(maxKey);
                allAreas.removeAll(broadcasts.get(maxKey));
            }
        }

        System.out.println("最终结果是-> " + selects);
    }
}
