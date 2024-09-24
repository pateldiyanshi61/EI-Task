public class Originator {
    private String jewelry;

    public void setJewelry(String jewelry) throws CustomException {
        if (jewelry == null || jewelry.trim().isEmpty()) {
            throw new CustomException("Jewelry cannot be null or empty.");
        }
        this.jewelry = jewelry;
    }

    public String getJewelry() {
        return jewelry;
    }

    public Memento saveJewelryToMemento() {
        return new Memento(jewelry);
    }

    public void getJewelryFromMemento(Memento memento) {
        if (memento != null) {
            this.jewelry = memento.getJewelry();
        } else {
            LoggerUtility.logWarning("Attempted to retrieve null Memento.");
        }
    }
}
