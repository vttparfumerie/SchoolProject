import java.util.Scanner;
public class Project {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name: ");
String name=sc.next();
int age=Integer.parseInt(sc.next());
if(age>18){
System.out.println("Hi "+name+", you are eligible to vote");
}else{
System.out.println("Hi "+name+", you are not eligible to vote.");
}
 }
 }