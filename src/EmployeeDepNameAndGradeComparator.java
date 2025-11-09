import java.util.Comparator;

public class EmployeeDepNameAndGradeComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe e1, Employe e2) {
        int depCompare = e1.getNomDepart().compareTo(e2.getNomDepart());
        if (depCompare != 0) {
            return depCompare;
        }
        return Integer.compare(e1.getGrade(), e2.getGrade());
    }
}
