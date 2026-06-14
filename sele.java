import java.util.*;
public class sele{
     public static void main(String[] args) {
    Scanner repeat = new Scanner(System.in);

    System.out.println("enter the letter");

    char day = repeat.next().charAt(0);

    switch(day)
    {
        case 'a','v','i','o','u':
        
        System.out.println(day  +"  "+"it is an vowel ");
        break;


        default:
                                    System.out.println(day+"  "+"is a constant");


    
}}}
