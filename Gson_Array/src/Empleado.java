//CLASE EMPLEADO
public class Empleado {
	
    private final int id;
    private final String nombreEmpleado;
    private final String empresa;
 
    public Empleado(int id, String nombreEmpleado, String empresa) {
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.empresa = empresa;
    }
    
    public String toString() {
    	String salida = "Empleado: ( "+id+", "+nombreEmpleado+", "+empresa+" )";
    	return salida;
    }
}
