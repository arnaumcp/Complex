package principal;

public class NombreMinuscules {

  public static void main (String[] args)  {
    int lowerCaseCount = 0;

    String text = "Hola què tal?";
    String textAsUpperCase = text.toUpperCase();

    for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            if (c >= 'a' && c <= 'z')
//                numMinuscules++;
      char c1 = text.charAt(i);
      char c2 = textAsUpperCase.charAt(i);

      if (c1 != c2){
        lowerCaseCount++;
      }
    }

    System.out.println("El nombre de minúscules és: "+ lowerCaseCount +".");

  }

}
