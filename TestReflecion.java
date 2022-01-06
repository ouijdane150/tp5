package ma.education.tp2.reflection.rappel;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class TestReflecion {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Lecture fichier des param�tres
		ResourceBundle rb =
		ResourceBundle.getBundle("ma.education.tp2.reflection.rappel.param");
		String value = rb.getString("keyClass1");
		// Convert String type To Class Type
		Class c = Class.forName(value);
		// Tableau pour les constructeurs de la classe ConnectionDB
		Constructor[] constructors = c.getDeclaredConstructors();
		// Modification de la visibilit� du premier constructeur
		constructors[0].setAccessible(true);
		// Instanciation de l�Objet (o) par r�flexion.
		Object o = constructors[0].newInstance(null);
		
	}


}
