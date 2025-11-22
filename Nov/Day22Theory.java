/*Polymorphism is the Greek word which is the parent type refernece and the child type objects 
 *in this wwe will see the method overloading and the method overiding 
 * consider an example like he a animal class with the method sound, like the different animals with the different sounds
 * like dog, cat with this example we can achieve the multiple inhertency..
 *  

 */

//  class Animal{
//     public void sound(){
//         System.out.println("An Animal Has the Sound..");
//     }
//  }

//  class Dog extends Animal{
//     @Override
//    public void sound(){
//         System.out.println("An Dog bark..");
//     }
//  }
//  class Cat extends  Animal{
//     @Override
//     public void sound(){
//         System.out.println("An Cat Meow..");
//     }
//  }

/* * An Another Example like The an remote controller class button method 
 *   like differnet class with the differnt btns.. like the an tv btn, an ac btn
 *  */

 class remoteControll{
    static void remote(){
        System.out.println("An remote..");
    }
 }

 class Tv extends  remoteControll{
    static void remote(){
        System.out.println("An Tv remote..");
    }
 }

 class Ac extends remoteControll{
   static void remote(){
        System.out.println("An Ac Remote");
    }
 }


public class Day22Theory {
    public static void main(String[] args) {
      /*  Animal a = new Dog();
        a.sound();
        Animal b =new Cat();
        b.sound(); */

        remoteControll r1 = new Ac();
        r1.remote();
        remoteControll r2 = new Tv();
        r2.remote();

    }    
}
