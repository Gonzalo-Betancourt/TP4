public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(String nombre, String puesto) {
        Empleado.totalEmpleados ++;
        this.id = Empleado.totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 2000;
    }

    public Empleado(String nombre, String puesto, double salario) {
        Empleado.totalEmpleados ++;
        this.id = Empleado.totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void actualizarSalario(int porcentajeAumento){
        this.salario = salario + (salario * porcentajeAumento) / 100;
    }

    public void actualizarSalario(double aumentoPlano){
        this.salario = salario + aumentoPlano;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    public static void mostrarTotalEmpleados(){
        System.out.println("Total de empleados: " + totalEmpleados);
    }

}
