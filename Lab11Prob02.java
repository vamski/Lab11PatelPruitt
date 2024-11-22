/**
 * File: PAssign0.java
 * Class: CSCI 1302
 * Author: Shivam Patel and Jacob Pruitt
 * Created on: Jun 6, 2016
 * Last Modified: Aug 16, 2018
 * Description: Display three messages to the console
 */

import java.io.*;
public class Lab11Prob02 {
    public static void main(String[] args) {
        int age;
        String firstLast;
        String address;
        int zipCode;
        double salary;
        Person person;

        try(
                DataInputStream input = new DataInputStream(new FileInputStream("src/people.dat"));
                DataOutputStream output = new DataOutputStream(new FileOutputStream("src/people-copy.dat"))
        ) {
            while (true) {
                age = input.readInt();
                firstLast = input.readUTF();
                address = input.readUTF();
                zipCode = input.readInt();
                salary = input.readDouble();
                person = new Person(age, firstLast, address, zipCode, salary);


                System.out.printf(person.toString());

                output.writeInt(age);
                output.writeUTF(firstLast);
                output.writeUTF(address);
                output.writeInt(zipCode);
                output.writeDouble(salary);
            }

        } catch (EOFException ex) {
            System.out.printf("");
        }catch (IOException ex) {
            System.out.println("file not found");
        }
    }
}