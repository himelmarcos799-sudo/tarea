import java.util.Locale;
import java.util.Scanner;
void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese una palabra: ");
    String palabra = teclado.nextLine();
    palabra = palabra.toLowerCase(); // sirve para que na haya problemas con las mayusculas
    int contador = 0;
    for (int i = 0; i < palabra.length(); i++) {
        //palabra.length():
        // Devuelve la cantidad total de letras que tiene la palabra (por ejemplo, para "hola" devuelve 4).
        //Como las posiciones (índices) en Java se cuentan
        // desde 0, una palabra de 4 letras tiene las posiciones 0, 1, 2, 3. Usar < en lugar de <= evita que el
        // bucle intente buscar la posición 4 que no existe, previniendo un error de ejecución
        char letra = palabra.charAt(i);
        //charAt(i). Como i va cambiando en cada vuelta del
        // bucle (0, 1, 2...), en cada ciclo toma una sola letra.
        // char letra: Es la variable de tipo carácter donde guardas esa
        // letra extraída para poder compararla inmediatamente en el if.
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            contador++;
        }
    }
    System.out.println("El numero de vocales son de: " + contador);
}