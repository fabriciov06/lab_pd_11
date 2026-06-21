public class Descafeinado extends Cafe{

    public Descafeinado(){
        descripcion = "Cafe Descafeinado";
    }

    public double costo(){
        switch (getTamano()) {
            case "M": return 1.15;
            case "G": return 1.25;
            case "N": default: return 1.05;
        }
    }
}
