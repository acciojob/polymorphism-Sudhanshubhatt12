package com.driver;

public class Main {
 
    
    static class Product {
      
        public int product(int x, int y) {
            return x * y;
        }

       
        public int product(int x, int y, int z) {
            return x * y * z;
        }

       
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
       
        Product p = new Product();
        
       
        int result1 = p.product(2, 3);          // Calls product(int, int)
        int result2 = p.product(2, 3, 4);       // Calls product(int, int, int)
        double result3 = p.product(2.5, 3.5);   // Calls product(double, double)
        
      
        System.out.println("Product of 2 and 3 is: " + result1);
        System.out.println("Product of 2, 3, and 4 is: " + result2);
        System.out.println("Product of 2.5 and 3.5 is: " + result3);
    }



}
