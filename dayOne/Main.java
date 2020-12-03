import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException
    {
        BufferedReader readFile = new BufferedReader(new FileReader("input.txt"));
        int[] entriesFile = new int[200];
        String myLine = null;
        int placeHolder = 0, product = 0;
        for(int i=0; i < 200; i++)
        {
            myLine = readFile.readLine();
            entriesFile[i] = Integer.parseInt(myLine);
        }//end for loop
        placeHolder = 0;
        for(int i=0; i<200; i++)
        {
            while(placeHolder < 200)
            {
                if(entriesFile[placeHolder] + entriesFile[i] == 2020)
                {
                    product = entriesFile[placeHolder] * entriesFile[i];
                }//end if statement
                placeHolder++;
            }
            placeHolder = 0;
        }//end for loop
        System.out.println(product);
        readFile.close();
    }//end main
}//end class