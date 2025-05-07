package com.softserve.academy.edu10;

public class WrapperBox {
    private Box box= new Box();

    public void setObject(String object) {
        box.setObject(object);
    }
    public String getObject() {
        return (String) box.getObject();
    }
}
