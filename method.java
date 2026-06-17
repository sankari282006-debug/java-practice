
public class method {
    
    int breadth;
    int length;
    int width;

    int volume(){
        return(length*breadth*width);
    }
    public static void main(String[] args) {
     method obj = new method();
     obj.breadth=78;
     obj.length=56;
     obj.width=90;
     System.out.println(obj.volume());

    }        
}
