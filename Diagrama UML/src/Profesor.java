public class Profesor extends Persona {
    private String area;
    private double salarioBase;
    private int horasCatedra;

    public Profesor(String nombre, int edad, String documento, String area, double salarioBase, int horasCatedra) {
        super(nombre, edad, documento);
        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }

    public double calcularSalario() {
        return salarioBase * horasCatedra;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Área: " + area);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Horas de cátedra: " + horasCatedra);
        System.out.println("Salario calculado: " + calcularSalario());
    }

    public String getRol() {
        return "Profesor";
    }
}

