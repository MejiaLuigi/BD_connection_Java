package mylibrary;

public class Customer_model {

    //Atributos
    private int identifyDoc;
    private String docType;
    private String name;
    private String lastName;
    private String email;
    private String groupClass;

    //Constructor Vacío
    public Customer_model() {

    }

    //Constructor con Parametros
    public Customer_model(int identifyDoc, String docType, String name, String lastName, String email, String groupClass) {
        this.identifyDoc = identifyDoc;
        this.docType = docType;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.groupClass = groupClass;
    }

    //Getters and Setters
    public int getIdentifyDoc() {
        return identifyDoc;
    }

    public void setIdentifyDoc(int identifyDoc) {
        this.identifyDoc = identifyDoc;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroupClass() {
        return groupClass;
    }

    public void setGroupClass(String groupClass) {
        this.groupClass = groupClass;
    }
}
