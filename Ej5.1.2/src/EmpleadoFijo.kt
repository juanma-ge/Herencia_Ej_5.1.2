class EmpleadoFijo(nombre: String, id: Int, val numPagas: Int, val salarioFijo: Double): Empleado(nombre, id) {

    override fun calculaSalario(): Double {
        return salarioFijo / numPagas
    }

}