public class RegularRole extends Role {
    private String[] projects;

    public RegularRole(String[] projectNames) {
        super("Regular");
        projects = projectNames;
    }

    public String getRoleData() {
        String output = "Projects: ";
        for (String employee : projects) {
            output += employee + ", ";
        }
        return output;
    }
}
