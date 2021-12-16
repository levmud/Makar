package org.example.Lab1.abstractfactory;

public class WebFormElementFactory implements FormElementFactory{
    public Button createButton() {
        return new WebButton();
    }
    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }
    public Input createInput() {
        return new WebInput();
    }
}
