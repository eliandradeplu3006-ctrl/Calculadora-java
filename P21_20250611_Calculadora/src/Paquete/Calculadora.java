package Paquete;

public class Calculadora {
    private String marca;
    
    public Calculadora(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    
    public double sumar(double n1, double n2)
    {
        return n1+n2;
    }
    
    public double restar(double n1, double n2)
    {
        return n1-n2;
    } 
    
    public double multiplicar(double n1, double n2)
    {
        return n1*n2;
    }
 
    public double dividir(double n1, double n2)
    {
        return n1/n2;
    }    
    
}
