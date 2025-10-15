public class ManagerRole extends Role {
    private String[] manages;

    public ManagerRole(String[] employeeNames) {
        super("Manager");
        manages = employeeNames;
    }

    public String getRoleData() {
        String output = "Manages: ";
        for (String employee : manages) {
            output += employee + ", ";
        }
        return output;
    }
}
