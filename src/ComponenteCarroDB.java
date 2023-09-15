import java.util.ArrayList;

public class ComponenteCarroDB implements ICrud<Integer, ComponenteCarro>{
    private ArrayList <ComponenteCarro> componenteCarros = new ArrayList<>();


    @Override
    public ComponenteCarro create(ComponenteCarro object) {
        return null;
    }

    @Override
    public void delete(Integer ID) {

    }

    @Override
    public void update(Integer ID, ComponenteCarro object) {

    }

    @Override
    public ComponenteCarro read(Integer ID) {
        return null;
    }

    @Override
    public ArrayList<ComponenteCarro> readAll() {
        return null;
    }
}
