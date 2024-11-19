package com.rahul.designpatterndemo.logical_patterns;

public class PrintRChar {


    //******
    //*    *
    //*    *
    //*    *
    //******
    //**
    //* *
    //*  *
    //*   *
    //*    *
    public static void main(String[] args) {

        int k = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < 5) {
                    if (i == 0 || i == 4) {
                        System.out.print("*");
                    } else {
                        if (j == 0 || j == 5) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else {
                    if (j == 0) {
                        System.out.print("*");
                    } else {
                        int n = k;
                        while (n > 0) {
                            System.out.print(" ");
                            n--;
                        }
                        k++;
                        System.out.println("*");
                        break;

                    }
                }
                if (j == 5)
                    System.out.println();
            }

        }
    }
}
