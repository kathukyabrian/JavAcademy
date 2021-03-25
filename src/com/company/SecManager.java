package com.company;

public class SecManager {
    public static void main(String[] args) {
        // A security manager is an instance of SecurityManager
        // To create one use, System.getSecurityManager()
        // returns a null if there is no SecurityManager
        SecurityManager securityManager = System.getSecurityManager();
        securityManager.checkExit(1);
    }
}
