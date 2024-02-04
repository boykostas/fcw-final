package Prog.presenter;

import Prog.model.Animals;

import java.util.Map;

public interface Observer {
    int addAnimalToRegistry(String name, int age, String commands, String type);
    void addNewCommandToAnimal(int number, String str);
    Map<Integer, Animals> loadList();

}
