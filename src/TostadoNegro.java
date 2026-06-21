public class TostadoNegro extends Cafe{

    public TostadoNegro(){
        descripcion = "Cafe Tostado Negro";
    }

    public double costo(){
        switch (getTamano()) {
            case "M": return 1.09;
            case "G": return 1.19;
            case "N": default: return 0.99;
        }
    }
}
