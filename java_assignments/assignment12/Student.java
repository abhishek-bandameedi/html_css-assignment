package assignments.assignment12;

public class Student {
    int id,age,yearOfEnrollment;
    String name,gender,engDepartment;
    double perTillDate;

    Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment ,double perTillDate){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }

    int getId(){return this.id;}
    int getAge(){return this.age;}
    int getYearOfEnrollment(){return this.yearOfEnrollment;}
    String getName(){return this.name;}
    String getGender(){return this.gender;}
    String getEngDepartment(){return this.engDepartment;}
    double getPerTillDate(){return this.perTillDate;}

    String getStudentDetails(){
        return id+" "+name+" "+age+" "+gender+" "+engDepartment+" "+yearOfEnrollment+" "+perTillDate;
    }
}
