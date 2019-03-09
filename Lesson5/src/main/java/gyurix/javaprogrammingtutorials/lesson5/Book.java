package gyurix.javaprogrammingtutorials.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Book {
  private List<BookChapter> chapters;
  private List<BookPage> pages;

  public Book() {
    pages = new ArrayList<>();
    chapters = new ArrayList<>();
  }

  public void addChapter(String title, String subtitle, String... pageTexts) {
    BookChapter chapter = new BookChapter(title, subtitle);
    for (String p : pageTexts) {
      chapter.addPage(new BookPage(chapter, p));
    }
    chapters.add(chapter);
  }

  public List<BookPage> getPages() {
    return pages;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (BookChapter chapter : chapters)
      sb.append(chapter).append("\n\n");
    return sb.toString();
  }

  public class BookPage {
    private BookChapter chapter;
    private String text;

    public BookPage(BookChapter chapter, String text) {
      this.chapter = chapter;
      this.text = text;
    }

    @Override
    public String toString() {
      return text;
    }
  }

  public class BookChapter {
    private List<BookPage> pages = new ArrayList<>();
    private String subtitle;
    private String title;

    public BookChapter(String title, String subtitle) {
      this.title = title;
      this.subtitle = subtitle;
    }

    public void addPage(BookPage page) {
      this.pages.add(page);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("==").append(title).append("==\n")
              .append('(').append(subtitle).append(")\n\n");
      for (BookPage p : pages) {
        sb.append(p).append("\n\n");
      }
      return sb.toString();
    }
  }
}
