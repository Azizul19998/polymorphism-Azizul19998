package com.driver;

public class Main {

    public static void main(String[] args)
    {
       Product p = new Product();
        p.product(2,3);
        p.product(1,2,3);
        p.product(1.2 , 3.4);
    }
    public static class Product {
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
}
//Azizul

