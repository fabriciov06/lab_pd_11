public class Crema extends Complemento{
    Cafe bebida;

    public Crema(Cafe bebida) {
        this.bebida = bebida;
    }

    public String getTamano() {
        return bebida.getTamano();
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    public double costo() {
        double precioComplemento = 0;
        switch (bebida.getTamano()) {
            case "M": precioComplemento = 0.15; break;
            case "G": precioComplemento = 0.20; break;
            case "N": default: precioComplemento = 0.10; break;
        }
        return precioComplemento + bebida.costo();
    }
}
