package com.example.hibernate;

  import java.util.Date;
  import java.util.Scanner;
  import org.hibernate.Session;

public class Run {

/**
 * @param args
 */
	public static void main(String[] args) {
		
	 	Session session = HibernateSessionManager.getSessionFactory().openSession();

	 	session.beginTransaction();
	 	Post post = new Post();
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter title ");
		String str=scanner.next();
	 	post.setTitle(str);
		System.out.println("please enter body ");
		String body=scanner.next();
	 	post.setBody(body);
		session.save(post);
	 	session.getTransaction().commit();


		}

	
}
