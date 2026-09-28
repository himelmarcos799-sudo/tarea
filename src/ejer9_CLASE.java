import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int num = teclado.nextInt();
    int contador = 1;
    int i=1;
    do {
       contador = contador * i;
       i++;
    } while (i<=num);
    System.out.println("El resultado de: " + num + " factorial = " + contador);
}