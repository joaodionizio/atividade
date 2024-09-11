public class Fruta {
    String nome;

    @Override
    public String toString() {
        return nome;
    }

    public static void main(String[] args) {
        Fruta fruta = new Fruta();
        fruta.nome = "Uva";
        Inventario inventario = new Inventario();
        inventario.addFruta(fruta);

        System.out.println(inventario);
    }
}
