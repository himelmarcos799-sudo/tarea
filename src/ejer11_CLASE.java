import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    int num = teclado.nextInt();
    boolean esprimo = true;
    if (num<=1) {
        esprimo = false;
    } else {
        for (int i = 2; i <num; i++){
            if (num % i == 0) {
                esprimo = false;
                break;
            }
        }
        if (esprimo) {
            System.out.print("El numero: " + num + " es primo");
        } else {
            System.out.print("El numero: " + num + " no es primo");
        }
    }
}