
public class eje3 { 

	public static void main(String[] args) {
		int n = leerN();
		int m = leerM(n);
		int multiplo =1;
		while(multiplo < m) {
			multiplo = siguienteMultiplo(n, multiplo);
			System.out.println(multiplo);
		}
	}
	private static int siguienteMultiplo(int n, int mayorq) {
		int aux = mayorq + 1;
		while (aux%n!=0) {
			aux++;
		}
		return aux;
	}
	private static int leerM(int n) {
		int m=0;
		while (m <= n) {
			System.out.println("Introduce un numero mayor que: " +n+ " para m");
			m = Console.readInt();
		}
		return m;
	}
	public static int leerN() {
		int n=0;
		while (n <= 0) {
			System.out.println("Introduce un numero positivo: ");
			n = Console.readInt();
		}
		return n;
	}
}
