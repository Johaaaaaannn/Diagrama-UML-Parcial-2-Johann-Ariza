import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("MENÚ:");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar profesor");
            System.out.println("3. Mostrar todos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombreE = sc.nextLine();
                    System.out.print("Edad: ");
                    int edadE = Integer.parseInt(sc.nextLine());
                    System.out.print("Documento: ");
                    String docE = sc.nextLine();
                    System.out.print("Programa: ");
                    String programa = sc.nextLine();
                    System.out.print("Promedio: ");
                    double promedio = Double.parseDouble(sc.nextLine());
                    personas.add(new Estudiante(nombreE, edadE, docE, programa, promedio));
                    System.out.println("Estudiante registrado.");
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombreP = sc.nextLine();
                    System.out.print("Edad: ");
                    int edadP = Integer.parseInt(sc.nextLine());
                    System.out.print("Documento: ");
                    String docP = sc.nextLine();
                    System.out.print("Área: ");
                    String area = sc.nextLine();
                    System.out.print("Salario base: ");
                    double salarioBase = Double.parseDouble(sc.nextLine());
                    System.out.print("Horas: ");
                    int horas = Integer.parseInt(sc.nextLine());
                    personas.add(new Profesor(nombreP, edadP, docP, area, salarioBase, horas));
                    System.out.println("Profesor registrado.");
                    break;

                case 3:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        for (Persona p : personas) {
                            System.out.println("-------------------------");
                            p.mostrarInfo();   // polimorfismo
                        }
                    }
                    break;

                case 0:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}