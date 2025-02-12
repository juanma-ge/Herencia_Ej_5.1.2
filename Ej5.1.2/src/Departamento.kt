class Departamento {

    var empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado){
        empleados.add(empleado)
    }

    fun sumarHoras(): Double {
        return empleados.sumOf { it.calculaSalario() }
    }

}