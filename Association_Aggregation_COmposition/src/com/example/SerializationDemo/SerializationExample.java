package com.example.SerializationDemo;

import java.io.*;

class Employee implements Serializable {
    private int id;
    private String name;

    // Constructor, Getters, Setters
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}



class SerializationExample {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Deepak");

        try {
            // Serialization
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


class DeserializationExample {
    public static void main(String[] args) {
        try {
            // Deserialization
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp = (Employee) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Deserialized Employee:");
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
