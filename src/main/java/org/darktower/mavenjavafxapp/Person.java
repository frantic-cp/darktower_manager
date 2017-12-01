package org.darktower.mavenjavafxapp;

public class Person {
    private String name;
    private int initiative;

    Person(String name, int initiative){
        this.name = name;
        this.initiative = initiative;
    }

    public String getName() {
        return name;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
}
