package com.company;

import static com.company.Matrix.*;

public class Main {

    public static void main(String[] args) {

        int[][] tab1 = {
                {3, 6, 9},
                {2, 7, 10},
                {5, 8, 1}
        };
        int[][] tab2 = {
                {1, 13, 12},
                {2, 11, 14},
                {16, 15, 17}
        };

        Matrix m1 = new Matrix(3,3,tab1);
        Matrix m2 = new Matrix(3,3, tab2);
        dodawanieMacierzy(m1, m2);
        /*odejmowanieMacierzy(m1, m2);
        mnozenieMacierzy(m1, m2);
        mnozenieMacierzyPrzezSkalar(m1, 5);*/


        /*dodawanieMacierzy(tab1, tab2);
        odejmowanieMacierzy(tab1, tab2);
        mnozenieMacierzy(tab1, tab2);
        mnozenieMacierzyPrzezSkalar(tab1, 5);*/


    }
}
