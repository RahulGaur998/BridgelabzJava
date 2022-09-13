class DemoJavaBasics {
    int age; // empty

    // constructor - initialize age variable
    DemoJavaBasics(int age) { // parameter name - age
        this.age = age; // confusion - solution > this keyword > object1.age empty = 10
    }

    void display(DemoJavaBasics param1) { // parameter name - param1
        System.out.println(this.age); // 10
        System.out.println(param1.age); // 20
    }

    public static void main(String[] args) {
        DemoJavaBasics object1 = new DemoJavaBasics(10); // age = 10
        DemoJavaBasics object2 = new DemoJavaBasics(20); // age = 20

        object2.display(object1); // current object - object2
        object1.display(object2); // current object - object1
    }
}