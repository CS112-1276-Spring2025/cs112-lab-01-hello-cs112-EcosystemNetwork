public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");

        System.out.println("Do I like baking?" + Main.isALike("baking"));
        System.out.println("Do I like Fishing?" + Main.isALike("Fishing"));
        Main.printAboutMe();
        Comic favorite = new Comic();
        favorite.setTitle("Superman 1111");
        favorite.setIssueNum(1);
        System.out.println("My favorite comic is: " + favorite.getTitle());
    }

    public static void printAboutMe() {
        System.out.println("I like food, baking, cooking, etc.");
    }

    public static boolean isALike(String topic) {
        String myLikes = "I like food, baking, cooking, etc.";
        return myLikes.contains(topic);
    }
}