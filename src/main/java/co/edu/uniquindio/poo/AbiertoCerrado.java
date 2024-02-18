package co.edu.uniquindio.poo;

//CORRECTO

abstract class Empleado{
    abstract float calcularSalario();
}

class Gerente extends Empleado{

    @Override

    float calcularSalario(){

        float salarioFijo = 5000000;

        return salarioFijo;

    }
}

class Supervisor extends Empleado{
    private short añosEnEmpresa;

    @Override

    float calcularSalario(){
        float tarifaFija = 500000;

        return tarifaFija*añosEnEmpresa;

    } 
}

//INCORRECTO


class Empleado{

    private TipoEmpleado tipoEmpleado;

    private short añosEnEmpresa;


    float calcularSalario(){

        if(tipoEmpleado == GERENTE){

            float salarioFijo = 5000000;

            return salarioFijo;
        }
        elif(tipoEmpleado == SUPERVISOR){

            float tarifaFija = 500000;

            return tarifaFija*añosEnEmpresa;

        }
    }


}

