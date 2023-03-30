package top.uaian.algorithm.leecode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache {

    public static void main(String[] args) {
        SimpleLinkedHashMap simpleLinkedHashMap = new SimpleLinkedHashMap(2);
        simpleLinkedHashMap.put(1, 1);
        simpleLinkedHashMap.put(2, 2);
        simpleLinkedHashMap.get(1);
        simpleLinkedHashMap.put(3, 3);
        simpleLinkedHashMap.put(4, 4);
        simpleLinkedHashMap.put(5, 5);
        simpleLinkedHashMap.values().forEach(System.out::println);
    }
}

class SimpleLinkedHashMap extends LinkedHashMap<Integer, Integer> {

    int length;

    public SimpleLinkedHashMap(int length) {
        super(length, 0.75f, true);
        this.length = length;
    }

    @Override
    public Integer getOrDefault(Object o, Integer s) {
        return super.getOrDefault(o, -1);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> entry) {
        return this.size() > length;
    }

    @Override
    public Integer put(Integer s, Integer s2) {
        return super.put(s, s2);
    }
}