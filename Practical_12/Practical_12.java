public class Practical_12 {
    String fullName;
    String academicYear;
    String regID;
    String department;
    String admissionType;

    static int regCounter = 1;
    static int dsyCounter = 501;

    Student(String academicYear, String department, String admissionType, String fullName) {
        this.fullName = fullName;
        this.academicYear = academicYear;
        this.department = department;
        this.admissionType = admissionType;
        this.createRegID(academicYear, department);
    }

    private String getDeptCode(String deptName) {
        if (deptName.equalsIgnoreCase("Information Technology") || deptName.equalsIgnoreCase("IT")) {
            return "BIT";
        } else if (deptName.equalsIgnoreCase("Computer Science") || deptName.equalsIgnoreCase("CS")) {
            return "BCS";
        } else if (deptName.equalsIgnoreCase("Electrical") || deptName.equalsIgnoreCase("EL")) {
            return "BEL";
        } else {
            return "BUK";
        }
    }

    private void createRegID(String year, String dept) {
        String code = getDeptCode(dept);

        if (admissionType.equalsIgnoreCase("regular")) {
            this.regID = year + code + regCounter;
            Student.regCounter++;
        } else if (admissionType.equalsIgnoreCase("DSY")) {
            this.regID = year + code + dsyCounter;
            Student.dsyCounter++;
        }
    }

    public void showInfo() {
        System.out.println("Student Name: " + this.fullName);
        System.out.println("Department: " + this.department);
        System.out.println("Admission Type: " + this.admissionType);
        System.out.println("Registration No: " + this.regID);
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java Student <Name> <Year> <Department> <Type>");
            return;
        }

        String nameInput = args[0];
        String yearInput = args[1];
        String deptInput = args[2];
        String typeInput = args[3];

        Student s1 = new Student(yearInput, deptInput, typeInput, nameInput);
        s1.showInfo();
    }
}
