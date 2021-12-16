package org.example.Lab1.abstractfactory;

public class WebInput implements Input{
    private String value;
    public void value(String value) {
        this.value = value;
    }
    public String value() {
        return value;
    }
    public void render() {
        System.out.println(
                String.format("render WebInput. With value %s", value)
        );
    }
}
