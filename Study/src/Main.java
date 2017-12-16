import java.util.ArrayList;

public class Main {

private String myString = "my string";


private ArrayList<Integer> myArray = new ArrayList<>();


public void printString(){

    System.out.println(myString);

}

public void addArray(int a){

    myArray.add(a);

}

public void addArray(int [] a){

    for (int x = 0 ; x < a.length ; x++){

        myArray.add(a[x]);

    }

}

public void printArray(){

    for (int x = 0 ; x < myArray.size() ; x++){

        System.out.println(myArray.get(x));

    }

}



public static void main (String [] args ) {

    Main a = new Main();

    int [] test = {1,2,3,4,5};

    a.addArray(test);

    a.printArray();

    //a.printString()

    //System.out.println("this is testing " + myString);



}

}
