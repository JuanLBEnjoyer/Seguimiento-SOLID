package co.edu.uniquindio.poo;


class Empleado {
    private double salarioBase;

    public Empleado(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }
    
}

//CORRECTO

class Gerente extends Empleado {
    private double bonoExtra;

    public Gerente(double salarioBase,double bonoExtra){
        super(salarioBase);
        this.bonoExtra = bonoExtra;
    }

    public double calcularSalario(){
        return super.calcularSalario()+bonoExtra;
    }
}

//INCORRECTO

class Gerente extends Empleado {
    private double bonoExtra;

    public Gerente(double salarioBase,double bonoExtra){
        super(salarioBase);
        this.bonoExtra = bonoExtra;
    }

    public double calcularSalario(){
        return super.calcularSalario()+bonoExtra;
    }
}
