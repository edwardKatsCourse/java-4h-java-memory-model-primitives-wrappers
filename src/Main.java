public class Main {

    //psvm

    /**
     * byte        Byte
     * short       Short
     * char        Character
     * int         Integer
     * double      Double
     * float       Float
     * long        Long
     * boolean     Boolean
     *
     *
     */
    public static void main(String[] args) {
        Character c = 'a';
        System.out.println("Улица называется \"Ротшильд\"");
        System.out.println("My text \\  ");
        System.out.println("\u043c\u043e\u0439 \u043e\u0447\u0435\u043d\u044c \u043e\u0447\u0435\u043d\u044c \u043e\u0447\u0435\u043d\u044c \u0434\u043b\u0438\u043d\u043d\u044b\u0439 \u0442\u0435\u043a\u0441\u0442");
        System.out.println("\\u043c\\u043e\\u0439 \\u043e\\u0447\\u0435\\u043d\\u044c \\u043e\\u0447\\u0435\\u043d\\u044c \\u043e\\u0447\\u0435\\u043d\\u044c \\u0434\\u043b\\u0438\\u043d\\u043d\\u044b\\u0439 \\u0442\\u0435\\u043a\\u0441\\u0442");

//        int a1 = 0;
        Integer a1 = 0;


        if (1 == 2) {

            Person person = new Person();


            Main m = new Main();
            method(m);
            System.out.println(person);
            //code ..code ..code
            //code ..code ..code
            //code ..code ..code
            //code ..code ..code
            //code ..code ..code
            System.out.println(person);

        } else {
            //something else
            for (int i = 0; i < 1000; i++) {
                //i = 0
                //i = 1
                int a = 0;
                new Person();
            }
        }

        method(new Main());


    }

    private static void method(Main m) {
        m.toString();
        Person john = new Person(); //instance
        john.luggage = new Luggage();
        john.luggage.luggageName = "John's property";
        System.out.println(john.luggage.luggageName);


        int a = 100; //by value
        //objects -> by reference

        method_2(a, john);

        System.out.println(a);
        System.out.println(john.luggage.luggageName);

        //Output
        //a = 100
        //john.luggage.luggageName = "Stolen"

    }

    private static void method_2(int a, Person john) {
        a = 10;

        john.luggage = new Luggage();
        john.luggage.luggageName = "Stolen";
    }
}


class Person {
    Luggage luggage;
}

class Luggage {

    String luggageName;
}