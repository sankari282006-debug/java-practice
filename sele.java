import java.util.*;
public class sele{
     public static void main(String[] args) {
    Scanner repeat = new Scanner(System.in);

    System.out.println("enter the number of day");

    int day = repeat.nextInt();

    switch(day)
    {
        case 1:
        System.out.println("it is sunday");
        break;

        case 2:
            System.out.println("it is monday");
            break;

            case 3:
                System.out.println("it is tuesday");
                break;

                case 4:
                    System.out.println("it is wednesday");
                    break;

                    case 5:
                        System.out.println("it is thusday");
                        break;

                        case 6:
                            System.out.println("it is friday");
                            break;

                            case 7:
                                System.out.println("it is saturday");
                                break;

                                default:
                                    System.out.println("pls enter the value betweem 1-7");


    }
}}
