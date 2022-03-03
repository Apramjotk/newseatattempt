import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] seats = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle", "Kaitlyn"},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", "Rely"},
                {"Cheng Han", "Qihan", "Kevin", "Ryan", "Justin Liu", "Jeffrey", "Danny", "Elliot", "Benson", "Fiona", "Neil"}};
        //int [][] newseats= new int[3][12];
        //int[][]seatNum= {{1,2,3,4,5,6,7,8,9,10},{}}
        String [][] newseats= seats;
     for (int i=0; i< seats.length; i++){
         for (int j=0;j< seats[i].length;j++ ) {
             int i1 = (int) (Math.random() * seats.length);
             int j1 = (int) (Math.random() * seats[i].length);

                String temp = newseats[i][j];
                newseats[i][j] = newseats[i1][j1];
                newseats[i1][j1] = temp;


         }
     }
        for (int i=0; i< newseats.length; i++){
            for (int j=0;j< newseats[i].length;j++ ){
                System.out.println(newseats[i][j]);
            if (Arrays.equals(newseats[i],seats[i])||Arrays.equals(newseats[j],seats[j])){
                        int i1 = (int) (Math.random() * seats.length);
                        int j1 = (int) (Math.random() * seats[i].length);


                    String temp = newseats[i][j];
                    newseats[i][j] = newseats[i1][j1];
                    newseats[i1][j1] = temp;
                }

                    }
                }


        int x=1;
        for (int i=0; i< newseats.length; i++){
            for (int j=0;j< newseats[i].length;j++ ) {
                    System.out.print("| " + x + ". " + newseats[i][j] + " ");
                    x++;


            }
            System.out.println();
            }


    }
    }
