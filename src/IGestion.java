public interface IGestion <T>{
    void ajouterEmploye(T employee);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(T t);
    void supprimerEmploye(T t);
    void trierEmployeParId(); //comparable
    void trierEmployeParNomDepartementEtGrade(); //comparator
}
