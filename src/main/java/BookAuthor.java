public class BookAuthor {
    private String firstName;
    private String middleName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAuthorName() {
        return firstName + " " + getMiddleNameInitial() + ". " + lastName;
    }

    private String getMiddleNameInitial() {
        return middleName.substring(0, 1);
    }


    // TODO: vastavalt Java tavadele, on üldjuhul meetodid järjestatud nii,
    //       et kõigepealt on kõik public meetodid
    //       ja siis tulevad private meetodid.
}
