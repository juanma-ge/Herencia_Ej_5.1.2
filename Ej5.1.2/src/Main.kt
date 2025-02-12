fun main() {
    val departamento = Departamento()

    val empleado1 = EmpleadoPorHora("Juan Pérez", 1, 160.0, 10)
    val empleado2 = EmpleadoFijo("Ana Gómez", 2, 30000, 12.0)
    val empleado3 = EmpleadoPorHora("Carlos Ruiz", 3, 120.0, 15)

    departamento.agregarEmpleado(empleado1)
    departamento.agregarEmpleado(empleado2)
    departamento.agregarEmpleado(empleado3)

    println("Salario total del departamento: ${"%.2f".format(departamento.sumarHoras())}")
}