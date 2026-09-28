import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    double nota = 100;
    while (nota<0 || nota>20) {
        System.out.println("Ingrese su nota: ");
        nota = teclado.nextDouble();
    }
    System.out.print("Nota valida: " + nota);
}