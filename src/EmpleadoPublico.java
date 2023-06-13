public class EmpleadoPublico extends Persona{
    private String puesto;
    private String cargo;
    private int codigo;

    public EmpleadoPublico(){
        super();
    }

    public EmpleadoPublico(int ci, String nombre, int edad, String apellido, String direccion, String signo, int telefono, String puesto, String cargo, int codigo) {
        super(ci, nombre, edad, apellido, direccion, signo, telefono);
        this.puesto = puesto;
        this.cargo = cargo;
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void trabajarE(){
        System.out.println("Este es el metodo trabajar");
    }
    public void tramitar(){
        System.out.println("Este es el metodo tramitar");
    }
}
