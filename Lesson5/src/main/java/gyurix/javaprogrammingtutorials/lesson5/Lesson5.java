package gyurix.javaprogrammingtutorials.lesson5;

public class Lesson5 {
  public static void main(String[] args) {
    Book book = new Book();
    book.addChapter("Chapter 1", "Chapter 1 subtitle",
            "This is the\n" +
                    "First page of the\n" +
                    "First chapter",
            "This is the\n" +
                    "Second page\n" +
                    "Of the First chapter");
    book.addChapter("Chapter 2", "Chapter 2 subtitle",
            "This is the\n" +
                    "First page of the\n" +
                    "Second chapter",
            "This is the\n" +
                    "Second page\n" +
                    "Of the Second chapter");
    System.out.println(book);

    //Homework:
    // - Add 5 more chapters to the book
    // - Print all the pages of the book without chapters

    for (Book.BookPage page : book.getPages()) {
      // You know what to put here
    }
  }
}
