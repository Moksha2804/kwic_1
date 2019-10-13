package kwic_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class reading_line {
	
	public static void main(String[] args) {
		BufferedReader reader;
		try {
			//For input from the .txt file
			reader = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\demo.txt"));
			int counter = 0;//for count the outputs
			
		    //Array for store the lines read from the text file
			String[] a = new String[1000];
			
		    String[] ans_arr = new String[1000];
		    int ans_index = 0;
		    
		    int i=0;
			
		    String line = reader.readLine();//read line by line from the file
			
		    while (line != null)
		    {
				//System.out.println(line);
		    	a[i]=line;					
		    	int d=1; //circular shift by point
		    	int n=line.length();//length of the line
			    
			 System.out.println("After Circular Shift: ");
		    //Circular Shift of the string
			 for(i=0;i<n;i++)
			 {
		    	
				 ans_arr[ans_index] = line.substring(d) + line.substring(0, d);//circular shift formula
				 System.out.println(ans_arr[ans_index]);//print line after circular shift by d point
				 ans_index = ans_index +1 ;//increment index by 1 
			 
				 d++;//circular shift by point increment
	         
				 counter++;//increment counter
	       
	         }
		    line = reader.readLine();//read next line
			}
			System.out.println(counter);//print counter value
		    
			//Sorting the strings
			System.out.println(" ");
			
			String temp;
	        for (int x = 0; x < ans_index; x++) 
	        {
	            for (int j = x + 1; j < ans_index; j++) 
	            { 
	                if (ans_arr[x].compareTo(ans_arr[j])>0) 
	                {
	                	//System.out.println(ans_arr[x].compareTo(ans_arr[j]));
	                	//Swap elements
	                    temp = ans_arr[x];
	                    ans_arr[x] = ans_arr[j];
	                    ans_arr[j] = temp;
	                }
	            }
	        }
	        //Print result after sorting
	        System.out.println("Sorted Result:");
	        
		    for (int k = 0; k<ans_index;k++)
		    {
		    	System.out.println(ans_arr[k]);
		    }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
	}

}
