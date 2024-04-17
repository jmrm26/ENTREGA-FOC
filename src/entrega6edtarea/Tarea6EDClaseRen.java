package entrega6edtarea;
/**
 *
 * @author jm_97
 */
public class Tarea6EDClaseRen {
    
    public static final int minimoProductos = 3;
    public static final int limitePrecio = 5;
    public static final double extraPrecio80 = 0.8;
    public static final double extraPrecio95 = 0.95;
    
    public void outputTotalPrecio(double Total) {
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
    }
    
    public void aplicarDescuento(double precioProducto, int numProductos) {double Total;
    if(numProductos>minimoProductos)
        precioProducto-=limitePrecio;
            if (numProductos!=0){
            Total = precioProducto*extraPrecio80;
            outputTotalPrecio(Total);
        }else {
            Total = precioProducto*extraPrecio95;
            outputTotalPrecio(Total);
        }   
    }   
}
