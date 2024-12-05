package com.FHD.OOP;
import java.util.*;
class ProjectBMI {
    private String firstName,lastName,genDer,dateOfBirth;
    private float height,weight;

    //Constructor
    public ProjectBMI(String firstName,String lastName,String genDer,String dateOfBirth,float height,float weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.genDer = genDer;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }
    //Get & Set methods

    void setfirstName(String firstName){
        this.firstName = firstName;
    }

    String getfirstName(){
        return firstName;
    }
    void setlastName(String lastName){
        this.lastName = lastName;
    }

    String getlastName(){
        return lastName;
    }
    void setgenDer(String genDer){
        this.genDer = genDer;
    }

    String getgenDer(){
        return genDer;
    }
    void setdateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    String getdateOfBirth(){
        return dateOfBirth;
    }
    void setheight(float height){
        this.height = height;
    }

    float getheight(){
        return height;
    }
    void setweight(float weight){
        this.weight = weight;
    }

    float getweight(){
        return weight;
    }
    float Calc(float height,float weight){
        float BMI = (weight*703)/(float)Math.pow(height,2);
        return BMI;
    }

    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);
        int n;
        System.out.println("Enter How Much Data you want to include: ");
        n = inp.nextInt();
        inp.nextLine();
        ProjectBMI obj[] = new ProjectBMI[n];
        //input
        for(int i=0; i<obj.length; i++){
            obj[i] = new ProjectBMI(null, null, null, null, 0f, 0f);
            System.out.print("Enter First Name: ");
            obj[i].setfirstName(inp.nextLine());
            System.out.print("Enter Last Name: ");
            obj[i].setlastName(inp.nextLine());
            System.out.print("Enter Gender: ");
            obj[i].setgenDer(inp.nextLine());
            System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
            obj[i].setdateOfBirth(inp.nextLine());
            System.out.print("Enter Height: ");
            obj[i].setheight(inp.nextFloat());
            System.out.print("Enter Weight: ");
            obj[i].setweight(inp.nextFloat());
            inp.nextLine();
        }
        
        //output
        for(int i=0; i<obj.length; i++){
            System.out.println("\nFirst Name: "+"\t"+obj[i].getfirstName()+
                               "\nLast Name: "+"\t"+obj[i].getlastName()+
                               "\nGender: "+"\t"+obj[i].getgenDer()+
                               "\nDate Of Birth: "+"\t"+obj[i].getdateOfBirth()+
                               "\nHeight: "+"\t"+obj[i].getheight()+
                               "\nWeight: "+"\t"+obj[i].getweight()+
                               "\nBMI: "+"\t"+obj[i].Calc(obj[i].getheight(), obj[i].getweight()));
        }
        inp.close();
    }
}
