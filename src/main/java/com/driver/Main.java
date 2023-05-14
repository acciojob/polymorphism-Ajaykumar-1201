package com.driver;

public class Main {
    public static class product {
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
    }
    public static void main(String args[]) {
        product p = new product();
        int a = p.product(4, 5);
        int b = p.product(1, 2, 4);
        //System.out.println(a);
    }

}