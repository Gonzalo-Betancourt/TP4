public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Lucas Pérez", "Seguridad");
        Empleado empleado2 = new Empleado("Martín Martinez", "Recursos Humanos", 3500);

        System.out.println("--El siguente empleado recibira un aumento de un 10%.");
        System.out.println(empleado1);
        empleado1.actualizarSalario(10);
        System.out.println("--Empleado actualizado:");
        System.out.println(empleado1);

        System.out.println("--El siguente empleado recibira un aumento de 1500.00");
        System.out.println(empleado2);
        empleado2.actualizarSalario(1500.00);
        System.out.println("--Empleado actualizado:");
        System.out.println(empleado2);

        Empleado.mostrarTotalEmpleados();

    }
}