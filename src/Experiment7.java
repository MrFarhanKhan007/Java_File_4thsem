class employee {
    private String name;
    private int employeeId;
    private String department;

    public employee(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Department: " + this.department);
    }
}

class Programmer extends employee {
    private String programmingLanguages;

    public Programmer(String name, int employeeId, String department, String programmingLanguages) {
        super(name, employeeId, department);
        this.programmingLanguages = programmingLanguages;
    }

    public void displayProgrammerInfo() {
        displayEmployeeInfo();
        System.out.println("Programming Languages: " + this.programmingLanguages);
    }
}

class Analyst extends employee {
    private String tools;

    public Analyst(String name, int employeeId, String department, String tools) {
        super(name, employeeId, department);
        this.tools = tools;
    }

    public void displayAnalystInfo() {
        displayEmployeeInfo();
        System.out.println("Tools: " + this.tools);
    }
}

class ProjectLeader extends employee {
    private String projectName;

    public ProjectLeader(String name, int employeeId, String department, String projectName) {
        super(name, employeeId, department);
        this.projectName = projectName;
    }

    public void displayProjectLeaderInfo() {
        displayEmployeeInfo();
        System.out.println("Project Name: " + this.projectName);
    }
}
class Experiment7{
    public static void main(String[] args) {
        employee farhan=new employee("Farhan",537,"ASET");
        farhan.displayEmployeeInfo();
        Programmer lucien= new Programmer("Lucien",538,"ASET","Java");
        lucien.displayProgrammerInfo();
        ProjectLeader XElucien= new ProjectLeader("XElucien",539,"ASET","Tasks-App");
        XElucien.displayProjectLeaderInfo();
        Analyst Johny= new Analyst("Johny",540,"ASET","Hammer");
        Johny.displayAnalystInfo();
    }
}
