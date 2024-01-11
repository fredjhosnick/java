import java.util.Scanner;

public class Indice_Masa_Corporal {

    public static void main(String[] args) {
        System.out.println("Que peso tienes?");
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Escribe tu peso:");
        double peso = keyboard.nextDouble();

        System.out.println("Escribe tu altura:");
        double altura = keyboard.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Tu indice corporal es: " + imc);

        if (imc > 30) {
            System.out.println("Tienes obesidad, haz dieta urgente");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Tienes sobrepeso, modera tu dieta");

        } else if (imc > 18.5 && imc <= 25) {
            System.out.println("Tienes el peso normal, continua con esa dieta");

        } else if (imc <= 18.5) {
            System.out.println("Tienes el peso debajo de lo normal");
        }
    }
}
