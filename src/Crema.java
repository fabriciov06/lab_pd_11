public class Crema extends Complemento{
    Cafe bebida;

    public Crema(Cafe bebida){
        this.bebida = bebida;
    }

    public String getDescripcion(){
        return bebida.getDescripcion() + ", Crema";
    }

    public double costo() {
        return .10 + bebida.costo();
    }
}
