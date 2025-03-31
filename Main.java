/*
@Eric Nans
@Version 1.0
Lab 01 - Hello CS112
Small program to learn about the basic foundatin of Java. 
*/

public class Main {
    public static void main(String[] args) {
        // Part 1: Simple output
        System.out.println("Welcome to CS 112!");

        // Part 2: Static methods in action
        System.out.println("Do I like baking? " + Main.isALike("baking"));
        System.out.println("Do I like fishing? " + Main.isALike("fishing"));
        Main.printAboutMe();

        // Part 3: Object-Oriented Programming with the Comic class
        Comic favorite = new Comic("Stan Lee", "Steve Ditko", "John Higgins", "Spider-Man", 1);
        favorite.setTitle("Superman #1111");  // using setter
        favorite.setIssueNum(1111);          // using setter

        System.out.println("My favorite comic is: " + favorite.getTitle());
        System.out.println(favorite.toString());

        Comic anotherComic = new Comic("Stan Lee", "Steve Ditko", "John Higgins", "Superman #1111", 1111);
        System.out.println("Are the comics equal? " + favorite.equals(anotherComic));
    }

    // Void static method
    public static void printAboutMe() {
        System.out.println("I like food, baking, cooking, etc.");
    }

    // Static method with a parameter and a return value
    public static boolean isALike(String topic) {
        String myLikes = "I like food, baking, cooking, etc.";
        return myLikes.toLowerCase().contains(topic.toLowerCase());
    }
}
