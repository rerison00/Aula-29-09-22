import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, ArrayList<String>> hashtable = new Hashtable<String, ArrayList<String>>();

        ArrayList<String> listaContatosVoce = new ArrayList<String>();

        listaContatosVoce.add("Claire");
        listaContatosVoce.add("Bob");
        listaContatosVoce.add("Alice");

        hashtable.put("Voce", listaContatosVoce);

        ArrayList<String> listaContatosClaire = new ArrayList<String>();

        listaContatosClaire.add("Thom");
        listaContatosClaire.add("Jonny");

        hashtable.put("Claire", listaContatosClaire);

        ArrayList<String> listaContatosAlice = new ArrayList<String>();

        listaContatosAlice.add("Peggy");

        hashtable.put("Alice", listaContatosAlice);

        ArrayList<String> listaContatosBob = new ArrayList<String>();

        listaContatosBob.add("Anuj");
        listaContatosBob.add("Peggy");

        hashtable.put("Bob", listaContatosBob);

        System.out.println("CHAVE | VALOR");

        for (Map.Entry<String, ArrayList<String>> entidade : hashtable.entrySet()){
            String chave = entidade.getKey();
            ArrayList<String> valor = entidade.getValue();

            System.out.println(chave + " | " + valor);
        }
    }
}