import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese la altura del triangulo: ");
    int altura = teclado.nextInt();
    for (int i = 1; i<=altura; i++) {
        for (int f = 1; f<=altura -i;f++)
            System.out.print(" ");
        for (int l = 1; l<=i; l++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}