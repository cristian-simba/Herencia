public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private int horas;
    private int numCamiseta;
    private String representante;

    public Futbolista(){
        super();
    }
    public Futbolista(int ci, String nombre, int edad, String apellido, String direccion, String signo, int telefono, String equipo, String posicion, int horas, int numCamiseta, String representante) {
        super(ci, nombre, edad, apellido, direccion, signo, telefono);
        this.equipo = equipo;
        this.posicion = posicion;
        this.horas = horas;
        this.numCamiseta = numCamiseta;
        this.representante = representante;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void correr(){
        System.out.println("Este es el metodo correr");
    }
    public void defender(){
        System.out.println("Este es el metodo defender");
    }
}
