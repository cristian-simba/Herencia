public class Estudiante extends Persona{
    private int codigo;
    private String correo;
    private String semestre;
    private String carrera;

    public Estudiante(){
        super();
    }

    public Estudiante(int ci, String nombre, int edad, String apellido, String direccion, String signo, int telefono, int codigo, String correo, String semestre, String carrera) {
        super(ci, nombre, edad, apellido, direccion, signo, telefono);
        this.codigo = codigo;
        this.correo = correo;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void estudiar(){
        System.out.println("Este es el metodo estudiar que pertenece a Estudiante");
    }
    public void leer(){
        System.out.println("Este es el metodo leer");
    }
    public void memorizar(){
        System.out.println("Este es el metodo memorizar que pertenece a Estudiante");
    }
}
