public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Alvaro");
        cliente.setEdad(25);
        cliente.setTelefono("123123123");
        cliente.setCredito(10000000);
        System.out.printf("El cliente %s de %d años numero de contacto %s tiene un credito de %d",cliente.getNombre(),cliente.getEdad(),cliente.getTelefono(),cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Fredy");
        trabajador.setEdad(50);
        trabajador.setTelefono("654543432");
        trabajador.setSalario(5000000);
        System.out.printf("El trabajador %s de %d años numero de contacto %s tiene un salario de %d",trabajador.getNombre(),trabajador.getEdad(),trabajador.getTelefono(),trabajador.getSalario());
    }
}

class Persona{
   private int edad;
   private String nombre;
   private String telefono;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}