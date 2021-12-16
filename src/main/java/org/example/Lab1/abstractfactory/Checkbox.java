package org.example.Lab1.abstractfactory;

public interface Checkbox {
    void render();
    Checkbox state(boolean state);
    boolean state();
}
