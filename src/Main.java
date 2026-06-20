public static void main(String[] args) {
    System.out.println("BIENVENIDO");
    System.out.println();

    Cafe bebida = new Expreso();
    bebida = new Leche(bebida);
    bebida = new Soya(bebida);
    bebida = new Crema(bebida);
    bebida = new Moca(bebida);

    System.out.println(bebida.getDescripcion() + "\nTotal: $" + bebida.costo());




}