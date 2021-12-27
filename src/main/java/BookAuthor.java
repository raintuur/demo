public class BookAuthor {
    private String firstName;
    private String middleName;
    private String lastName;

    public BookAuthor() {
    }

    public BookAuthor(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public BookAuthor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
        return firstName + " " + getMiddleNameInitial() + lastName;
    }

    private String getMiddleNameInitial() {
        return middleName != null ? middleName.substring(0, 1) + ". " : "";
    }


    // TODO: vastavalt Java tavadele, on üldjuhul meetodid järjestatud nii,
    //       et kõigepealt on kõik public meetodid
    //       ja siis tulevad private meetodid.
}
