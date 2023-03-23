import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //uso de main para testeos
        menu();
    }

    public static void menu() {
        double [][] nom = new double[24][7];
        Scanner teclado = new Scanner(System.in);
        int num;
        int xd = 1;
        do {
            System.out.println("Ingrese el numero");
            System.out.println("[1] Ingresar Datos");
            System.out.println("[2] Mostrar sismo de mayor magnitud");
            System.out.println("[3] Contar sismos mayores o iguales a 5.0");
            System.out.println("[4] Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("[5] Salir");
            num = teclado.nextInt();
            switch (num) {
                case 1:
                    nom = ingresarDatos();
                    break;
                case 2:
                    System.out.println("El sismo más fuerte es de: " + buscarMayorSismo(nom));
                    break;
                case 3:
                    System.out.println("La cantidad de sismos iguales o mayores de 5.0 son: " + contarSismos(nom));
                    break;
                case 4:
                    enviarSMS(nom);
                    break;
                case 5:
                    xd = 0;
                    break;
            }
        } while (xd != 0);
    }

    public static double[][] ingresarDatos(){
        double[][] sismos = new double[24][7];
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                sismos[i][j] = Math.floor(((Math.random())*10)*10)/10;
            }
        }
        return sismos;
    }
    public static double buscarMayorSismo(double[][] nom){
        double aux = 0;
        for (int i = 0; i < nom.length; i++) {
            for (int j = 0; j < nom[i].length; j++) {
                if (aux < nom[i][j]){
                    aux = nom[i][j];
                }
            }
        }
        return aux;
    }
    public static double contarSismos(double[][] nom){
        double aux = 0;
        for (int i = 0; i < nom.length; i++) {
            for (int j = 0; j < nom[i].length; j++) {
                if (nom[i][j] >= 5.0){
                    aux++;
                }
            }
        }
        return aux;
    }
    public static void enviarSMS(double[][] nom){
        for (int i = 0; i < nom.length; i++) {
            for (int j = 0; j < nom[i].length; j++) {
                if (nom[i][j] >= 7.0){
                    System.out.println("Alerta!!! se debe evacuar zona costera!");;
                }
            }
        }
    }
    public static void salir(){
        System.exit(0);
    }
}
