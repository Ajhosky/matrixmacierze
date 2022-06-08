package com.company;

public class Matrix {
    private static int w;
    public static int k;
    public static int height;
    public static int width;
    public int[][] tab1;


    public Matrix(int height, int width, int[][] tab1){
        this.tab1 = tab1;
        this.height = height;
        this.width = width;
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

    public static int[][] dodawanieMacierzy(Matrix macierz1, Matrix macierz2){
        int[][] tmpTab = new int[3][3];
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
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


    }
}
