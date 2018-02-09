package org.java8.exemples.Java8NewFeatures;

import java.util.Arrays;
import java.util.List;

import org.java8.exemples.Java8NewFeatures.beans.Usuario;

/**
 * Hello Lambda
 * @author rafael.carmo
 *
 */
public class HelloLambda {
	public static void main( String[] args )
	{
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		// That's for interface have only one method, in this case "accept"
		// It's still very easy to implements now
		//Consumer<Usuario> shower = u -> System.out.println(u.getName());
		
		usuarios.forEach(u -> System.out.println(u.getName()));
		
		//Other nice example
		usuarios.forEach(u -> u.becameModerator());
		
		usuarios.sort((u1, u2) -> u1.getName().compareTo(u2.getName()));
	}
}
