public class Estudiante extends Persona {
    private String programa;
    private double promedio;

    public Estudiante(String nombre, int edad, String documento, String programa, double promedio) {
        super(nombre, edad, documento);
        this.programa = programa;
        this.promedio = promedio;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Programa: " + programa);
        System.out.println("Promedio: " + promedio);
    }

    public String getRol() {
        return "Estudiante";
    }
}