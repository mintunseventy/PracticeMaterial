package lamdaNStream;

public class employee {

    String name;
    int age;
    /**
     * @return the name
     */
    public employee(String name,int age) {

        this.name=name;
        this.age=age;
    }
    public String getName() {
        return this.name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return this.age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return getName()+" "+getAge();
    }

}
