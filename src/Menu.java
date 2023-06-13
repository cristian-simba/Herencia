import java.util.function.DoublePredicate;

public class Menu {
    public static void main(String[] args) {

        Doctor primerDoctor = new Doctor();
        primerDoctor.setNombre("Ana");
        primerDoctor.setEdad(33);
        primerDoctor.setSigno("Leo");
        System.out.println(primerDoctor.getNombre() + " es Doctora");
        System.out.println("Tiene "+primerDoctor.getEdad()+ " años");
        System.out.println("Es de signo "+primerDoctor.getSigno());
        primerDoctor.examinar();

        System.out.println("");
        EmpleadoPublico empleado = new EmpleadoPublico();
        empleado.setNombre("Pablo");
        empleado.setTelefono(123456);
        System.out.println(empleado.getNombre() + " es Empleado Público");
        System.out.println("Su telefono es: " + empleado.getTelefono());
        empleado.tramitar();

        System.out.println();
        Futbolista miFutbolista = new Futbolista();
        miFutbolista.setNombre("Maritza");
        miFutbolista.setHoras(5);
        System.out.println(miFutbolista.getNombre()+ " es Futbolista");
        System.out.println("Entrena "+miFutbolista.getHoras()+" horas diarias");
        miFutbolista.correr();

        System.out.println("");
        Estudiante melani = new Estudiante();
        melani.setNombre("Melani");
        melani.setSemestre("3er Semestre");
        System.out.println(melani.getNombre() + " es estudiante");
        System.out.println("Está en "+melani.getSemestre());
        melani.leer();

    }
}
