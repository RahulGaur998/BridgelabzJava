class Basics {
    int age;

    Basics(int age) {
        this.age = age;
    }

    void display() {
        System.out.println(this.age);
    }

    public static void main(String args[]) {
        Basics objName = new Basics(10);
        objName.display();
        objName.display();
    }

}