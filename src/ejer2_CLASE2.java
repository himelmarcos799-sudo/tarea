import java.util.Scanner;
static Scanner teclado = new Scanner(System.in);
static int opciones;
void main() {
    do {
        System.out.println("MENU");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. salir");
        System.out.println("Ingrese una opcion: ");
        opciones = teclado.nextInt();
        switch (opciones){
            case 1:
                System.out.print("Ingrese el primer numero a sumar:");
                double num1 = teclado.nextDouble();
                System.out.print("Ingrese el segundo numero a sumar:");
                double num2 = teclado.nextDouble();
                double resultado1=suma(num1,num2);
                System.out.println("RESULTADO: " + resultado1);
                System.out.println("..........................");
                System.out.println("..........................");
                System.out.println("..........................");
                System.out.println("..........................");
                break;
            case 2:
                System.out.print("Ingrese el primer numero a restar:");
                double num1r = teclado.nextDouble();
                System.out.print("Ingrese el segundo numero a restar:");
                double num2r = teclado.nextDouble();
                double resultado2=resta(num1r,num2r);
                System.out.println("RESULTADO: " + resultado2);
                System.out.println("..........................");
                System.out.println("..........................");
                System.out.println("..........................");
                System.out.println("..........................");
                break;
            case 3:
                System.out.println("SALISTE");
                break;
            default:
                System.out.println("opcion no disponible:");
        }
    } while (opciones!=3);
}
static double suma (double a, double b) {
    return a + b;
}
static double resta (double a, double b) {
    return a - b;
}