package small_projects.ArrayOfObjects;

public class Subject {

    private String subjectID;
    private String subjectName;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subjectID, String subjectName){
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }

    public Subject(String subjectID, String subjectName, int maxMarks){
        this(subjectID,subjectName);
        this.maxMarks = maxMarks;
    }

    public void setMaxMarks(int maxMark){
        this.maxMarks = maxMark;
    }

    public void setMarksObtained(int marksObtained){
        this.marksObtained = marksObtained;
    }

    public String getSubjectId(){
        return this.subjectID;
    }
    public String getSubjectName(){
        return this.subjectName;
    }
    public int getMaxMarks(){
        return this.maxMarks;
    }
    public int getMarksObtained(){
        return this.marksObtained;
    }

    boolean isQualified(int m){
        return m >= maxMarks/10*40;     // if the marks is greater than or equal to 40%
    }

    public String toString(){
        return "\nSubject ID: "+subjectID+"\nSubName: "+ subjectName+"\nMarks Obtained: "+ marksObtained;
    }

}

class SchoolObject{
    public static void main(String[] args) {
        Subject subject[] = new Subject[3];                                                 // creating array of objects
        subject[0] = new Subject("101","DS",100);            // assigning those objects with value .
        subject[1] = new Subject("201","Algorithm",100);
        subject[2] = new Subject("301","Operating System",100);

        for (Subject s : subject){
            System.out.println(s);              // here system.out.println is calling toString method automatically. Best to have toString that's why.!
        }

    }
}