package com.company;

public class SomeMath {

        public static int total5(int num1, int num2, int num3, int num4, int num5) {
            return num1 + num2 + num3 + num4 + num5;
        }

        public static int average5(int  num1, int  num2, int  num3, int  num4, int  num5) {
            return( num1 + num2 + num3 + num4 + num5) / 5;
        }

        public static double largest5(double num1, double num2, double num3, double num4, double num5) {
            double array1[]= {num1,num2,num3,num4,num5};


            double largest =Double.MIN_VALUE;
            for(int x=0; x<array1.length;x++){
                if(array1[x] >= largest) {
                    largest = array1[x];
                }
            }
            return largest;
        }


        //calling methods in main
        public static void main(String[] args) {
            int  total = total5(1, 2,3,4,5 );
            System.out.println(total);


            double average = average5(1,3,5,7,9);
            System.out.println(average);

            double largest5 = largest5( 42.0, 35.1, 2.3, 40.2, 15.6);
            System.out.println(largest5);
        }


    }




