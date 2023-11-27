/*

This is to pass arguments and also print all these arguments that you have given

 */


public class PassArgs{
    public static void main(String args[]){
        int i=0, lenCount;
        String stringParms;
        lenCount = args.length;
        Scanner inputSac;

        System.out.println("The total number of arguments " + lenCount);

        while (i < lenCount){
            stringParms = args[i];
            i+=1;
            System.out.println(i + ":" + " Arguments are :" + stringParms+ "!");
        }

    }

}