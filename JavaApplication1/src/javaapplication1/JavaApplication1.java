/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner show = new Scanner(System.in);
        System.out.print("Input Deret Fibonacci : ");
        int n = show.nextInt();
        int hasil = 0;
        long fib[] = new long[n];
        fib[0] = 1;
        fib[1] = 1;
        
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i =0  ;i < n; i++) {
            System.out.print(fib[i] +  " \n");
            hasil = hasil + (int) fib [i];
        }
        System.out.println("Hasil Deret : "+hasil);
    }
 }
   
