package com;

import java.util.Hashtable;

public class Test {
    public static void main(String[] args) {
        Hashtable ht = getHT();

        test(ht);
    }

    private static Hashtable getHT() {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("a", "100");
        return ht;
    }

    private static void test(Hashtable<String, String> h) {
        // TODO Auto-generated method stub
        System.out.println(Integer.parseInt(h.get("a")));
    }
}
