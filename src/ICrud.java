import java.util.ArrayList;

public interface ICrud<ID, T> {
    T create(T object);

    void delete(Integer ID);

    void update(Integer ID, T object);

    T read(Integer ID);

    ArrayList<T> readAll();
}
