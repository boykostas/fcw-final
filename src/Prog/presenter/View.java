package Prog.presenter;

import Prog.model.Animals;

import java.util.Map;

public interface View {
    void showAnimals();
    void setObserver(Observer observer);
    void addAnimal(String name, int age, String commands, String type);
    void addNewCommand(int number, String str);
}
