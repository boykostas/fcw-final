package Prog.presenter;

import Prog.model.Animals;
import Prog.model.TypeOfAnimal;

import java.util.Map;
import java.util.Optional;

public interface Model {
    int addAnimal(String name, int age, String commands, String type);
    Map<Integer, Animals> loadRegistry();
    Optional<Animals> findAnimal(int id);
    void addNewCommands(int number, String str);
}
