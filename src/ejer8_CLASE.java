import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    int suma = 0;
    double cantidad = 0;
    for (int i = 1; i<=10; i++) {
        System.out.println("Ingrese el monto a pagar: ");
        double monto = teclado.nextDouble();
        if (monto>100) {
            suma = suma + 1;
        }
        cantidad = cantidad + monto;
    }
    System.out.println("El total vedido es de: " + cantidad);
    System.out.println("La cantidad de ventas mayores a 100 es de: " + suma);
}