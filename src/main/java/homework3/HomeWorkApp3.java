package homework3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {}

    public static void invertArray() {

        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1; }
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }

    public static void returnAnArray(int len, int initialValue) {
     int [] arr = new int[len];
     for(int i = 0;i < arr.length;i++){
         arr[i] = initialValue;
         System.out.print("[" + i + "]" + arr[i] + "");
     } System.out.println();
    }



}