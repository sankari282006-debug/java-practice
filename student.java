class student{

   //class is something like blue print of the object

   int regno;
   String name;
   float cgpa;

  

 public static void main(String[] args) {

   //inside a main fn we r able to create and access a object

    student student = new student();
    student.regno=8;
    student.name ="sankari";
    student.cgpa=8.2f;
    System.out.println(student.regno);
    System.out.println(student.name);
    System.out.println(student.cgpa);
   }
}
