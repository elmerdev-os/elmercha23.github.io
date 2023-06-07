import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

   /*
3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
*/
      /*  int precio=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PRECIO ORIGINAL"));
        double descuento=Integer.parseInt(JOptionPane.showInputDialog("ingrese el porcentaje de descuento"));
        double precioFinal=(precio*descuento)/100;
        System.out.println("el precio total es: " + precioFinal);*/
        /* Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/
        /*int CuentaDeRestaurante=Integer.parseInt(JOptionPane.showInputDialog("ingrese total de la cuenta"));
        double Propina=Integer.parseInt(JOptionPane.showInputDialog("porcentaje de propina que desea dejar"));
        double propina=CuentaDeRestaurante*(Propina/100);
        System.out.println("tu propina es: " + propina);*/


       /*double NumeroAdivinar=Math.floor(Math.random() * 100);
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        double NumeroUsuario=sc.nextDouble();
        if(NumeroAdivinar != NumeroUsuario){
            System.out.println("sigue intentado");
        }else{
            System.out.println("felicitaciones");
        }
        System.out.println(NumeroAdivinar);*/

        /*2) Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/

       /* Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la distancia de millas;");
        double millas=sc.nextInt();
        double kilometro=millas*1.60934;
        System.out.println("la distancia es: " + kilometro);*/

        Scanner sc=new Scanner(System.in);
        double peso;
        double altura;
        System.out.println("ingrese su peso");
        peso=sc.nextDouble();
        System.out.println("ingrese su altura");
        altura=sc.nextDouble();
        double IndeciMasaCoprporal=peso/(peso*altura);
        System.out.println("tu indeci masa coorporal es " + IndeciMasaCoprporal);
        if(peso<18.5){
            System.out.println("usted es muy bajo");
        }
        else if( IndeciMasaCoprporal >= 30){
            System.out.println("ESTAS EN ESTADO DE OBECIDAD POR FAVOR DEJA DE COMER CHOCOLATES ");

        }else if(IndeciMasaCoprporal >= 25 && IndeciMasaCoprporal <30){
            System.out.println("estas en estado de sobrepeso");

        }
        else if(IndeciMasaCoprporal >= 18.5 && IndeciMasaCoprporal <25){
            System.out.println("estas en un estado normal");
        }
        else if(IndeciMasaCoprporal <= 18.6){
            System.out.println("estas en estado de obecidad");
        }
        else{
            System.out.println("error");
        }



      
      
