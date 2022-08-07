import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2, n3, n4, total, p1 = 0.10f, p2 = 0.25f, p4 = 0.40f;
        Scanner entrada2 = new Scanner(System.in);
        char tecla = 's';

        System.out.print("\n PROGRAMA REALIZADO PARA PROBAR Visual Code + GIT + GitHub:\n");
        System.out.print("Por: Carlos Alberto Alegria \n");
        System.out.print("INGENIERÍA DEL SOFTWARE 2 \n");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Estudiante: " + i + "\n");
            System.out.print("Nota participación: ");
            n1 = entrada.nextFloat();
            System.out.print("1 parcial: ");
            n2 = entrada.nextFloat();
            System.out.print("2 parcial: ");
            n3 = entrada.nextFloat();
            System.out.print("Examen final: ");
            n4 = entrada.nextFloat();

            n1 = n1 * p1;
            n2 = n2 * p2;
            n3 = n3 * p2;
            n4 = n4 * p4;
            total = n1 + n2 + n3 + n4;

            System.out.println("La nota definitiva es: " + total + "\n");

        } // fin for

    }// fin guncion principal main

} // fin clase
