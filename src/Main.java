public class Main{
    public static void main(String[] args) {

    System.out.println("BIENVENIDO");
    System.out.println();

    Cafe bebida = new Expreso();
    bebida = new Leche(bebida);
    bebida = new Soya(bebida);
    bebida = new Crema(bebida);
    bebida = new Moca(bebida);
    System.out.println(bebida.getDescripcion() + "\nTotal: $" + bebida.costo());


    Cafe bebida2 = new Descafeinado();
    bebida2 = new Moca(bebida2);
    bebida2 = new Moca(bebida2);
    bebida2 = new Soya(bebida2);
    bebida2 = new Leche(bebida2);
    System.out.println(bebida2.getDescripcion() + "\nTotal: $" + bebida2.costo());


    Cafe bebida3 = new Batido();
    bebida3 = new Crema(bebida3);
    bebida3 = new Crema(bebida3);
    bebida3 = new Leche(bebida3);
    bebida3 = new Leche(bebida3);
    bebida3 = new Soya(bebida3);
    bebida3 = new Soya(bebida3);
    bebida3 = new Leche(bebida3);
    bebida3 = new Leche(bebida3);
    System.out.println(bebida3.getDescripcion() + "\nTotal: $" + bebida3.costo());


    Cafe bebida4 = new TostadoNegro();
    bebida4 = new Crema(bebida4);
    bebida4 = new Crema(bebida4);
    bebida4 = new Soya(bebida4);
    bebida4 = new Soya(bebida4);
    bebida4 = new Soya(bebida4);
    System.out.println(bebida4.getDescripcion() + "\nTotal: $" + bebida4.costo());
}
}