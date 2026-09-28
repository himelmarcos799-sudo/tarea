import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese la altura del cuadrado: ");
    int altura = teclado.nextInt();
    for (int i = 1; i<=altura; i++) {
        for (int l = 1; l<=altura;l++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
}