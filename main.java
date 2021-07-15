import java.util.ArrayList;

//Testing

public class main {




    public static void main(String[] args) {

        String [][] integerParts = {
        {"", "|", "|"},
        {" _ ", " _|", "|_ "},
        {" _ ", " _|", " _|"},
        {"   ", "|_|", "  |"},
        {" _ ", "|_ ", " _|"},
        {" _ ", "|_ ", "|_|"},
        {" _ ", "  |", "  |"},
        {" _ ", "|_|", "|_|"},
        {" _ ", "|_|", " _|"}
        };


// read input from args
//      long n = Long.parseLong(args[0]);

        long n = Long.parseLong("1123456789");


        ArrayList<Long> longs= new ArrayList<>();

        while (n > 0) {
            long d = n / 10;
            long k = n - d * 10;
            n = d;
//            System.out.println(k);
            longs.add(k);
        }

        for (Long i : longs) {
//           System.out.println("printing ints");
//            System.out.println(i);
            print(i);
        }

    }

    private static void print(Long i) {
        if(i==1) {
            System.out.println("|\n|");
        } else if(i==2) {
//            System.out.println("|\n|");
        } else if(i==3) {

        } else if(i==4) {

        } else if(i==5) {

        } else if(i==6) {

        } else if(i==7) {

        } else if(i==8) {

        } else if(i==9) {

        } else {
            System.err.println("oops");
        }
    }


}
