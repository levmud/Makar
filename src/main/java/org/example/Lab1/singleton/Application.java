package org.example.Lab1.singleton;

public class Application {
    public static void main(String[] args) {
        SingletonService service = new SingletonService();
        service.exec();
    }
}
