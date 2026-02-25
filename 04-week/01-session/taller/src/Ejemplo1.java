import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        //Imprimir un dato
        Double valor_unitario;
        Integer cantidad;
        String nombre_producto;
        String nombre_cliente;
        Double total_pagar;

        //Capturar los datos las variables e identificar el valor a pagar.
        Scanner scanner = new Scanner(System.in);

        //LLenar los datos de las variables
        System.out.println("\n*******************************");
        System.out.print("Digite el nombre del cliente: ");
        nombre_cliente = scanner.next();
        System.out.println("*******************************\n");

        System.out.print("Digite nombre del producto: ");
        nombre_producto = scanner.next();

        System.out.print("Digite el precio unitario de "+nombre_producto+": ");
        valor_unitario = scanner.nextDouble();

        System.out.print("Digite la cantidad de "+nombre_producto+" que desea comprar: ");
        cantidad = scanner.nextInt();


        //Procesar los datos
        total_pagar = cantidad * valor_unitario;

        System.out.println(nombre_cliente+" su total a pagar es: "+total_pagar+"\n");
        System.out.println("************");
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Valor Unitario: "+valor_unitario);
        System.out.print("************");
    }
}

