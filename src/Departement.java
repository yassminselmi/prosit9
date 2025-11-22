public class Departement implements Comparable<Departement> {
    int id;
    String nomDepartement;
    int nombreEmployes;
    public Departement(){};
    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public int getNombreEmployes() {
        return nombreEmployes;
    }
    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }
    @Override
    public boolean equals(Object o) {
        if (null==o) return false;
        if (o.getClass() == Departement.class) {
            return this.id == ((Departement) o).id && this.nomDepartement.equals(((Departement) o).nomDepartement);
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return ("Departement N°: " + this.getId()+", Nom: "+ this.nomDepartement+", nbr employes: "+this.nombreEmployes);
    }
    @Override
    public int compareTo(Departement departement){
        return Integer.compare(this.id, departement.id);
    }
}
