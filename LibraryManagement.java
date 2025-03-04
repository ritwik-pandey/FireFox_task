import java.util.*;

class Library{
	ArrayList<Member> member;
	ArrayList<Book> books;
	public Library(){
		member = new ArrayList<>();
		books = new ArrayList<>();
	}

	public void addMember(String name){
		int id = member.size();
		Member mem = new Member(name,id);
		
		member.add(mem);
		System.out.println("Member " + mem.name + " added succesfully");
	}

	public void displayMem(){
		if(member.size() == 0){
			System.out.println("No User to display :( ");
			return;
		}
		for(int i = 0; i < member.size(); ++i){
			System.out.print(member.get(i).name + " ");
		}
		System.out.println();
	}

	public void addBook(String title){
		int id = books.size();
		Book book = new Book(title,id);
	       	books.add(book);	
	}

	public void displayBook(){
		if(books.size() == 0){
			System.out.println("No books Found :(");
			System.exit(0);
		}
		for(int i = 0; i < books.size(); ++i){
                        System.out.print(books.get(i).name + " ");
                }
                System.out.println();
	}

	public void deleteMember(String name){
		for(int i = 0; i < member.size(); ++i){
			if(member.get(i).name.equals(name)){
				member.remove(member.get(i));
				System.out.println("Succesfully Deleted :) ");
				return;
			}
		}

		System.out.println("No such user found :(");
	}

	public void deleteBook(String name){
		for(int i = 0; i < books.size(); ++i){
                        if(books.get(i).name.equals(name)){
                                books.remove(books.get(i));
                                System.out.println("Succesfully Deleted :) ");
                                return;
                        }
                }

                System.out.println("No such user found :(");

	}
		
}
	
class Book{
	String name;
	int id;
	public Book(String name, int id){
		this.name = name;
		this.id = id;
	}
}

class Member{
	String name;
	int id;
	public Member(String name1, int id1){
		name = name1;
		id = id1;	
	}
}

class LibraryManagement{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Library lib = new Library();
		while(true){
			System.out.println("\nLibrary Management System");
			System.out.println("1. Add a Member");
			System.out.println("2. Display Member");
            		System.out.println("3. Add Books");
            		System.out.println("4. Display Book");
            		System.out.println("5. Delete Member");
            		System.out.println("6. Delete Book");
            		System.out.println("7. Exit");
            		System.out.print("Enter your choice: ");
			int choice = in.nextInt();
			if(choice == 1){
				System.out.println("Enter Name: ");
				in.nextLine();
				String name = in.nextLine();
				lib.addMember(name);
			}else if(choice == 2){
				lib.displayMem();
			}else if(choice == 3){
				
				System.out.println("Enter the name of book");
				in.nextLine();
				String book = in.nextLine();
				lib.addBook(book);
			}else if(choice == 4){
				lib.displayBook();
			}else if(choice == 5){
				System.out.println("Enter the name of the member");
				in.nextLine();
				String name = in.nextLine();
				lib.deleteMember(name);
			}else if(choice == 6){
				System.out.println("Enter the name of the book");
                                in.nextLine();
                                String name = in.nextLine();
                                lib.deleteBook(name);
			}else{
				System.exit(0);
			}
		}
	}
}
