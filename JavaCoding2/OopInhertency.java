package JavaCoding2;

class vehicle{
    void speed(){
        System.out.println("All the Vehicle has the speedometer");
    }
    void fuel(){
        System.out.println("some of the vehicle has different fuel system ");
    }
}

class car extends vehicle{
    void speed(){
        System.out.println("with car we drive upto 100 ");
    }
    void fuel(){
        System.out.println("the car with the fuel diesel");
    }
}

class bike extends vehicle{
    void speed(){
        System.out.println("With the bike we can go upto the 60 more than should be the danger");
    }
       void fuel(){
        System.out.println("the car with the fuel petrol");
    }
}

public class OopInhertency {
    // inhertency is the accuring the properties and the 
    // behaviours from the one class to the another class
    // consider example like the parent class(parent) we have eyes and the color of the parent 
    //   child class (has same similarites according to the parent class)

    // another example like the vehicle class we have the (fuel) and the (speed) is (parent) 
    // child class have the (car) and the (bike)

    public static void main(String[] args) {
        car c1=new car();
        c1.speed();
        c1.fuel();
        bike b1=new bike();
        b1.speed();
        b1.fuel();
        
    }
}
