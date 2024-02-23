package co.edu.unquindio.model;

public class Tecnico extends Empleado implements Icontribuyente {
    private String especializadoTt;

    public Tecnico(String nombre, String ID, Departamento idDepartamento, String especializadoTt) {
        super(nombre, ID, idDepartamento);
        this.especializadoTt = especializadoTt;
    }
    public String getEspecializadoTt() {
        return especializadoTt;
    }
    public void setEspecializadoTt(String especializadoTt) {
        this.especializadoTt = especializadoTt;
    }
    @Override
    public void contribuir() {

    }
}
