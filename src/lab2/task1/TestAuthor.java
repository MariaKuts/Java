package lab2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Alexandr", "alexandr@gmail.com", 'm');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());

        author.setEmail("alexandr@gmail.ru");
        System.out.println(author.toString());
    }
}
