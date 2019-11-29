package tfi02;

public class Profesor extends Persona {

    private double basico;
    private int antiguedad;

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    @Override
    public void modificarDatos(String nombre, String apellido, int legajo) {
        super.modificarDatos(nombre, apellido, legajo);
    }

    public double Sueldo(double monto, int antiguedad){
        double porcentaje = ((this.basico*10)/100);
        return this.basico+ (porcentaje*this.antiguedad);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "Sueldo básico=" + basico +
                ", Antiguedad=" + antiguedad +
                '}';
    }
}
