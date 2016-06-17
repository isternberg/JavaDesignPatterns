package builder;

public class Guitar implements  GuitarCriteria {

    private String stringsMaterial;

    private int stringsCount;

    private int fretsCount;

    @Override
    public void setStringsMaterial(String stringsMaterial) {
        this.stringsMaterial = stringsMaterial;
    }

    public String getStringsMaterial() {
        return stringsMaterial;
    }

    @Override
    public void setStringsCount(int count) {
        this.stringsCount = count;
    }

    public int getStringsCount() {
        return stringsCount;
    }

    @Override
    public void setFretsCount(int count) {
        this.fretsCount = count;
    }

    public int getFretsCount() {
        return fretsCount;
    }
}
