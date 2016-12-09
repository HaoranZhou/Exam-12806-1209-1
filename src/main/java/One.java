import java.util.ArrayList;
import java.util.List;

public class One {
	List<Integer> list=null;

public void  main1()  
{  
	list =new ArrayList<Integer>();
    int i,j;  
    int count=0;  
      
    for (i=101; i<=200; i++)   
    {  
        for (j=2; j<i; j++)   
        {  

            if (i%j==0)   
                break;  
        }  

        if (j>=i)   
        {  
            count++;  
            list.add(i);
        }  
    	}
    System.out.print("101-200中间共有"+count+"个素数,他们分别是:");
    for(int s:list){
    	System.out.print(s+" ");
    }
	}


}

