package com.company;

public class Matrix {
    private double[][] tab;
    private int rowCount;
    private int colCount;
    private static int w;
    public static int k;
    public int height;
    public int width;
    public int[][] tab1;


    public Matrix(int rowCount, int colCount){
        tab = new double[rowCount][colCount];
        this.rowCount = rowCount;
        this.colCount = colCount;
    }
    public Matrix(double[][] tab){
        this.tab = tab;
        rowCount = tab.length;
        colCount = tab[0].length;
    }
    public static Matrix multuply(Matrix m1, Matrix m2){
        if (m1.colCount != m2.rowCount){return new Matrix(0,0);}

        Matrix tmp = new Matrix(m1.rowCount , m2.colCount);
        for (int i = 0; i < m1.rowCount; i++){
            for (int j = 0; j < m2.colCount; j++){
                for (int k = 0; k < m1.colCount; k++){
                    tmp.tab[i][j] += m1.tab[i][k] * m2.tab[k][j];
                }
            }
        }
        return tmp;
    }
    public void printMatrix(){
        for (int  i = 0; i < rowCount; i++){
            System.out.println();
            for (int  j = 0; j < colCount; j++){
                System.out.print(tab[i][j] + "\t\t");
            }
        }
    }



//    int[][] tab1 = {
//            {3, 6, 9},
//            {2, 7, 10},
//            {5, 8, 1}
//    };
//    int[][] tab2 = {
//            {1, 13, 12},
//            {2, 11, 14},
//            {16, 15, 17}
//    };

    /*
    public static int[][] dodawanieMacierzy(Matrix macierz1, Matrix macierz2){
        int[][] tmpTab = new int[macierz1.height][macierz1.width];
        for (int i = 0; i < macierz1.height; i++){
            for (int j = 0; j < macierz1.width; j++){
                tmpTab[i][j] = macierz1.tab1[i][j] + macierz2.tab1[i][j];
                System.out.println(macierz1.tab1[i][j]+ " + " + macierz2.tab1[i][j]+ " = " + tmpTab[i][j]);

            }
        }
        System.out.println("["+tmpTab[0][0]+"]"+"["+tmpTab[0][1]+"]"+"["+tmpTab[0][2]+"]");
        System.out.println("["+tmpTab[1][0]+"]"+"["+tmpTab[1][1]+"]"+"["+tmpTab[1][2]+"]");
        System.out.println("["+tmpTab[2][0]+"]"+"["+tmpTab[2][1]+"]"+"["+tmpTab[2][2]+"]");
        return tmpTab;
    }


    public static int[][] odejmowanieMacierzy(int[][] macierz1, int[][] macierz2){
        int[][] tmpTab = new int[3][3];
        for (int i = 0; i < w; i++){
            for (int j = 0; j < k; j++){
                tmpTab[i][j] = macierz1[i][j] - macierz2[i][j];
                System.out.println(macierz1[i][j]+ " - " + macierz2[i][j]+ " = " + tmpTab[i][j]);

            }
        }
        System.out.println("["+tmpTab[0][0]+"]"+"["+tmpTab[0][1]+"]"+"["+tmpTab[0][2]+"]");
        System.out.println("["+tmpTab[1][0]+"]"+"["+tmpTab[1][1]+"]"+"["+tmpTab[1][2]+"]");
        System.out.println("["+tmpTab[2][0]+"]"+"["+tmpTab[2][1]+"]"+"["+tmpTab[2][2]+"]");
        return tmpTab;
    }


    public static int[][] mnozenieMacierzy(int[][] macierz1, int[][] macierz2) {
        int [][] tmpTab = new int[3][3];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                for (int x = 0; x < 3; x++){
                    tmpTab[i][j] += macierz1[i][x] * macierz2[x][j];
                }
            }
        }



        System.out.println("["+tmpTab[0][0]+"]"+"["+tmpTab[0][1]+"]"+"["+tmpTab[0][2]+"]");
        System.out.println("["+tmpTab[1][0]+"]"+"["+tmpTab[1][1]+"]"+"["+tmpTab[1][2]+"]");
        System.out.println("["+tmpTab[2][0]+"]"+"["+tmpTab[2][1]+"]"+"["+tmpTab[2][2]+"]");
        return tmpTab;
    }
    public static int[][] mnozenieMacierzyPrzezSkalar(int[][] macierz1, int skalar){
        int [][] tmpTab = new int[3][3];
        for (int i = 0; i < w; i++){
            for (int j = 0; j < k; j++){
                tmpTab[i][j] = macierz1[i][j] * skalar;

            }
        }
        System.out.println("    ["+macierz1[0][0]+"]"+"["+macierz1[0][1]+"]"+"["+macierz1[0][2]+"]  " + "    ["+tmpTab[0][0]+"]"+"["+tmpTab[0][1]+"]"+"["+tmpTab[0][2]+"]  ");
        System.out.println(skalar + " * ["+macierz1[1][0]+"]"+"["+macierz1[1][1]+"]"+"["+macierz1[1][2]+"]  =" +"  ["+tmpTab[1][0]+"]"+"["+tmpTab[1][1]+"]"+"["+tmpTab[1][2]+"]  ");
        System.out.println("    ["+macierz1[2][0]+"]"+"["+macierz1[2][1]+"]"+"["+macierz1[2][2]+"]" +"      ["+tmpTab[2][0]+"]"+"["+tmpTab[2][1]+"]"+"["+tmpTab[2][2]+"]  ");
        return tmpTab;
    }
    public void odwrocenieMacierzy(){


    }*/
}
