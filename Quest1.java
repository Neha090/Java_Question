import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.logging.Level;

public class Quest1 {

	public static void main(String[] args)
	{
		try 
		{
			Log myLog= new Log("log_ques1.txt");
			myLog.logger.setLevel(Level.INFO);
		
		int arr[]= {1,2,3,5,4,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
		
		TreeSet<Integer> tSet=new TreeSet<>();
		for(int i=0;i<arr.length;i++)
		{
			tSet.add(arr[i]);
		}
		
		Iterator<Integer> itr = tSet.iterator(); 
      
		int firstNum=itr.next();
       
		while (itr.hasNext()) 
        {
			
        	int secondNum=itr.next(); 
        	
		if(firstNum-secondNum==-2)
        	{
        		myLog.logger.info("The number missing is : "+(firstNum+1));
        		System.out.println("The number missing is : "+(firstNum+1));
        		break;
        	}
        	firstNum=seconsNum;
        	
            
        }
		
		}
		catch(Exception e)
		{
			Systemout.println(e);	
		}
	}
}
