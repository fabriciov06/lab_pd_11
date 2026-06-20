public class Moca extends Complemento{
    Cafe bebida;

    public Moca(Cafe bebida){
        this.bebida = bebida;
    }

    public String getDescricion(){
        return bebida.getDescripcion() + ", Moca";
    }

    public double costo() {
        return .20 + bebida.costo();
    }
}