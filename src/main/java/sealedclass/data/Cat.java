package sealedclass.data;

public record Cat() implements SayHello {
    @Override
    public String hello() {
        return "Meow";
    }
}
