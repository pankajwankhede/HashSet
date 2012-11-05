/*
 FileName: HashSet.java
 
 @Author: Rohan Dalvi (rsd3565 )
 Ajay Pantangi ( axp5329 )
 
 @version: 1.0 10/07/2012
 */
import java.util.Arrays;
/*
 The following class represents our own HashSet class implementing AnotherHashSet Interface. This class implements
 all the methods defined by the interface. It has the following methods:
 
 1. add(): This method adds object to our HashSet Class.
 2. clear(): This method clears all the objects in our HashSet.
 3. contains(): This method checks if the Object is contained in the HashSet and if yes, it returns the position of the object in the HashSet.
 4. isEmpty(): This method checks if the HashSet is empty.
 5. remove(): This method removes an object from the HashSet if the object is present in the HashSet.
 6. size(): This method returns the number of objects in the HashSet.*/

public class HashSet implements AnotherHashSet {
	  
	static int count = 0; // to keep track of number of objects in hashset.
	
	 Object[][] a2 = new Object[1009][10000];
	 
	    int p=0,q=0;
	   HashSet()
	   {

	   }
    /*
     @param Object o: This method adds the object o to the hashset after checking if the object is not already in the hashset, if the object already exists
     in the HashSet then it won't add it to the HashSet.
     */
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
						 
						   a2[j][k]=o;//assigning object at next to index location.
						   
						   count++;
						   break;
					   }
				   }
	
			   
				  			 	}
			}
		return true;
		}
    /*
     clear(): This method clears all objects from the HashSet.
     */
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
		   count = 0; //clear count
	   }
    /*
     @param Object o: This object is checked for its presence in the HashSet, if it is present we affirm and return the position of the object in the HashSet.
     */
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
    /*
     isEmpty(): This method checks if the HashSet is empty and returns a boolean value accordingly.
     */
	   public boolean isEmpty()
	   {
		   if(count == 0)
			   return true;
		   else
			   return false;
		   
	   }
    /*
     @param Object o: The Object o is checked for its presence in the HashSet first and then if present, it is deleted from the HashSet.
     */
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
    /*
     size(): This method returns the size that is the number of Objects in the HashSet.
     */
	   public int size()
	   {
		   return count;
	   }
	   /*public void display()
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
	   }*/
	  

}
