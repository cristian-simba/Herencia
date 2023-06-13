public class Doctor extends Persona{
    private String especialidad;
    private int codigo;
    private int horario;
    private String hospital;

    public Doctor(){
        super();
    }

    public Doctor(int ci, String nombre, int edad, String apellido, String direccion, String signo, int telefono, String especialidad, int codigo, int horario, String hospital) {
        super(ci, nombre, edad, apellido, direccion, signo, telefono);
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.horario = horario;
        this.hospital = hospital;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    public void examinar() {
        System.out.println("Este es el metodo examinar");
    }
    public void curar(){
        System.out.println("Este es el metodo evaluar");
    }
}
