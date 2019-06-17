package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    Long id;
    String name;
    Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = Long.MAX_VALUE;
        this.name = name;
        this.address = address;
    }

    public Person() {
        name = "";
        address = new Address();
        id = Long.MIN_VALUE;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }

        Person x = (Person) o;
        return thisequals(id, x.id)&&
                thisequals(name, x.name)&&
                thisequals(address, x.address);

    }


    public static boolean thisequals(Object o1, Object o2){
        if(o1 == o2){
            return true;
        }
        if(o1 == null || o2 == null){
            return false;
        }
        return o1.equals(o2);
    }

    @Override
    public String toString() {
        String toReturn = "Person{id="+id+", name='"+name+"', address=" +address.toString()+"}";

        return toReturn;
    }
}