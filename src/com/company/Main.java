package com.company;
import java.util.ArrayList;
public class Main {

    public static void radixSort(int []arr)
    {
        StringUtil stringUtil = new StringUtil();
        String[] cadenas = stringUtil.toStringArray(arr);
        int numeroMaximo = stringUtil.maxLength(cadenas);
        for(int i = 0; i < cadenas.length; i++){
            cadenas[i] = stringUtil.lpad(cadenas[i],numeroMaximo, '0');
        }

        for (int i = 1; i < numeroMaximo + 1; i++){
            cadenas = stringUtil.ordenar(cadenas, i);
        }
        int[] arrayFinal = stringUtil.toIntArray(cadenas);
        for (int i = 0; i < arrayFinal.length; i++){
            arr[i] = arrayFinal[i];
        }
    }

    public static void main(String[] args)
    {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};

        radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }
}
