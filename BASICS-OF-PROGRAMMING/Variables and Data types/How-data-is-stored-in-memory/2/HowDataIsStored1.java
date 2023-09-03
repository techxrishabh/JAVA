public class HowDataIsStored1{
    public static void main(String[] args){

        char c = 'a';
        System.out.println(c + 3);
        int i = c + 10;
        System.out.println(i);

        // char abc = i;(This will give an error becuz we cant store the value of variable int to a char [char is of 2 bytes and int is of 4 bytes])

        i = c;
        System.out.println(i);
        // c = i; (Not possible, will give an error)


        long l = i;
        double d = i;
        float f = 1.23f;//(it will now get treated like a float not like a double sp that it will take the space of 4 byte)






    }
}