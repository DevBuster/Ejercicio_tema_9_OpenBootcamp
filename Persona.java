/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

/**
 *
 * @author DevBuster
 */
public class Persona {

    private int edad;
    private String nombre;
    private int telefono;

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        System.out.println("INFORMACION DEL CLIENTE:");
        cliente.setNombre("Tomioka Giyu");
        cliente.setEdad(21);
        cliente.setTelefono(123456789);
        cliente.setCredito(65000);

        System.out.println("- Nombre del Cliente: " + cliente.getNombre());
        System.out.println("- Edad del Cliente: " + cliente.getEdad());
        System.out.println("- Telefono del Cliente: " + cliente.getTelefono());
        System.out.println("- Credito del Cliente: " + "$" + cliente.getCredito());
        System.out.println("");

        Trabajador trabajador = new Trabajador();

        System.out.println("INFORMACION DEL TRABAJADOR:");
        trabajador.setNombre("Saitama");
        trabajador.setEdad(25);
        trabajador.setTelefono(12345);
        trabajador.setSalario(95000);

        System.out.println("- Nombre del trabajador: " + trabajador.getNombre());
        System.out.println("- Edad del trabajador: " + trabajador.getEdad());
        System.out.println("- Telefono del trabajador: " + trabajador.getTelefono());
        System.out.println("- Salario del trabajador: " + "$" + trabajador.getSalario());
    }

    public static class Cliente extends Persona {

        private int credito;

        public int getCredito() {
            return credito;
        }

        public void setCredito(int credito) {
            this.credito = credito;
        }
    }

    public static class Trabajador extends Persona {

        private int salario;

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
