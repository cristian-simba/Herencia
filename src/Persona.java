public class Persona {
    private int ci;
    private String nombre;
    private int edad;
    private String apellido;
    private String direccion;
    private String signo;
    private int telefono;

    public Persona(){
    }

    public Persona(int ci, String nombre, int edad, String apellido, String direccion, String signo, int telefono) {
        this.ci = ci;
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.direccion = direccion;
        this.signo = signo;
        this.telefono = telefono;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void caminar(){
        System.out.println("Este es el método de caminar que pertenece a Persona");
    }
    public void trabajar(){
        System.out.println("Este es el metodo trabajar que le pertenece a Persona");;
    }
}
