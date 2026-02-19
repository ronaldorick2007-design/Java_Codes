//Java Programme to demonstrate null pointer error without exception handling
//LOGIC:
//  Iterate through the array of objects, then if the pointer points to null,
//  then immediately use an alternative branch(message) without causing error

//Creating a class called book
class Book{
    //Attributes
	public String title;
	
    //Method
	Book(String title){
		this.title = title;
	}
}
public class NullPointerTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Array of objects
		Book[] books = new Book[3];
		
        //Assigning objects in array
		Book book1 = new Book("Java Fundamentals");
		Book book2 = new Book("Clean Code");
		
		books[0] = book1;
		books[1] = book2;
		
        //Iteration
		for(int i=0; i<books.length; i++) {
            //NullPointer Handling
			if(books[i] == null) {
				System.out.println("Book " + i + " : " + "[Empty Slot]");
			}
			else System.out.println("Book " + i + " : " + books[i].title);
		}
	}

}
