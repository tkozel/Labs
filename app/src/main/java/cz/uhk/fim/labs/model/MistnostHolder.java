package cz.uhk.fim.labs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Drzi aktualni nactena data o mistnostech
 */

public class MistnostHolder {
    public static List<MistnostInfo> mistnosti = new ArrayList<>();

    public static MistnostInfo getMisnostByCislo(String cislo) {
        for (MistnostInfo mi:mistnosti) {
            if (mi.cisloMistnosti.equals(cislo)) {
                return mi;
            }
        }
        return null;
    }
}
