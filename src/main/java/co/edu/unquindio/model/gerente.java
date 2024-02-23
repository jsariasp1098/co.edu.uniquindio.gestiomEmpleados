package co.edu.unquindio.model;

public class Gerente extends Empleado implements Icontribuyente, IgestionProyectos, IgestionEquipos{
    private String idProyecto;
    private String equipoEmpleado;

    public Gerente(String nombre, String ID, Departamento idDepartamento, String idProyecto, String equipoEmpleado) {
        super(nombre, ID, idDepartamento);
        this.idProyecto = idProyecto;
        this.equipoEmpleado = equipoEmpleado;
    }
    public String getIdProyecto() {
        return idProyecto;
    }
    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }
    public String getEquipoEmpleado() {
        return equipoEmpleado;
    }
    public void setEquipoEmpleado(String equipoEmpleado) {
        this.equipoEmpleado = equipoEmpleado;
    }
    @Override
    public void contribuir() {

    }
    @Override
    public void gestorEquipos() {

    }
    @Override
    public void gestorProyectos() {

    }
}
