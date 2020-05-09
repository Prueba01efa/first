import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int respuesta ;
		int a;
		int b;
		System.out.println("### CALCULATOR ### \n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir");
		
		respuesta = sc.nextInt();
		
		switch(respuesta) {
		case 1:
			System.out.println("Ingrese primer numero");
			a = sc.nextInt();
			System.out.println("Ingrese segund numero");
			b = sc.nextInt();
			System.out.printf("La suma de %d+ %d = %d",a,b,sumar(a,b));
			break;
		case 2:
			System.out.println("Ingrese primer numero");
			a = sc.nextInt();
			System.out.println("Ingrese segundo numero ");
			b = sc.nextInt();
			System.out.printf("La resta de %d - %d = %d",a,b,resta(a,b));
			break;
		case 3:
			System.out.println("Ingrese primer numero");
			a = sc.nextInt();
			System.out.println("Ingrese segundo numero");
			b = sc.nextInt();
			System.out.printf("La multiplicacion de %d * %d = %d",a,b,multi(a,b));
			break;
		case 4:
			System.out.println("Ingrese primer numero");
			a = sc.nextInt();
			System.out.println("Ingrese segundo numero");
			b = sc.nextInt();
			System.out.printf("La division de %d / %d = %d",a,b,divi(a,b));
			break;
		default:
			System.out.println("No se encontrado opcion");
			break;
		}
	}
	
	private static int sumar(int a , int b) {
		return a+b;
	}
	
	private static int resta(int a, int b) {
		return a-b;
	}
	
	private static int multi(int a,int b) {
		return a*b;
	}
	
	private static  int divi(int a,int b) {
		return a/b;
	}
	

}
