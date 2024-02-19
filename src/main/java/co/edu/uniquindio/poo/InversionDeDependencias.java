package co.edu.uniquindio.poo;

//CORRECTO
interface CalcularSalario{
    double calcularSalario();
}
abstract class Empleado implements CalcularSalario{
    private double salarioBase;

    public Empleado(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }
}

class Gerente extends Empleado{
    private double bonoExtra;

    public Gerente(double salarioBase,double bonoExtra){
        super(salarioBase);
        this.bonoExtra = bonoExtra;
    }

    public double calcularSalario(){
        return super.calcularSalario()+bonoExtra;
    }

}

class Asistente extends Empleado{
    public Asistente(double salarioBase){
        super(salarioBase);
    }
}

//INCORRECTO


class Gerente {
    private double bonoExtra;
    private Empleado empleado;

    public Gerente(double salarioBase, double bonoExtra){
        super(salarioBase);
        this.bonoExtra = bonoExtra;
    }

    public double calcularSalario(){
        return empleado.calcularSalario() + bonoExtra;
    }
}


