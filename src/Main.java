//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int moltiplica(int numero1, int numero2) {
        int risultato = numero1 * numero2;
        return risultato;
    }

    public static String concatena(String testo, int numero) {
        String risultato = testo + numero;
        return risultato;
    }

    public static String[] inserisciInArray(String[] array, String nuovaStringa) {
        if (array.length != 5) {
            System.out.println("L'array deve avere esattamente cinque elementi.");
            return null;
        } else {
            String[] newArray = new String[6];

            int i;
            for(i = 0; i < 3; ++i) {
                newArray[i] = array[i];
            }

            newArray[3] = nuovaStringa;

            for(i = 4; i < 6; ++i) {
                newArray[i] = array[i - 1];
            }

            return newArray;
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}