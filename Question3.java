import java.util.*;
import java.util.logging.Level;

public class Question3 {
	
	public static void main(String[] args)
	{
		try 
		{
			Log myLog= new Log("log_ques3.txt");
			myLog.logger.setLevel(Level.INFO);
			
	   int arr[]= {1,2,3,4,4,5,5,6,7,8,9,10,11,12,13,14,14,15,16,17,18,19,20,21,22,23,24,25,26,27,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};

	   HashMap<Integer,Integer> hMap=new HashMap<>();
	   
       for(int i=0;i<100;i++)
       {
    	   if(hMap.containsKey(arr[i]))
    	   {
    		   hMap.put(arr[i],hMap.get(arr[i])+1);
    	   }
    	   else
    		   hMap.put(arr[i],1);
       }
       System.out.println("The numbers repeating more than 1 time : ");
       
      for (Map.Entry<Integer, Integer> iter : hMap.entrySet())
       {
         if((int)iter.getValue()>1) 
         {
        	 myLog.logger.info(iter.getKey() +" ");
        	
         }
       }
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
       

	
	}

}
