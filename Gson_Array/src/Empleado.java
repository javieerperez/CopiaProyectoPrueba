
public class Empleado {
	
    private final int id;
    private final String nombre;
    private final String empresa;
 
    public Empleado(int id, String nombre, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
    }
    
    public String toString() {
    	String salida = "Empleado: ( "+id+", "+nombre+", "+empresa+" )";
    	return salida;
    }
}
