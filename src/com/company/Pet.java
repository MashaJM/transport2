package com.company;

/**
 * Created by MashaJM on 28.01.2016.
 */
public class Pet {
    private String kind;
    private String name;


    public Pet(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
