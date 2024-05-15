package sealedclass.data;

public non-sealed class Manager extends Employee{

    private String departement;

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
}
