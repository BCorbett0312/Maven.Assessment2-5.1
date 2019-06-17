package rocks.zipcode.assessment2.generics;





import java.util.ArrayList;

import java.util.Iterator;


/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Ageable> implements Iterable<Ageable> {
    ArrayList<Ageable> shelter;



    public Shelter() {
        shelter = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
    }

    public void add(Ageable object) {shelter.add(object);

    }

    public Boolean contains(Ageable object) {
        return shelter.contains(object);
    }

    public void remove(Ageable object) {
        shelter.remove(object);
    }

    public Ageable get(Integer index) {
        return shelter.get(index);
    }

    public Integer getIndexOf(Ageable ageable) {
        return shelter.indexOf(ageable);
    }

    @Override
    public Iterator<Ageable> iterator() {
        return null;
    }
}