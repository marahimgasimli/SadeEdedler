/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sadeededler;

/**
 *
 * @author gasim
 */
public class SadeEdedler {

    public static void main(String[] args) {
        System.out.println("100-e qeder olan sade ededler siyahisi:");
        for (int n = 0; n < 101; n++) {
            int i, m = 0;
            m = n / 2;
            if (n == 0 || n == 1) {
            } else {
                for (i = 2; i < m; i++) {
                    if (n % i == 0) {
                    }
                }
                if (n % i != 0) {
                    System.out.println(n);
                }
            }
        }
    }
}
