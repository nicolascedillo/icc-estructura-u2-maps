package dao.impl;

import models.*;

import java.util.HashMap;
import java.util.Map;

import dao.EmpleadoDAO;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
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
