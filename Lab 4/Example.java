class Example{

    public static void main(String args[]){

        Person p1 = new Person("Noah",27);
        Employee e1 = new Employee (23432,"Justin Bieber",25);
        Employee e2 = new Employee (76782,"Sarah Conner",54);
        Employee e3 = new Employee (89783,"Jason Momoa",45);
        Animal a1 = new Animal("Paparazzi");
        Animal a2 = new Animal("ApeShit");
        Animal a3 = new Animal("Terminator");

       

        a1.attack(e1);
        a2.attack(e3);
        a3.attack(e2);
        a2.attack(e2);
        a1.attack(e3);
        
    }
}