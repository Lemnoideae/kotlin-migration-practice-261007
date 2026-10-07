class Person {
    String name;

    // 생성자
    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

class Main {
    static void main() {
        Person person = new Person("Alice");
        person.greet();
    }
}