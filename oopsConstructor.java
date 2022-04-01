public class oopsConstructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name="Devansh";
        s1.age=21; 
        Student s2 = new Student(s1);

        s1.printinfo();
        s2.printinfo();
    }
}
    class Student{
        String name;
        int age;
        
        public void printinfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
        // Constructor
        Student(){
            System.out.println("Constructor Called");
        }

        // parameterised Constructor
        Student(String name,int age){
            this.name=name;
            this.age=age;
        }

        // copy Constructor
        Student(Student s2){
            System.out.println("Copy Constructor Called");
            this.name=s2.name;
            this.age=s2.age;

        }
    }



    
    

