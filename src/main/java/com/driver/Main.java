package com.driver;

public class Main {
    static class  Product {
        public  int Product(int x, int y) {
            return x * y;
        }

        public  int Product(int x, int y, int z) {
            return x * y * z;
        }

        public   double Product(double x, double y) {
            return x * y;
        }
    }

    public  static void Main (String args[]) {
        Product p = new Product () ;
        System.out.println(p.Product(5, 6));
        System.out.println(p.Product(4, 5, 9));
        System.out.println(p.Product(2.6, 5.3));
    }
}