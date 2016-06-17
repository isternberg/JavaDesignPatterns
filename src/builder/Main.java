package builder;

public class Main {

    public static void main(String[] args) {
        GuitarBuilder guitarBuilder = new SpanishSevenStringsGuitar();
        GuitarDirector guitarDirector = new GuitarDirector(guitarBuilder);
        guitarDirector.makeGuitar();
        Guitar myGuitar = guitarDirector.getGuitar();
        System.out.println("My new Spanish seven Strings guitar:");
        System.out.println(myGuitar.getStringsMaterial());
        System.out.println(myGuitar.getStringsCount() + " Strings");
        System.out.println(myGuitar.getFretsCount() + " Frets");
    }
}
