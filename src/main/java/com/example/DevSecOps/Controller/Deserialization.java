package com.example.DevSecOps.Controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public Data deserializeData(byte[] serializedData) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedData))) {
            return (Data) ois.readObject();  // Vulnerable to Insecure Deserialization
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
