package com.bridgelabz.samples.Examples;

/**
 * Purpose - To find maximum value using generics
 * @author -Sneha Bhokare
 * @since -
 */
public class FindMaxValueUsingGenericsMethod {
    /**
     * Generic method to compare any type of data and find maximum
     * @param a1 : First value to compare
     * @param a2 : Second value to compare
     * @param a3 : Third value to compare
     * @return max : Maximum of three values
     */
    public static <T extends Comparable<T>> T findMaxValue(T a1, T a2, T a3){
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum Problem Using Generics.");
        System.out.println("The maximum value between the three Integers is : "+findMaxValue(40, 30, 80));
        System.out.println("The maximum value between the three Floats is : "+findMaxValue(32.4f, 25.8f, 10.9f));
        System.out.println("The maximum value between the three Strings is : "+findMaxValue("FZ", "UNICORN", "SHINE"));
    }
}