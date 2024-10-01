import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del vendedor = ");
        String n = teclado.next();

        System.out.println("Apellidos del vendedor = ");
        String a = teclado.next();

        Vendedor vendedor = new Vendedor(n, a);
        
        System.out.println("Edad del vendedor = ");
        int e = teclado.nextInt();
        teclado.close();

        vendedor.verificarEdad(e);
        vendedor.imprimir();

    }
}
