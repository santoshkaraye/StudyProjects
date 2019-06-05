package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class StreamExample {

	public static void main(String args[])
	{
		List<Integer> salary = new ArrayList();
		
		salary.add(100000);
		salary.add(400000);
		salary.add(300000);
		salary.add(200000);
		salary.add(405000);
		
		Optional<Integer> sum = salary.stream().reduce((a,b)->a+b);
		System.out.println("Sum=" +sum);
		
		salary.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");
        
        Student obj3 = new Student();
        obj3.setName("xyz");
        obj3.addBook("Learning Python, 5th Edition");
        obj3.addBook("Scrum Master");
        
        Student obj4 = new Student();
        obj4.setName("abc");
        obj4.addBook("Learning Python, 5th Edition");
        obj4.addBook("Scrum Master");

        List<Student> students = new ArrayList<>();
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        
        
      
       // students.stream().forEach(s->s.getBook().stream().filter(b-> {
      //  	return b.equals(b);
       // }).forEach(System.out::println));
        
        students.stream().forEach(s-> students.stream().forEach(
        		b -> {
        			if(b.getBook().equals(s.getBook()))
        			{
        				System.out.println("StudentName->" +s.getName() + "---Subject" +b.getBook());
        			}
        			
        		}
        		));
        
        
        		
	}
	
	
	
}

class Student {

    private String name;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Set<String> book;

    public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}

	public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }
    //getters and setters

}

