import java.util.Comparator;

public class DepartementNameAndNbrEmployeComparator {
public static Comparator<Departement> byNameThenNbr() {
    return Comparator.comparing(Departement::getNomDepartement).thenComparing(Departement::getNombreEmployes);
}
}
