package structure_secuence;

import java.text.DecimalFormat;

public class Ejemplo1 {
    public static void main(String[] arg){
        System.out.println("Probando primer mensaje");

        //char
        char var_char = '.';
        System.out.println("La variable char es: "+var_char);

        //String
        String var_string = "Buenas noches para todos";
        System.out.println("La variable string es: "+var_string);

        //int
        int var_int = 21;
        System.out.println("La variable int es: "+var_int);

        //Integer
        Integer var_integer = 21;
        System.out.println("La variable Integer es: "+var_integer.floatValue());

        //double
        double var_double = 21;
        System.out.println("La variable var_double es: "+var_double);

        //Double
        Double var_double_class = 2.9;
        System.out.println("La variable var_double_class es: "+var_double_class);

        DecimalFormat df = new DecimalFormat("#.000");
        double precio= 21.0;
                String precioformateado= df.format(precio);
        System.out.println("PrecioFormateado"+ precioformateado);

        Integer dato = var_double_class.intValue();
        System.out.println("dato: "+dato);


    }
}
