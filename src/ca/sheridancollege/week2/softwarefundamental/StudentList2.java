/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamental;

/**
 *
 * @author hi
 */
public class StudentList2 {
    public static void main(String[] args) {
        Student2[] sList=new Student2[5];
        for(int i=0; i<=sList.length-1;i++){
        sList[i]=new Student2();
        sList[i].setName("Student "+(i+1));
        }
        for(Student2 s:sList){
        System.out.println("The Student name is"+s.getName());
        }
        
    }
}
