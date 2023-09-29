//============================== IMPLICIT CASTING =====================================

// It happens automatically when converting from a narrower range data type to a wider range of data type 

// for eg ===== converting an int to a double/float/long
//              converting a float to a double 

// double d1 = 4;   int ==> double
// double d2 = 5.7f; float ==> double
// long l1 = 100; int ==> long

// Implicit casting happens because: 
// The range of a double is wider than an int

public class Implicit3{
    public static void main(String args[]){

        //creating int type variable
        int num = 10;

        System.out.println(num);

        //Now let store that no. into double thats what explicit typecasting is for 

        double data = num;

        System.out.println(data);

//Here, the Java first converts the int type data into the double type. And then assign it to the double variable named data

    }
}

// In the case of Widening Type Casting, the lower data type (having smaller size) is converted into the higher data type (having larger size). Hence there is no loss in data. This is why this type of conversion happens automatically.
// Note: This is also known as Explicit Type Casting.