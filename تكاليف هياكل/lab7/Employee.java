public class Employee {
    private int id;
    private String name;
    private String jobTitle;
    private Employee manager;

    public Employee(int id, String name, String jobTitle, Employee manager) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.manager = manager;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", manager=" + manager +
                '}';
    }
}
