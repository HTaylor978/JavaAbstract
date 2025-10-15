public class Employee {
    private String name;
    private int age;
    private Role role;

    public Employee(String name, int age, Role role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // Getters
    public String getName() {return name;}
    public int getAge() {return age;}
    public Role getRole() {return role;}
    public String getJobInfo() {return role.getRoleData();}

    // Setters
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setRole(Role role) {this.role = role;}
}
