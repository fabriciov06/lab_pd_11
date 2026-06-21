public class Batido extends Cafe{

        public Batido(){
                descripcion = "Cafe Batido";
        }

        public double costo(){
                switch (getTamano()) {
                        case "M": return 0.99;
                        case "G": return 1.09;
                        case "N": default: return 0.89;
                }
        }
}
