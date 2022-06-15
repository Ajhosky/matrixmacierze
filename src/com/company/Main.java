package com.company;

import static com.company.Matrix.*;

public class Main {

    public static void main(String[] args) {

        double[][] tab1 = {
                {3, 6, 9},
                {2, 7, 10},
                {5, 8, 1}
        };
        double[][] tab2 = {
                {1, 13, 12},
                {2, 11, 14},
                {16, 15, 17}
        };


        Matrix m1 = new Matrix(tab1);
        Matrix m2 = new Matrix(tab2);
        Matrix m3 = Matrix.multuply(m1, m2);

        m3.printMatrix();

        // dodawanieMacierzy(m1, m2);
        //odejmowanieMacierzy(m1, m2);
        //mnozenieMacierzy(tab1, tab2);
        // mnozenieMacierzyPrzezSkalar(m1, 5);
        /*dodawanieMacierzy(tab1, tab2);
        odejmowanieMacierzy(tab1, tab2);
        mnozenieMacierzy(tab1, tab2);
        mnozenieMacierzyPrzezSkalar(tab1, 5);*/


    }
}
