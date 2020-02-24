package jtm.activity12;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherManager {

    public static void main(String[] args) {

        System.out.println(new TeacherManager().findTeacher(1));
        System.out.println(new TeacherManager().findTeacher("Steven", "Doe"));
        System.out.println(new TeacherManager().insertTeacher("Santa", "Ozolina"));
        System.out.println(new TeacherManager().findTeacher("Santa", "Doe"));
    }

    protected Connection conn;

    public TeacherManager() {
        /* TODO
		  When new TeacherManager is created, create connection to the database server:

         	Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db?autoReconnect=true&useSSL=false&characterEncoding=utf8", "admin", "abcd1234"
            );

            conn.setAutoCommit(false); //Use conn.commit() after each Insert/Update/Delete call
         */


        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db?autoReconnect=true&useSSL=false&characterEncoding=utf8", "admin", "abcd1234"
            );
            conn.setAutoCommit(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * Returns a Teacher instance represented by the specified ID.
     */
    public Teacher findTeacher(int id) {
        /*
         TODO
         Execute an SQL statement that searches teacher by ID.
         If teacher is found return Teacher object with values from DB
         If teacher is not found return null */
        try {
            PreparedStatement stmt = conn.prepareStatement
                    ("select * from Teacher WHERE id=?");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.first()) {
                Integer idd = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                return new Teacher(idd, firstName, lastName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Returns a list of Teacher objects.
     */
    public List<Teacher> findTeacher(String firstName, String lastName) {
        /* TODO
           Write an sql statement that searches teacher by first and last name and returns results as ArrayList<Teacher>.
           Result list should include all partial results as well, e.g. if first name is matching but last name is not
           still include, the teacher in result list, same applies for lastName
           If nothing is found return empty list! */
        try {
            List<Teacher> resultList = new ArrayList<Teacher>();


            PreparedStatement stmt = conn.prepareStatement
                    ("select * from Teacher WHERE firstName=? OR lastName=?");
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Integer idd = rs.getInt(1);
                String name = rs.getString(2);
                String lName = rs.getString(3);
                resultList.add(new Teacher(idd, name, lName));
            }
            return resultList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Teacher> empty = new ArrayList<Teacher>();
        return empty;
    }


    /**
     * Insert an new teacher (first name and last name) into the table.
     */
    public boolean insertTeacher(String firstName, String lastName) {
        /* TODO
           Execute an SQL statement that inserts teacher in database.
           SQL statement should contain only firstName and lastName, ID should be automatically generated by DB */

        /*INSERT INTO Teacher (firstName, lastName)
        VALUES ("John", "Doe");*/
        try {
            PreparedStatement ptmt = conn.prepareStatement
                    ("INSERT INTO Teacher (firstName, lastName) VALUES (?,?)");
            ptmt.setString(1, firstName);
            ptmt.setString(2, lastName);

            int updatedWithPrepared = ptmt.executeUpdate();
            conn.commit();
            System.out.println("Inserted " + updatedWithPrepared + " lines");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Insert teacher object into database
     */
    public boolean insertTeacher(Teacher teacher) {
        /*
        TODO
        Execute an SQL statement that inserts teacher in database.
        SQL statement should contain all fields: id, firstName and lastName
        If teacher is inserted successfully return true, otherwise false */

        try {
            PreparedStatement ptmt = conn.prepareStatement
                    ("INSERT INTO Teacher (id, firstName, lastName) VALUES (?,?,?)");
            ptmt.setInt(1, teacher.getId());
            ptmt.setString(2, teacher.getFirstName());
            ptmt.setString(3, teacher.getLastName());

            int updatedWithPrepared = ptmt.executeUpdate();
            conn.commit();
            System.out.println("Inserted " + updatedWithPrepared + " lines");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    /**
     * Updates an existing Teacher in the repository with the values represented by the Teacher object.
     */
    public boolean updateTeacher(Teacher teacher) {
        /*
            TODO
            Execute an SQL statement that updates teacher information.
            Update teacher in database by it's ID
            If ONE teacher is successfully updated, return true, otherwise false */

        try {
            PreparedStatement stmt = conn.prepareStatement
                    ("UPDATE Teacher SET firstName = ?, lastName = ? WHERE id=?");

            stmt.setString(1, teacher.getFirstName());
            stmt.setString(2, teacher.getLastName());
            stmt.setInt(3, teacher.getId());

            int res = stmt.executeUpdate();
            conn.commit();
            if(res == 1 ){
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean deleteTeacher(int id) {
        /*
            TODO
            Execute an SQL statement that deletes teacher from database.
            Delete teacher by it's ID
            If one teacher is successfully deleted, return true
            If no teacher is deleted return false */

        try {
            PreparedStatement stmt = conn.prepareStatement
                    ("DELETE from Teacher WHERE id=?");
            stmt.setInt(1, id);

            int res = stmt.executeUpdate();
            conn.commit();
            if(res == 1 ){
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void closeConnection() {
        /*
            TODO
            Close connection to the database server and reset conn object to null */
       try {

           conn.close();
           conn = null;
       }
       catch (Exception e) {
           e.printStackTrace();
       }

    }
}