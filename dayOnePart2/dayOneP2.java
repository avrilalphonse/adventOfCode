import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class dayOneP2 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader readFile = new BufferedReader(new FileReader("input.txt"));
        int[] entriesFile = new int[200];
        String myLine = null;
        int product = 0;
        for(int i=0; i < 200; i++)
        {
            myLine = readFile.readLine();
            entriesFile[i] = Integer.parseInt(myLine);
        }//end for loop
        for(int i=0; i<200; i++)
        {
        	for(int j=1; j<200; j++)
        	{
        		for(int k=1; k<200;k++)
        		{
        			if(entriesFile[i] + entriesFile[j] + entriesFile[k] == 2020)
        			{
        				product = entriesFile[i] * entriesFile[j] * entriesFile[k];
        			}//end if statement
        		}//end nested loop
        	}//end nested loop 
        }//end for loop
        System.out.println(product);
        readFile.close();  
    }//end main
}//end class
