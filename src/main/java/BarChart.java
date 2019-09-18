/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaka9
 */
import java.util.Scanner;

public class BarChart {

       public static void main(String[] args) {

              int sales1, sales2, sales3, sales4, sales5;

              Scanner in = new Scanner(System.in);

              System.out.print("Enter today’s sales for stores 1: ");

              sales1 = in.nextInt();

              System.out.print("Enter today’s sales for stores 2: ");

              sales2 = in.nextInt();

              System.out.print("Enter today’s sales for stores 3: ");

              sales3 = in.nextInt();

              System.out.print("Enter today’s sales for stores 4: ");

              sales4 = in.nextInt();

              System.out.print("Enter today’s sales for stores 5: ");

              sales5 = in.nextInt();

              System.out.println();

              System.out.println("Sales Bar Chart");

              for(int i = 1; i < 6; ++i) {

                     System.out.printf("Store %d: ", i);

                     if(i == 1) {

                           bar(sales1);

                     }

                     if(i == 2) {

                           bar(sales2);

                     }

                     if(i == 3) {

                           bar(sales3);

                     }

                     if(i == 4) {

                           bar(sales4);

                     }

                     if(i == 5) {

                           bar(sales5);

                     }

              }

       }

       public static void bar(int n) {

              for(int i = 0; i < n / 100; ++i) {

                     System.out.print("*");

              }

              System.out.println();

       }

}

