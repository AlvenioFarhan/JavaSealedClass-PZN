package sealedclass.data;

public record Dog() implements SayHello {
    @Override
    public String hello() {
        return "Woft";
    }
}
