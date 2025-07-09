import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import dao.*;
import dao.impl.EmpleadoDAOHashMap;
import dao.impl.EmpleadoDAOTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        System.out.println("Nombre: Nicolas Cedillo");
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoContoller.crear(emp1);
        empleadoContoller.crear(emp2);
        empleadoContoller.crear(emp3);
        empleadoContoller.crear(emp4);
        empleadoContoller.crear(emp5);

        empleadoContoller2.crear(emp1);
        empleadoContoller2.crear(emp2);
        empleadoContoller2.crear(emp3);
        empleadoContoller2.crear(emp4);
        empleadoContoller2.crear(emp5);

        System.out.println("\n-----Ejercicios con el DAO------");
        System.out.println("\t  Con HashMap");
        empleadoContoller.listarEmpleados();
        System.out.println("\t  Con TreeMap");
        empleadoContoller2.listarEmpleados();

    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedMap();
        mapa.ejemploConTreeMap();

    }

    private static void runEjerccios() {
        System.out.println("\nEJERCICIOS:");
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("\n\tAnagramas");
        System.out.println("Listen y silent: " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("Hello y Bello: " + Ejercicios.areAnagrams("hello", "bello"));
        System.out.println("Triangle y Integral: " + Ejercicios.areAnagrams("triangle", "integral"));

        System.out.println("\n\tSuma de dos");
        System.out.println("Input: nums = [9,2,3,6], objetivo = 5: ");
        int[] nums = ejercicios.sumatoriaDeDos(
                new int[] { 9, 2, 3, 6 }, 5);
        for (int num : nums) {
            System.out.print(num + "|");
        }
        System.out.println("\nInput: nums = [9,2,3,6], objetivo = 5: " + ejercicios.sumatoriaDeDos(
                new int[] { 9, 2, 3, 6 }, 10));

        System.out.println("\n\tContar Caracteres");
        ejercicios.contarCaracteres("holaaaa");

        System.out.println("\tAnagramas");
        System.out.println("Amor y roma: " + ejercicios.sonAnagramas("amor", "roma"));
        System.out.println("Hola y Halo: " + ejercicios.sonAnagramas("hola", "halo"));
    }
}
