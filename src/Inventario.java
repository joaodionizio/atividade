import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Fruta> frutas = new ArrayList<>();

    public void addFruta(Fruta fruta){
        frutas.add(fruta);
    }

    @Override
    public String toString() {
        return frutas.toString();
    }
}
