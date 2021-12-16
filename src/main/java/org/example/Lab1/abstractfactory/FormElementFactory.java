package org.example.Lab1.abstractfactory;

public interface FormElementFactory {
    Button createButton();
    Checkbox createCheckbox();
    Input createInput();
}
