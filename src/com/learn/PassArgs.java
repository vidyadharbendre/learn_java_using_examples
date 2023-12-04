/*
* Author:
* Vidyadhar Bendre
*
* Date:
* 2nd December, 2023
*
* Email:
* vidyadhar.bendre@gmail.com
*
* Purpose:
* This is to pass arguments and check the program outcome to display
*
*
* */

public class PassArgs{
    public static void main(String args[]){
        int i=0, lenCount;
        String stringParms;
        lenCount = args.length;

        System.out.println("The total number of arguments " + lenCount);

        while (i < lenCount){
            stringParms = args[i];
            i+=1;
            System.out.println(i + ":" + " Arguments are :" + stringParms+ "!");
        }

    }

}