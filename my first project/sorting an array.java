/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.project.no.pkg8;
import java.util.Scanner;

/**
 *
 * @author PAVITHRA T
 */
public class MyProjectNo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sorting an array
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("How many element you want to enter : ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
          a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
         for (int j = i + 1; j < n; j++)
          {
           if (a[i] > a[j])
            {
             temp = a[i];
             a[i] = a[j];
             a[j] = temp;
            }
           }
        }
        System.out.println("Ascending Order:");
        for (int i = 0; i < n ; i++)
        {
        System.out.println(a[i]);
        }
        }
}

