
// EXPLICIT TYPECASTING__________________________________OR NARROWING_____________________
//-> narrowing means converting the higher data type value into smaller data type.

// -> In narrowing if we don’t write any type casting then compiler wont write any typecasting
// because there is a chance of loss of some data so that user has to write the typecasting
// explicitly hence it is called as explicit type casting.


//============================================================================================

// Explicit casting doesnot happen automatically...it should be done by programmer when converting from a wider to a narrower data type 

// we can loose data in some number by using this 

// eg ======== converting a double/float/long to an ing


//:::::::::::::::IMPORTANT::::::::::::::: IMPORTANT :::::::::::::: IMPORTANT ::::::::::::::::


// we can convert a large data type into smaller by telling the java to do becuz it will not happen automatically like 

// int i1 = (int) 4.5;              (int) 4.5 ===>> 4    (our data is loss)
// int i2 = (int) 8L;               (int) 8L ===>>    (our data is not loss)
// float f1 = (float) 4.5;          (float) 4.5;            (no loss)
// In this we are telling to java that take 4.5 as an interger by in reality its a double whose size is larger than the integer so we try to store that in the integer it can have a data loss 


public class Explicit2{
    public static void main(String[] args){

        //I WAS WRONG HERE

        char c = 'a';

        // "" it is a string literal
        // '' it is a character literal 
        // (Character literals are written by enclosing a character within a pair of single quotes. String literals are written by enclosing a set of characters within a pair of double quotes. Character literals are assigned to variables of type char. String literals are assigned to variables of type String.)

        int i = c + 10;

        i = c;
        char abc = (char)i;

        long l = i;
        l = 12345654321L;
        i = (int)l;
        System.out.println(l);        
        System.out.println(i);

    } 
}