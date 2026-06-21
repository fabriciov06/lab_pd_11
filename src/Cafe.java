public abstract class Cafe {
    String descripcion = "Bebida desconocida";
    protected String tamano = "N";

        public String getDescripcion(){
            return descripcion;
        }

        public String getTamano() {
             return tamano;
        }

         public void setTamano(String tamano) {
             this.tamano = tamano;
         }

        public abstract double costo();


}
