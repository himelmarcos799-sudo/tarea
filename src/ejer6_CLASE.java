import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    int i = teclado.nextInt();
   for (int j = 1; j<=12; j ++) {
       int resultado = i * j;
       System.out.println("Tabla del: " + i + " x " + j + " = " + resultado);
    }
}