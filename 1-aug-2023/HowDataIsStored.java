//Data is stored in the form of binary 

//like if we try to store an integer then it will first converted into binary then it will store in the memory of the computer becuz computers understand only 0 and 1 

// if we try to store alphabet like a, b, c ,d .... etc then it will get converted according to ASCII table (The ASCII table contains letters, numbers, control characters, and other symbols. Each character is assigned a unique 7-bit code. ASCII is an acronym for American Standard Code for Information Interchange.)


//example________________

public class HowDataIsStored{
    public static void main(String[] args){
        char c = 'a';
        int i = 10;

        System.out.println(c + i);
    }
}

//Answer will be 107 becuz a will get converted into integer according to ascii table (the value of in ascii table is 97 so the total value will be 97 + 10 which is 107)