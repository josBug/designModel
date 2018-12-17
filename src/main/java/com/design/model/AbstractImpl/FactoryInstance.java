package com.design.model.AbstractImpl;

public class FactoryInstance implements AbstractFactory{

    private ProductInstance productInstance;

    @Override
    public AbstructProduct constructFactory() {
        productInstance = new ProductInstance();
        return productInstance;
    }
}
