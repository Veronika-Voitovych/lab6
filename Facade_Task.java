import hierarchy.Ball;

public class Facade_Task {
    Person person1 = new Person();
    Person person2 = new Person("Вероніка Войтович", 19);
    Phone phone1 = new Phone("456127321", "Lenovo", 150.0);
    Phone phone2 = new Phone("381658321", "Samsung", 185.0);
    Phone phone3 = new Phone();
    Sedan sedan = new Sedan("Mitsubishi", "Червоний", 200);
    Truck truck = new Truck("Ford", "Чорний", 210);
    ExtendedPostalSorting extendedPostalSorting = new ExtendedPostalSorting();
    Ball ball = new Ball();

    public void main_task(){
        System.out.println("*********************** Task-1 *************************");

        person1.move();
        person1.talk();

        person2.talk();
        person2.move();

        System.out.println("*********************** Task-1 *************************");

        System.out.println("*********************** Task-2 *************************");

        phone1.getNumber();
        phone1.receiveCall("Veronika");
        phone1.receiveCall("Veronika","+111111111");
        phone1.sendMessage("111","222","333");

        phone2.getNumber();
        phone2.receiveCall("Veronika_2");
        phone2.receiveCall("Veronika_2","+22222222");
        phone2.sendMessage("444","555","666");

        phone3.getNumber();
        phone3.receiveCall("Veronika_3");
        phone3.receiveCall("Veronika_3","+44444444");
        phone3.sendMessage("777","888","999");

        System.out.println("*********************** Task-2 *************************");

        System.out.println("*********************** Task-3 *************************");

        sedan.brake();
        sedan.gas();

        truck.brake();
        truck.gas();

        System.out.println("*********************** Task-3 *************************");

        System.out.println("*********************** Task-4 *************************");

        extendedPostalSorting.input("Lviv","lviv",104,8,19,11,"test1","test2");
        extendedPostalSorting.display();

        System.out.println("*********************** Task-4 *************************");

        System.out.println("*********************** Task-5 *************************");

        Double volume =  ball.getVolume();
        Double radius = ball.getRadius();

        System.out.println(volume);
        System.out.println(radius);

        System.out.println("*********************** Task-5 *************************");


    }
}

