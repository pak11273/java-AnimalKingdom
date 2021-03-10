package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{

    public static List<Animals> filteredList = new ArrayList<>();

    public static void filterAnimals(List<Animals> animals, CheckAnimal tester, boolean printit)
    {
        filteredList.clear();

        for (Animals a : animals)
        {
            if (tester.test(a))
            {
                if (printit)
                {
                    System.out.println(a.getName() + " " + a.breath());
                }
                filteredList.add(a);
            }
        }
    }

    public static void main(String[] args)
    {
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 2021);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<Animals> myList = new ArrayList<>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);


        System.out.println("\nList all the animals in descending order by year named");
        System.out.println(panda.getName());
        myList.sort((v1, v2) -> v2.getName().compareToIgnoreCase(v1.getName()));
        myList.forEach((v) -> System.out.println(v.getName()));

        System.out.println("\nList all the animals alphabetically");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v.getName()));

        System.out.println("\nList all the animals order by how they move");
        myList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        myList.forEach((v) -> System.out.println(v.getName() + " move: " + v.move()));

        System.out.println("\nList only those animals the breath with lungs");
        filterAnimals(myList, a -> (a.breath().equalsIgnoreCase("lungs")) && (a instanceof Animals),
                true);
        System.out
                .println("\nList only those animals that breath with lungs and were named in 1758");
        filterAnimals(myList, a -> (a.breath().equalsIgnoreCase("lungs")) && (a.getYear() == 1758),
                true);
        System.out.println("List only those animals that lay eggs and breath with lungs");
        filterAnimals(myList,
                a -> (a.breath().equalsIgnoreCase("lungs")) && (a.reproduce() == "eggs"), true);
        System.out.println("List alphabetically only those animals that were named in 1758");
        filterAnimals(myList, a -> (a.getYear() == 1758), true);

    }
}
