package org.java8.exemples.Java8NewFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.java8.exemples.Java8NewFeatures.beans.Usuario;

/**
 * Hello ForEach!
 *
 */
public class HelloForEach 
{
	public static void main( String[] args )
	{
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getName());
			}
		});

	}
}
