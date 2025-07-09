package dao;

import models.*;

public interface EmpleadoDAO {

    void add(Empleado empleado);

    void eliminar(int id);

    void listarEmpleados();

}
