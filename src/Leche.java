public class Leche extends Complemento{
    Cafe bebida;

    public Leche(Cafe bebida){
        this.bebida = bebida;
    }

    public String getDescripcion(){
        return bebida.getDescripcion() + ", Leche";
    }

    public double costo() {
        return .10 + bebida.costo();
    }
}
