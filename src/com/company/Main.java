package com.company;

public class Main {

    public static void main(String[] args) {
        //task 2
      /*  int x =443, y=325;
        int function=max(x,y);
        System.out.println(function);

        //---------------------------
        //task 3
       int a=32,b=65;
       double result=sumOfSquares(a,b);
        System.out.println(result);

        //----------------------------------------
        //task 4
           int[] array={3,6,2,8,4,2,};

            int result1=maxInArray(array);
        System.out.println(result1);*/

        //------------------------------------------
        //task 5
       int[] array1 ={-3,-7,5,2,-4,44,-3,67,9};
       int result2= DeleteOfNegArray(array1);
        System.out.println(result2);
        //----------------------------------------------
        //task6
        int[] n={64,54,8,4,74,75,};
        int result=sumArray(n);
        System.out.println(result);
    }
    public static int max(int x, int y) {
        int result=0;

        if (x > y) {
            result=x;
        }
        else {
            result=y;
        }
        return result;
    }
        public static double sumOfSquares(int a,int b)
        {
            double sum=0;
            for (int i = a; i <= b; i++) {
                i+=Math.pow(i,2);

               sum=i;
            }
           return sum;
        }
    //------------------------------------------------------------------
    public static int maxInArray(int[] array){
        int max=0;
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    public static int DeleteOfNegArray(int[] array1) {
        int newArray = 0;
        for (int i = 0; i < array1.length; i++) {

            if (array1[i] != 0) {
                newArray = array1[i];
            }

        } return newArray;

    }

    public static int sumArray(int[] n){
        int sum=0;
        for (int i = 0; i < n.length; i++) {
            sum+=n[i];

        }
        return sum;
    }
}
