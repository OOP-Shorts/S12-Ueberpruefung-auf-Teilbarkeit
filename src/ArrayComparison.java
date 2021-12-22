public class ArrayComparison {

    /*
        Prüfe für jeden in values gespeicherten Wert, ob dieser durch 2 oder 3 teilbar ist.
        Ist der Wert durch 2 teilbar, soll "OOP" an den Rückgabewert angehängt werden.
        Ist der Wert durch 3 teilbar, soll "Programmieren" an den Rückgabewert angehängt werden.
        Ist der Wert weder durch 2 noch durch 3 teilbar, soll "MEDIENINFORMATIK" an die Rückgabe angehängt werden.
        Ist der Wert bereits durch 2 teilbar, soll keine weitere Prüfung mehr durchgeführt werden.
    */
    public static String intArrayComparisons(int[] values) {
        return "";
    }

    public static void main(String[] args) {
        int[] testValues = {4, 6, 11, 9, 10, 1};
        String testString = intArrayComparisons(testValues);

        if(testString.equals("OOPOOPMEDIENINFORMATIKProgrammierenOOPMEDIENINFORMATIK")) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your method does not return the correct String.");
        }
    }
}
