import java.util.Scanner;
void main () {
    Scanner teclado = new Scanner(System.in);
    int ventas = 1;
    int montomayor = 0;
    double montototal = 0;
    while (ventas<=10) {
        System.out.print("Ingrese el monto del producto: ");
        monto = teclado.nextDouble();
        if (monto > 100) {
            montomayor = montomayor + 1;
        }
        montototal = montototal + monto;
        ventas ++;
    }
    System.out.println("Su total de compra es: " + montototal);
    System.out.println("Los productos que valen mas de 100 son: " + montomayor);
}
static double monto;