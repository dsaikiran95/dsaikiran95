import java.util.LinkedList;

class RemoveLinkedlist {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add elements in LinkedList
    languages.add("Telugu");
    languages.add("Hindi");
    languages.add("English");
    languages.add("French");
    System.out.println("LinkedList: " + languages);

    // remove elements from index 1
    String str = languages.remove(3);
    System.out.println("Removed Element: " + str);

    System.out.println("Updated LinkedList: " + languages);
  }
}