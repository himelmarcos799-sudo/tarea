import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el punto medio del rombo: ");
    int altura = teclado.nextInt();
    for (int i = 1; i<=altura; i++) {
        for (int l = 1; l<=altura-i; l++){
            System.out.print(" ");
        }
        for (int k = 1; k<=i; k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for (int i = altura - 1; i>=1; i--) {
        for (int k = 1; k<=altura -i; k++) {
            System.out.print(" ");
        }
        for (int l = 1; l<=i; l++){
            System.out.print("* ");
        }
        System.out.println();
    }
}