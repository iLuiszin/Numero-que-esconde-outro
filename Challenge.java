import java.util.HashSet;
import java.util.Set;

class Challenge {
    public static boolean checaNumeroEscondido(Integer numero, Integer numeroOculto) {

        String a = Integer.toString(numero);
        String b = Integer.toString(numeroOculto);

        Set digitos = new HashSet();
      
        for (int i = 0; i < a.length(); i++) {
            digitos.add(a.charAt(i));
        }

        for (int i = 0; i < b.length(); i++) {
            if (!digitos.contains(b.charAt(i)))
                return false;
        }
        return true;
    }
}
