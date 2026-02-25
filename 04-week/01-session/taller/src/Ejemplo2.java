import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {

        //Nota : El usaurio puede decidir, si compra o no un producto más.

        //Capturar los datos las variables e identificar el valor a pagar.
        Scanner scanner = new Scanner(System.in);

        //Datos del cliente
        String nombre_cliente;
        Boolean control = false;
        String confirmar;
        Double gran_total=0.0;

        //LLenar los datos de las variables
        System.out.println("\n*******************************");
        System.out.print("Digite el nombre del cliente: ");
        nombre_cliente = scanner.next();
        System.out.println("*******************************\n");

        //Varaibles que se deben reiniciar por cada iteración
        Double valor_unitario;
        Integer cantidad;
        String nombre_producto;
        Double total_pagar;
        while (control.equals(false)){

            //reiniciar por cada iteración
            valor_unitario=0.0;
            cantidad=0;
            nombre_producto="";
            total_pagar=0.0;

            //Proceso lógica del negocio
            System.out.print("Digite nombre del producto: ");
            nombre_producto = scanner.next();
            System.out.print("Digite el precio unitario de "+nombre_producto+": ");
            valor_unitario = scanner.nextDouble();
            System.out.print("Digite la cantidad de "+nombre_producto+" que desea comprar: ");
            cantidad = scanner.nextInt();

            //Procesar los datos
            total_pagar = cantidad * valor_unitario;

            System.out.println("*************************************************************\n");
            System.out.println(nombre_cliente+" su total a pagar es: "+total_pagar);
            System.out.println("**********************");
            System.out.println("Cantidad: "+cantidad);
            System.out.println("Valor Unitario: "+valor_unitario);
            System.out.println("**********************\n \n");

            System.out.print("Desea agregar otro pruducto, digite 'SI' para continuar, de lo contrario, finalizará la compra: ");
            confirmar = scanner.next();
            if(!confirmar.equals("SI")){
                control = true;
            }
            gran_total+=total_pagar;
        }
        System.out.println("Su valor tatal a pagar es de : "+gran_total);
    }
}

