/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author dohaa
 */
public class Student
{
   private String name; // variable private
   private int sid; // principle "encapsulation"

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }
}