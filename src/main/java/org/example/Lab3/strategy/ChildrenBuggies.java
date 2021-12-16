package org.example.Lab3.strategy;

public class ChildrenBuggies extends Auto{
    public ChildrenBuggies() {
        super(new HybridFillStrategy());
    }
}
