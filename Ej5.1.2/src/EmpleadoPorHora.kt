class EmpleadoPorHora(nombre: String, id: Int, val salarioPorHora: Double, val horasTrabajadas: Int): Empleado(nombre, id) {

    override fun calculaSalario(): Double {
        return salarioPorHora * horasTrabajadas
    }

}