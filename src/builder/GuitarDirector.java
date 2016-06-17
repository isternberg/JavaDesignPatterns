package builder;

public class GuitarDirector  {

    private GuitarBuilder guitarBuilder;

    public GuitarDirector(GuitarBuilder guitarBuilder) {
        this.guitarBuilder = guitarBuilder;
    }

    public Guitar getGuitar(){
        return guitarBuilder.getGuitar();
    }

    public void makeGuitar(){
        this.guitarBuilder.buildGuitarStringsMaterial();
        this.guitarBuilder.buildGuitarStringsCount();
        this.guitarBuilder.buildGuitarFretsCounts();
    }
}
