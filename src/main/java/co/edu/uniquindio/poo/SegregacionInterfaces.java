package co.edu.uniquindio.poo;

//CORRECTO

interface CalcularSalario{
    double calcularSalario();
}

interface RegistrarAsistencia{
    void registrarAsistencia();
}

class Empleado implements CalcularSalario{
    private double salarioBase;

    public Empleado(double salarioBase){
        this.salarioBase = salarioBase;
    }

    @Override

    public double calcularSalario(){
        return salarioBase;
    }
}

class Gerente implements CalcularSalario, RegistrarAsistencia{
    private double salarioBase;
    private short añosEnEmpresa;

    public Gerente(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase*añosEnEmpresa;
    }

    public void registrarAsistencia(){
        //Logica y codigo para registrar asistencia de empleados
    }


}

//INCORRECTO

interface GestionarEmpresa{

    double calcularSalario();
    void registrarAsistencia();
    float calcularGanancias();
}

class Empleado implements GestionarEmpresa{

    private double salarioBase;

    public Empleado(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public void registrarAsistencia(){
        
    }

    public float calcularGanancias(){
        return 0;
    }

}