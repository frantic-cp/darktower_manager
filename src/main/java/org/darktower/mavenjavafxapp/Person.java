package org.darktower.mavenjavafxapp;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Person {
    private StringProperty name;
    private IntegerProperty initiative;
    private IntegerProperty strength;
    private IntegerProperty endurance;
    private IntegerProperty agility;
    private IntegerProperty intelligence;
    private IntegerProperty perception;
    private IntegerProperty charisma;
    private IntegerProperty willpower;
    private ArrayList<Skill> skills;
    private ArrayList<Feature> features;

    Person(String name){
        this.name.set(name);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public int getInitiative() {
        return initiative.get();
    }

    public IntegerProperty initiativeProperty() {
        return initiative;
    }

    public int getStrength() {
        return strength.get();
    }

    public IntegerProperty strengthProperty() {
        return strength;
    }

    public int getEndurance() {
        return endurance.get();
    }

    public IntegerProperty enduranceProperty() {
        return endurance;
    }

    public int getAgility() {
        return agility.get();
    }

    public IntegerProperty agilityProperty() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence.get();
    }

    public IntegerProperty intelligenceProperty() {
        return intelligence;
    }

    public int getPerception() {
        return perception.get();
    }

    public IntegerProperty perceptionProperty() {
        return perception;
    }

    public int getCharisma() {
        return charisma.get();
    }

    public IntegerProperty charismaProperty() {
        return charisma;
    }

    public int getWillpower() {
        return willpower.get();
    }

    public IntegerProperty willpowerProperty() {
        return willpower;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setInitiative(int initiative) {
        this.initiative.set(initiative);
    }

    public void setStrength(int strength) {
        this.strength.set(strength);
    }

    public void setEndurance(int endurance) {
        this.endurance.set(endurance);
    }

    public void setAgility(int agility) {
        this.agility.set(agility);
    }

    public void setIntelligence(int intelligence) {
        this.intelligence.set(intelligence);
    }

    public void setPerception(int perception) {
        this.perception.set(perception);
    }

    public void setCharisma(int charisma) {
        this.charisma.set(charisma);
    }

    public void setWillpower(int willpower) {
        this.willpower.set(willpower);
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public ArrayList<Skill> getSkillArrayList() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

}
