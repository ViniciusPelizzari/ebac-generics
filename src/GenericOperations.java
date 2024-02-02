import java.util.ArrayList;
import java.util.List;

public class GenericOperations<T> implements IGenerics<T> {
    private List<T> itemList = new ArrayList<>();

    @Override
    public void criar(T item) {
        itemList.add(item);
    }

    @Override
    public void excluir(T item) {
        itemList.remove(item);
    }

    @Override
    public void imprimirTodos() {
        for (T item : itemList) {
            System.out.println(item);
        }
    }
}