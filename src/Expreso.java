public class Expreso extends Cafe{

    public Expreso(){
        descripcion = "Cafe Expreso";
    }

    public double costo(){
        switch (getTamano()) {
            case "M": return 2.09;
            case "G": return 2.15;
            case "N": default: return 1.99;
        }
    }
}
