package com.bridgelabz.generic;


/**
 * Purpose - To find maximum value using generics
 * @author -Sneha Bhokare
  */
public class FindMaxMinValuesUsingGenericMethod <T extends Comparable <T>>{
    /**
     * Generic method to compare any type of data and find maximum
     * @param x : First value to compare
     * @param y : Second value to compare
     * @param z : Third value to compare
     * @return max : Maximum of three values
     */
        public <T extends Comparable> T findMax(T x,T y,T z,T n){
            T max = x;
            if (y.compareTo(max) > 0)
                max = y;
            if (z.compareTo(max) > 0)
                max = z;
            if (n.compareTo(max) > 0)
                max = n;

            return max;
        }
                public static void main(String[] args) {
            FindMaxMinValuesUsingGenericMethod max = new FindMaxMinValuesUsingGenericMethod();

            Integer aInt = 10,bInt = 32,cInt = 211, dInt = 45;
            System.out.println("The maximum value between the three Integers is :" + max.findMax(aInt,bInt,cInt,dInt));

            Float pFloat = 12.0f,qFloat = 43.7f,rFloat = 54.0f,sFloat = 39.90f;
            System.out.println("The maximum value between the three Float is :" + max.findMax(pFloat,qFloat,rFloat, sFloat));

            String str1 = "Apple",str2 =  "Peach",str3 =  "Banana", str4 = "Pineapple";
            System.out.println("The maximum value between the three String is :" + max.findMax(str1,str2,str3,str4));
        }
}
