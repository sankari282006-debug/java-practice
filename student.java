class student{

   //class is something like blue print of the object

   int height;
   int length;
   int breadth;
   student(int l, int h, int b){
       this.height = h;
       this.length = l;
       this.breadth= b;
   }
   public int volume(){
    return height*length*breadth;
   } 

 public static void main(String[] args) {

   //inside a main fn we r able to create and access a object
    student obj =  new student(6, 8, 9);
    int val1 =obj.volume();
    System.out.println(val1);
   }
}
