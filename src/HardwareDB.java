import java.util.ArrayList;

public class HardwareDB implements ICrud<Integer, Hardware>{

    private ArrayList <Hardware> hardwares = new ArrayList<>();


    @Override
    public Hardware create(Hardware object) {
        if (hardwares.add(object)){
            return object;
        }
        return null;
    }

    @Override
    public void delete(Integer ID) {
        if (ID < hardwares.size()){
            hardwares.remove(ID);
        }
    }

    @Override
    public void update(Integer ID, Hardware object) {
        if (ID < hardwares.size()){
            hardwares.set(ID, object);
        }
    }

    @Override
    public Hardware read(Integer ID) {
        if (ID < hardwares.size()){
            return hardwares.get(ID);
        }
        return null;
    }

    @Override
    public ArrayList readAll(Hardware object) {
        for (Hardware hardware:hardwares) {
            return null;
        }
        return null;
    }
}
