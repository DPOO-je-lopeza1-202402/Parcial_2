package clases;
import java.util.Scanner;

public class Parcial {
	// ATRIBUTOS
	public int a, b, c;
	
	// MÉTODOS
	public double calcularDiscriminante(int a, int b, int c) throws Exception {
		float value = (b*b)-(4*a*c);
		if (value < 0) {
			throw new Exception("¡Las soluciones son raíces complejas!");
		} else {
		return value;
		}
	}
	
	public double calcularRaiz(int a, int b, double dis, boolean sign) throws Exception {
		if (a == 0) {
			throw new Exception("El valor de 'a' NO puede ser 0!");
		} else {
			if (sign) {
				return (-b+Math.sqrt(dis))/(2*a);
			}
			else {
				return (-b-Math.sqrt(dis))/(2*a);
			}
		}
	}
	
	public double[] hallarRaices() {
		double[] answer = new double[2];
		// Se solicita al usuario los términos de la ecuación
		Scanner input = new Scanner(System.in); 
		System.out.println("Ingrese el valor de 'a': ");
		a = input.nextInt();
		System.out.println("Ingrese el valor de 'b': ");
		b = input.nextInt();
		System.out.println("Ingrese el valor de 'c': ");
		c = input.nextInt();
		input.close();
		
		// Se calcula el discriminante
		try {
			double discriminante = calcularDiscriminante(a,b,c); 
			double root_1 = calcularRaiz(a, b, discriminante, true);
			double root_2 = calcularRaiz(a, b, discriminante, false);
			
			if (root_1 == root_2) {
				 answer[0] = root_1;
				 answer[1] = 0;
			} else {
				answer[0] = root_1;
				answer[1] = root_2;
			}
		}
		
		catch (Exception error)
		{
			System.out.println("- ERROR -");
			error.printStackTrace();
			}
		return answer;
	}
}
