package mapl;

//in generic type we can restrict using extends keyword and we can also use & symbole
public class Data<T extends Thread&Comparable> {
	//means the above generic type only extends thread class and implements comparable interface
	
	/*T id;
	
	Data(T id)
	{
		this.id=id;
		System.out.println(id);
	}*/

}
