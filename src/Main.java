import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static void ingresarDatos(){
        double[][] sismos = new double[24][7];
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                sismos[i][j] = (Math.random())*10;
            }
        }
    }
    public static void buscarMayorSismo(){

    }
    public static void contarSismos(){

    }
    public static void enviarSMS(){

    }
    public static void salir(){

    }
}
