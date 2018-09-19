package richaTutorial;

public class Dog
{

 String breed;
 int age;
 Dog (String breed1,int age1)
 {
     breed=breed1;
     age=age1;


 }
Dog()
{
    breed="lab";
    age=14;
}

 void defineDog ()
 {
     System.out.println(breed+" "+age);
 }

 public static void main(String atgs[])
 {
     //Dog objLab=new Dog("Labrador",14);
     Dog pug=new Dog("Pub", 10);
     Dog lab=new Dog();
     pug.defineDog();
     lab.defineDog();

 }
}
