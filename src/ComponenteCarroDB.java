import java.util.ArrayList;

public class ComponenteCarroDB implements ICrud<Integer, ComponenteCarro> {
    private ArrayList<ComponenteCarro> componenteCarros = new ArrayList<>();

    @Override
    public ComponenteCarro create(ComponenteCarro object) {
        if (componenteCarros.add(object)) {
            return object;
        }
        return null;
    }

    @Override
    public void delete(Integer ID) {
        componenteCarros.remove(componenteCarros.get(ID));
    }

    @Override
    public void update(Integer ID, ComponenteCarro object) {
        if (ID < componenteCarros.size()) {
            componenteCarros.set(ID, object);
        }
    }

    @Override
    public ComponenteCarro read(Integer ID) {
        if (ID < componenteCarros.size()) {
            return componenteCarros.get(ID);
        }
        return null;
    }

    @Override
    public ArrayList<ComponenteCarro> readAll() {
        return componenteCarros;
    }
}
