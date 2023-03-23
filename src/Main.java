import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //uso de main para testeos
        menu();
        /*double[][] nom = ingresarDatos();
        for (int i = 0; i < nom.length; i++) {
            for (int j = 0; j < nom[i].length; j++) {
                System.out.print(nom[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("El sismo más fuerte es de: "+ buscarMayorSismo(nom));
        System.out.println("La cantidad de sismos con magnitud 5 o más son: "+ contarSismos(nom));
        enviarSMS(nom); */
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int peso;
        System.out.println("Ingrese el numero");
        System.out.println("[1] Ingresar Datos");
        System.out.println("[2] Mostrar sismo de mayor magnitud");
        System.out.println("[3] Contar sismos mayores o iguales a 5.0");
        System.out.println("[4] Enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("[5] Salir");
        do {
            try {
                peso = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Caracter inválido, ingrese de nuevo");
                peso = 1;
                menu();
            }
        }while (peso < 1 || peso > 5);
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
