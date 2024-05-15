package sealedclass.data;

public sealed interface SayHello permits Human, Dog, Cat {

    String hello();
}
