/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlStatemant;

/**
 *
 * @author Annisa Laila
 */
public class StatementForEach {
    public static void main (String[] args) {
        int angka[] = {3,1,42,24,12};
        
        for (int x : angka) {
            System.out.print(x + " ");
        }
    }
}
