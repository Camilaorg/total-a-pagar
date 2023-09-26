package cinconumerosytotal;
import java.util.Scanner;
public class Cinconumerosytotal {
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       float n1,n2,n3,n4,n5,r;
    System.out.print("ingresa un precio: ");
    n1=leer.nextFloat();
     System.out.print("ingresa un precio: ");
    n2=leer.nextFloat();
     System.out.print("ingresa un precio: ");
    n3=leer.nextFloat();
     System.out.print("ingresa un precio: ");
    n4=leer.nextFloat();
     System.out.print("ingresa un precio: ");
    n5=leer.nextFloat();
    r=(n1+n2+n3+n4+n5);
    System.out.print("el total es"+r);
    }
    
}
