package com.company;

import java.util.ArrayList;

public class StringUtil
{
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n)
    {
        String cadena = "";
        for(int i = 0; i < n; i++){
            cadena = cadena + c;
        }
        return cadena;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        while(s.length() < n){
            s = c + s;
        }
        return s;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        String[] cadenas = new String[arr.length];
        for (int i = 0; i <arr.length; i++){
            Integer x = arr[i];
            cadenas[i] = x.toString();
        }
        return cadenas;
    }

    // Retorna un int[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        int[] enteros = new int[arr.length];
        for (int i = 0; i <arr.length; i++){
            enteros[i] = Integer.parseInt(arr[i]);
        }
        return enteros;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        int longitudMaxima = arr[0].length();
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].length() > longitudMaxima) {
                longitudMaxima = arr[i].length();
            }
        }
        return longitudMaxima;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c)
    {
        for(int i = 1; i < arr.length; i++) {

        }
    }

    public static String[] ordenar(String cadenas[], int descuento){

        ArrayList<String> L0 = new ArrayList<>();
        ArrayList<String> L1 = new ArrayList<>();
        ArrayList<String> L2 = new ArrayList<>();
        ArrayList<String> L3 = new ArrayList<>();
        ArrayList<String> L4 = new ArrayList<>();
        ArrayList<String> L5 = new ArrayList<>();
        ArrayList<String> L6 = new ArrayList<>();
        ArrayList<String> L7 = new ArrayList<>();
        ArrayList<String> L8 = new ArrayList<>();
        ArrayList<String> L9 = new ArrayList<>();

        ArrayList<String> listaCadenas = new ArrayList<>();
        for(int i = 0; i < cadenas.length; i++){
            String ultimo = cadenas[i].substring(cadenas[i].length() - descuento);
            char numero = ultimo.charAt(0);
            switch (numero){
                case '0':
                    L0.add(cadenas[i]);
                    break;
                case '1':
                    L1.add(cadenas[i]);
                    break;
                case '2':
                    L2.add(cadenas[i]);
                    break;
                case '3':
                    L3.add(cadenas[i]);
                    break;
                case '4':
                    L4.add(cadenas[i]);
                    break;
                case '5':
                    L5.add(cadenas[i]);
                    break;
                case '6':
                    L6.add(cadenas[i]);
                    break;
                case '7':
                    L7.add(cadenas[i]);
                    break;
                case '8':
                    L8.add(cadenas[i]);
                    break;
                case '9':
                    L9.add(cadenas[i]);
                    break;
            }
        }
        if(L0.size() > 0){
            L0.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        if(L1.size() > 0){
            L1.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        if(L2.size() > 0){
            L2.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        if(L3.size() > 0){
            L3.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        if(L4.size() > 0){
            L4.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        if(L5.size() > 0){
            L5.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        if(L6.size() > 0){
            L6.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        if(L7.size() > 0){
            L7.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        if(L8.size() > 0){
            L8.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        if(L9.size() > 0){
            L9.forEach(valor -> {
                listaCadenas.add(valor);
            });
        }
        return listaCadenas.toArray(cadenas);
    }
}
