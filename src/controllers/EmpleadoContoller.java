package controllers;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    public void crear(Empleado empleado) {
        empleadoDAO.add(empleado);
    }

    public void eliminar(int id) {
        empleadoDAO.eliminar(id);
    }

    public void listarEmpleados() {
        empleadoDAO.listarEmpleados();
    }
}