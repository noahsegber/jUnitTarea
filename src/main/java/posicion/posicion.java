package posicion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class posicion {
	
	 public static List<Integer> encontrarPosiciones(int numero, int digito) {
	        List<Integer> posiciones = new ArrayList<>();
	        String numStr = String.valueOf(Math.abs(numero)); // Por si es negativo
	        char digChar = (char) ('0' + digito);

	        for (int i = 0; i < numStr.length(); i++) {
	            if (numStr.charAt(i) == digChar) {
	                posiciones.add(i);
	            }
	        }

	        return posiciones;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce un número:");
	        int numero = sc.nextInt();

	        System.out.println("Introduce un dígito (0-9):");
	        int digito = sc.nextInt();

	        if (digito < 0 || digito > 9) {
	            System.out.println("Dígito no válido.");
	            return;
	        }

	        List<Integer> posiciones = encontrarPosiciones(numero, digito);

	        if (posiciones.isEmpty()) {
	            System.out.println("El dígito no se encuentra en el número.");
	        } else {
	            System.out.print("El dígito aparece en las posiciones: ");
	            for (int pos : posiciones) {
	                System.out.print(pos + " ");
	            }
	        }

	        sc.close();
	    }

}
