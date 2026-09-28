void main () {
    int filas = 5;
    for (int i = 1; i<=filas; i++) {
        for (int k = 1; k<=filas-i; k++){
            System.out.print(" ");
        }
        for (int f = 1; f<=i; f++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
