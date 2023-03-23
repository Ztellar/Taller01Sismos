public class Main {
    public static void main(String[] args) { //uso de main para testeos
        double [][] nom = ingresarDatos();
        for (int i = 0; i < nom.length; i++) {
            for (int j = 0; j < nom[i].length; j++) {
                System.out.print(nom[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("El sismo más fuerte es de: "+ buscarMayorSismo(nom));
        System.out.println("La cantidad de sismos con magnitud 5 o más son: "+ contarSismos(nom));
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
    public static void enviarSMS(){

    }
    public static void salir(){

    }
}
