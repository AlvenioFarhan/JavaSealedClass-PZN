package sealedclass.data;

public record Human() implements SayHello {
    @Override
    public String hello() {
        return "Hello";
    }
}
