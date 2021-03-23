class Dog{
    String breed;
    int size;
    String colour;
    int age;
    String name;

    public Dog(){}

    public Dog(String name, String breed, int size, String colour, int age){
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void setBreed(String breed){
        this.breed = breed;
    }

    void setSize(int size){
        this.size = size;
    }

    void setColour(String colour){
        this.colour = colour;
    }

    void setAge(int age){
        this.age = age;
    }

    void showEat() {
    }

    void showRun() {
    }

    void showSleep(){
    }

    void showName(){
        System.out.println("小狗的名字叫：" + this.name );
    }

    void showBreed(){
        System.out.println("小狗的品种：" + this.breed );
    }
}

public class MyDog {
    public static void main(String[] argv){
    Dog yellowDog = new Dog();
    yellowDog.setName("Yellow Dog");
    yellowDog.showName();
    Dog redDog = new Dog("redDog", "德国牧羊犬", 8, "red", 5);
    redDog.showBreed();
    redDog.setAge(12);
    redDog.setBreed("牧边");
    redDog.showName();
    redDog.showBreed();

    }
}
