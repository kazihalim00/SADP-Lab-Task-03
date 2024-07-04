
public class Human {

    private String name;
    private int number;

    Human() {
        System.out.println("Hey,here is no perameter");
    }

    Human(String Name) {
        System.out.println("Hey,here is one perameter");
    }

    Human(String name, int number) {
        
        System.out.println("Hey,here is two perameter");
    }
    public void display(String name, int number)
    {
        System.out.println("Name: "+name+"\nNumber: "+number);
    }
}


public class HumanTest {

    private String bookName;

    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human("Radwan");
        Human h3 = new Human("Kazi", 101);

        h1.display("Kazi", 101);
        h2.display("Radwan", 10);
        HumanTest hum1 = new HumanTest();
        hum1.hobby("Riadus Saleheen");

    }

    public void hobby(String bookName) {
        System.out.println("Name of Book: " + bookName);
    }
}
