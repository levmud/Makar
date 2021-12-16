package org.example.Lab1.abstractfactory;

public class Application {
    public static void main(String[] args) throws Exception{
        AbstractFabricService service = new AbstractFabricService();
        service.exec();
    }
}
