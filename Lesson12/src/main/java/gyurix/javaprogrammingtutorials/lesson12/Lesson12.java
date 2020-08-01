package gyurix.javaprogrammingtutorials.lesson12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Lesson12 {
  public static void loadResource() throws IOException {
    InputStream is = Lesson12.class.getClassLoader().getResourceAsStream("res.txt");
    if (is == null) {
      System.out.println("The resource was not found.");
      return;
    }
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    transload(is, os);
    System.out.println("Loaded resource:\n" + os);
  }

  public static void main(String[] args) throws IOException {
    //simpleTests();
    loadResource();
  }

  public static void simpleTests() throws IOException {
    System.out.println("Lesson 12 - Using streams");
    System.out.println("Create a new ByteArrayInputStream");
    ByteArrayInputStream bis = new ByteArrayInputStream("Hello".getBytes(StandardCharsets.UTF_8));
    int read;
    while ((read = bis.read()) != -1) {
      System.out.println("Read: " + read + " - " + ((char) read));
    }

    System.out.println("Convert an input stream to output stream (works with any InputStream)");
    bis = new ByteArrayInputStream("Hello".getBytes(StandardCharsets.UTF_8));
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    while ((read = bis.read()) != -1) {
      bos.write(read);
    }
    System.out.println(bos.toString());

    System.out.println("Convert an output stream to input stream (only works for ByteArrayOutputStream)");
    bis = new ByteArrayInputStream(bos.toByteArray());

    System.out.println("More efficient way to convert an input stream to output stream:");
    bos = new ByteArrayOutputStream();
    transload(bis, bos);
    System.out.println("Output: " + bos);
  }

  public static void transload(InputStream is, OutputStream os) throws IOException {
    byte[] buf = new byte[2048];
    int read;
    while ((read = is.read(buf)) > 0) {
      os.write(buf, 0, read);
    }
  }
}
