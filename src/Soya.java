public class Soya extends Complemento{
    Cafe bebida;

    public Soya(Cafe bebida){
        this.bebida = bebida;
    }

    public String getDescricion(){
        return bebida.getDescripcion() + ", Soya";
    }

    public double costo() {
        return .15 + bebida.costo();
    }
}
