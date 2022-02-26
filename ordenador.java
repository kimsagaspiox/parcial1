/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial;

/**
 *
 * @author Zonia Roldan
 */
public class ordenador {
    static Scanner sc = new Scanner(System.in);
static int[] numeros = new int [10];

public void ingresar_numero(){
    
}

public void menu(int eleccion){
    for (int i=0; i<10;i++){
    System.out.println("Ingresar 10 números");
    numeros [i]= sc.nextInt();
    }
    for (int i=0; i<10;i++){
        System.out.println(numeros[i]);
    boolean salir = false;
    
    while(!salir){
    System.out.println("Seleccione la funcion desea que se realice");
    System.out.println("1. Mostrar ordenado de forma ascendente");
    System.out.println("2. Mostrar ordenado de forma descendente");
    System.out.println("3. Salir");
    
    eleccion = sc.nextInt();
    switch (eleccion){
        case 1: orden_ascendente1();
                break;
        case 2: orden_descendente1();
                break;
        case 3: salir=true;
                break;
        case 4: default: System.out.println("La opción seleccionada no existe, seleccionar otra");
                break;
    }
    }
}


}
    public void orden_ascendente1(){
    System.out.println("Ordenado de forma ascendente:");
    orden_ascendente(numeros);
    for (int orden:numeros){
        System.out.println(orden);
    }
    menu(0);
    }
    
public void orden_ascendente(int[]arreglo){
    for (int i = 0;i<arreglo.length - 1; i++){
        int min = i;
        
    for (int c = i+1;c<arreglo.length;c++){
        if(arreglo[c]<arreglo[min]){
            min=c;
        }
    }
    if (i !=min){
        int aux = arreglo[i];
        arreglo[i]=arreglo[min];
        arreglo[min]=aux;
    }
}
    
    
}

public void orden_descendente1(){
     System.out.println("Ordenado de forma descendente:");
    orden_descendente(numeros);
    for (int orden:numeros){
        System.out.println(orden);
    }
}

public void orden_descendente(int[] arreglo){
     for (int i = 0; i<arreglo.length - 1; i++){
        int max = i;
        
        for(int c = i+1; c<arreglo.length;c++){
            if(arreglo[c]>arreglo[max]){
                max=c;
            }
        }
        
        if (i !=max){
            int aux = arreglo[i];
            arreglo[i]=arreglo[max];
            arreglo[max]=aux;
        }
    }
}
}

    
  