import java.util.Arrays;


public class HashDemo implements AnotherHashSet {
	  
	static int count = 0;
	
	 Object[][] a2 = new Object[1009][10000];
	 
	    int p=0,q=0;
	   HashDemo()
	   {

	   }
	   
	   public boolean add(Object o)
		{
		   int i = o.hashCode()%1009;
		   for(int j=0;j<1009;j++)
		   {
			   if(j==i)
			   {
				   for(int k=1;k<10000;k++)
				   {   
					   if(a2[j][k] != null)
					   {
						   if(a2[j][k].equals(o)) //if the object is also same
						   {
							   break;
						   }
					   }
					   else{
						 //adding a counter for each row here
						   //a2[j][k]=i;//assigning hash code to element at index location.
						   a2[j][k]=o;//assigning object at next to index location.
						   //System.out.println("Hashcode is "+i);
						   //System.out.println("Added Object"); 
						   count++;
						   break;
					   }
				   }
	
			   
				  			 	}
			}
		return true;
		}
	 
	   public void clear()
	   {
		   for(int j=0;j<1009;j++)
		   {
			   for(int k=1;k<10000;k++)
			   {
				   if(a2[j][k] != null)
					   a2[j][k] = null;
			   }
		   }
		   System.out.println("Array cleared");
		   count = 0; 
	   }
	   public boolean contains(Object o)
	   {
		   int i = o.hashCode()%1009;
		   for(int j=0;j<1009;j++)
		   {
			   if(j == i)
			   {
				   for(int k=1;k<10000;k++)
				   {
					   if(a2[j][k] != null && a2[j][k].equals(o))
					   {
						   System.out.println("found and position is "+j+" "+k);
						   return true;
					   }
					   
				   }
			   }
		   }
		   return false;
	   }
	   
	   public boolean isEmpty()
	   {
		   if(count == 0)
			   return true;
		   else
			   return false;
		   
	   }
	   public boolean remove(Object o)
	   {
		   int i = o.hashCode()%1009;
		   for(int j=0;j<1009;j++)
		   {
			   if(j == i)
			   {
				   for(int k=1;k<10000;k++)
				   {
					   if(a2[j][k] != null && a2[j][k].equals(o))
					   {
						   int p=k;
						   while(a2[j][p+1] != null)
						   {
							   a2[j][p] = a2[j][p+1];
							   p++;
						   }
						   a2[j][p] = null;
						   count--;
						   return true;
					   }
					   
				   }
			   }
		   }
		   return false;
	   }
	   public int size()
	   {
		   return count;
	   }
	   public void display()
	   {
		   if(count == 0)
		   {
			   System.out.println("array empty");
		   }
		   for(int x=0;x<1009;x++)
		   {
			   for(int y=1;y<10000;y++){
				   if(a2[x][y]!=null)
				   {
					   System.out.println(a2[x][y]);
				   }
			   }
			   	
			}		   
		   System.out.println("no of objects : "+count);
	   }
	  

}
