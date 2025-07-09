package dao.impl;

import java.util.Map;
import java.util.TreeMap;
import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void eliminar(int id) {
        empleados.remove(new Empleado(id));
    }

    @Override
    public void listarEmpleados() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }
}