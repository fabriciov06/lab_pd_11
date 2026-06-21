public class Soya extends Complemento{
    Cafe bebida;

    public Soya(Cafe bebida){
        this.bebida = bebida;
    }

    public String getTamano() {
        return bebida.getTamano();
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Soya";
    }

    public double costo() {
        double precioComplemento = 0;
        switch (bebida.getTamano()) {
            case "M": precioComplemento = 0.20; break;
            case "G": precioComplemento = 0.25; break;
            case "N": default: precioComplemento = 0.15; break;
        }
        return precioComplemento + bebida.costo();
    }
}
