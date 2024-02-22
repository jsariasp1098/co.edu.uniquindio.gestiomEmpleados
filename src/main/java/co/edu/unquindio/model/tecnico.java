package co.edu.unquindio.model;

public class tecnico extends empleado implements Icontribuyente {
    private String especializadoTt;

    public tecnico(String nombre, String ID, String departamento, String especializadoTt) {
        super(nombre, ID, departamento);
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
