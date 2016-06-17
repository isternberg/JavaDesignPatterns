package builder;

public class SpanishSevenStringsGuitar implements  GuitarBuilder {

    private Guitar guitar;

    public SpanishSevenStringsGuitar(){
        this.guitar = new Guitar();
    }

    @Override
    public void buildGuitarStringsMaterial() {
        this.guitar.setStringsMaterial("Mahogany Wood");
    }

    @Override
    public void buildGuitarStringsCount() {
        this.guitar.setStringsCount(7);

    }

    @Override
    public void buildGuitarFretsCounts() {
        this.guitar.setFretsCount(24);
    }

    @Override
    public Guitar getGuitar(){
        return this.guitar;
    }
}
