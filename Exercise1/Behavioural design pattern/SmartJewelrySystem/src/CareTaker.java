import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        if (memento != null) {
            mementoList.add(memento);
        } else {
            LoggerUtility.logWarning("Attempted to add a null Memento.");
        }
    }

    public Memento get(int index) throws CustomException {
        try {
            return mementoList.get(index);
        } catch (IndexOutOfBoundsException e) {
            LoggerUtility.logError("Index out of bounds while retrieving Memento: " + index, e);
            throw new CustomException("No Memento exists at index: " + index);
        }
    }

    public List<Memento> getMementoList() {
        return mementoList;
    }
}
