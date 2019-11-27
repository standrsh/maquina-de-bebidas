package maquinadecafe;

public class Normal extends Cafe{
    
    @Override
    public String getDescripcion(){
        return "Normal";
    }
    
    @Override
    public double getPrecio(){
        return 90;
    }
    
}