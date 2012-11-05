/*
 FileName: AnotherHashSet.java
 
 @Author: Rohan Dalvi(rsd3565)
 
 @Author: Ajay Pantangi (axp5329)
 
 @version: 1.0 10/07/2012
 
 */
/*
 Below interface has the following methods header.
 
 1.add(Object o): Adds object to the HashSet.
 2. clear(): Clears the HashSet.
 3. contains(Object o): checks if the object is present int the HashSet.
 4. isEmpty(): checks if the HashSet is empty.
 5. remove(): removes the object from the HashSet.
 6. size(): Returns the size of the Hashset.
 */
public interface AnotherHashSet {
		   public boolean add(Object o);
		   public void clear();
		   public boolean contains(Object o);
		   public boolean isEmpty();
		   public boolean remove(Object o);
		   public int size();
		
}
