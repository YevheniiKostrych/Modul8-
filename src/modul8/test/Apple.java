package modul8.test;

interface Plantable {
    void plant();
    void grow();
}


class Apple implements Plantable {
    public void plant() {
        System.out.print("Plant apple");

    }
    public void  grow( ){

        System.out.println(" 3m.");
    }
}
class Pear implements Plantable {
    public void plant() {
        System.out.print("Plant pear");
    }
    public void  grow(){

        System.out.println(" 2m.");
    }
}

class Garden {
    public void addPlant(Plantable plant) {
        plant.plant();
        plant.grow();

    }
}

class GardenTest {
    public static void main(String[] args) {
        new Garden().addPlant(new Apple()); //Plant apple
        new Garden().addPlant(new Pear());
        new Apple().grow();
    }
}
