import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese un numero positivo: ");
    int num = teclado.nextInt();
    int contador = 0;
    while (num>0) {
        contador = contador + 1;
        num = num / 10;
    }
    System.out.println("El numero ingresado tiene: " + contador + " digitos");
}