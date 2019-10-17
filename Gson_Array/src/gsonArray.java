import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;



public class gsonArray {

	public static void main(String[] args) {
		desserializarJsonAArray();
		serializarArrayAJson();
		//serializarArrayAJsonOtravez();
	}

//	private static void serializarArrayAJsonOtravez() {
//		Empleado empleado1 = new Empleado(33, "Javier", "Perez");
//		List<Empleado> empleados = new ArrayList<Empleado>();
//		empleados.add(empleado1);
//		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
//		try(FileWriter writer = new FileWriter("empleados.json")){
//            prettyGson.toJson(empleados, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//	}

	public static void serializarArrayAJson() {
		Empleado empleado1 = new Empleado(46, "Fernando", "Autentia");
		Empleado empleado2 = new Empleado(33, "Piere", "Francia");
		Empleado empleado3 = new Empleado(21, "Sebastian", "Colombia");
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String representacionBonita = prettyGson.toJson(empleados);
		System.out.println(representacionBonita);
		
		try(FileWriter writer = new FileWriter("empleados.json")){
            prettyGson.toJson(empleados, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public static void desserializarJsonAArray() {
		try (Reader reader = new FileReader("empleados.json")) {
			Gson gson = new Gson();
			Type tipoListaEmpleados = new TypeToken<List<Empleado>>(){}.getType();
			List<Empleado> empleados = gson.fromJson(reader, tipoListaEmpleados);
			Empleado empleado1 = empleados.get(0);
			Empleado empleado2 = empleados.get(1);
			System.out.println(empleado1);
			System.out.println(empleado2);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}

