package com.kodilla;

public class Calculator1 {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a + b;
        }

        public static void main(String args[]) {
            Calculator1 calc = new Calculator1();
            int x = calc.add(5,9);
            int y = calc.subtract(5,9);
    }
}
