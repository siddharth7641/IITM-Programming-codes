/*
Write a Java program that allows the user to create projects, add team members to each
project, and ensure that every project has at least one team member. If the project doesn’t
have any member then add default team member. The program takes project name, number
of team members followed by team members names of some projects as input and finally
prints the project list with their team members. Complete the program as specified below.

Method hasTeamMembers that returns true if the project has team members, and
NoTeamMemberException otherwise
• Class ProjectManager has the following members:
– Method updateProjectList that takes a Project list as a parameter and checks
if each project has at least one team member. If not, it catches the NoTeamMemberException,
adds a default team member to the project
– Method displayProjectList that takes a Project list as a parameter and prints
the updated project list

Method main takes input to create Project list and invokes the updateProjectList
method to ensure that each project has at least one team member and also invokes
the displayProjectList method to print the updated project list.

What you have to do
• Define class NoTeamMemberException
• Define method updateProjectList in class ProjectManager
*/
import java.util.*;
// define class NoTeamMemberException
class NoTeamMemberException extends Exception{
    public NoTeamMemberException(){
        super();
    }
}

class Project {
    private String projectName;
    private List<String> teamMembers;
    public Project(String pN) {
        projectName = pN;
        this.teamMembers = new ArrayList<>();
    }
    public void addTeamMember(String memberName) {
        teamMembers.add(memberName);
    }
    public String toString() {
        return "Project: " + projectName + ", Team Members: " + teamMembers;
    }
    public boolean hasTeamMembers() throws NoTeamMemberException {
        if (teamMembers.size() > 0) {
            return true;
        } else {
            throw new NoTeamMemberException();
        }
    }
}
public class prac6 {
    // define method updateProjectList
    public static void updateProjectList(List<Project> projectList) {
        for (Project project : projectList) {
            try {
                project.hasTeamMembers();
            } catch (NoTeamMemberException e) {        
                project.addTeamMember("Default Member");
            }
        }
    }
    public static void displayProjectList(List<Project> projectList) {
        System.out.println("Updated Project List:");
        for (Project project : projectList) {
        System.out.println(project);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Project> projectList = new ArrayList<Project>();
        for (int i = 0; i < 3; i++) {
            String projectName = sc.next();
            Project project = new Project(projectName);
            projectList.add(project);
            int numTeamMembers = sc.nextInt();
            for (int j = 0; j < numTeamMembers; j++) {
                String memberName = sc.next();
                project.addTeamMember(memberName);
            }
        }
        try {
            for (Project project : projectList){
                project.hasTeamMembers();
            }
        } catch (NoTeamMemberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        updateProjectList(projectList);
        displayProjectList(projectList);
        sc.close();
    }
}