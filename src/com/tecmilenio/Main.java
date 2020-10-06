package com.tecmilenio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, n = 4, cont = 2;
        String cad = "";
        System.out.println("ingrese un numero");
        num = sc.nextInt();
        if (num > 2) {
            cad = "2 - 3";
            while (cont < num) {
                i = 2;
                while (i <= n) {
                    if (i == n) {
                        cad = cad + " - " + n;
                        cont = cont + 1;
                    } else {
                        if (n % i == 0) {
                            i = n;
                        }
                    }
                    i = i + 1;
                }
                n = n + 1;
            }
            System.out.println("Numeros primos:");
            System.out.println(cad);
        } else {
            if (num > 0) {
                if (num == 1) {
                    System.out.println("es primo 2");
                } else {
                    System.out.println("es primo 2, 3");
                }
            } else {
                System.out.println("ingresa numeros positivos");
            }
        }

        Scanner cs = new Scanner(System.in);
        int numero,fibo1,fibo2,a;

        do{
            System.out.print("Introduce la cantidad de numeros de Fibonacci que deseas ver: ");
            numero = cs.nextInt();
        }while(numero<=1);

        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}

