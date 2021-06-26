// Leone Rodrigues Santos, 24/06/21

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float fuel;
        int far;

        System.out.printf("\nEste script calcula o cosumo medio de combustivel.\n");

        System.out.printf("\nInsira a distancia parcorrida pelo automovel, em kilometros: ");
        far = scan.nextInt();

        System.out.printf("\nInsira o combustivel consumido pelo automovel, em litros: ");
        fuel = scan.nextFloat();

        System.out.printf("\n\nConsumo medio de combustivel: %6.2fl a cada km.\n", (fuel/ far));


    }
    
}
