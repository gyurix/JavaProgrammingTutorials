package gyurix.javaprogrammingtutorials.lesson13;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lesson13 {
  private static void addFiles(File dir, List<File> files) {
    if (dir.isFile()) {
      files.add(dir);
      return;
    }
    for (File f : dir.listFiles()) {
      addFiles(f, files);
    }
  }

  private static void addFilesAndFolders(File dir, List<File> files) {
    if (dir.isFile()) {
      files.add(dir);
      return;
    }
    for (File f : dir.listFiles()) {
      addFilesAndFolders(f, files);
    }
    files.add(dir);
  }

  public static File getCurrentDir() {
    return new File(".").getAbsoluteFile().getParentFile();
  }

  public static void main(String[] args) {
    System.out.println("Get the name of the current directory:");
    System.out.println(getCurrentDir() + "\n");

    System.out.println("List of files in the current directory:");
    for (File f : getCurrentDir().listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        return pathname.isFile();
      }
    })) {
      System.out.println(f);
    }

    System.out.println("\nList of directories/folders in the current directory:");
    for (File f : getCurrentDir().listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        return pathname.isDirectory();
      }
    })) {
      System.out.println(f);
    }

    System.out.println("\nCheck the modification date of a folder:");
    long modified = new File("Lesson1").lastModified();
    System.out.println("Modified - RAW: " + modified);
    System.out.println("Modified - Date: " + new Date(modified));

    System.out.println("\nList all the files in the current folder recursively:");
    List<File> files = new ArrayList<>();
    addFiles(getCurrentDir(), files);
    for (File f : files) {
      System.out.println(f);
    }

    System.out.println("\nCreate a file:");
    File toCreate = new File("Lesson13" + File.separator + "createdFile.txt");
    try (FileOutputStream fos = new FileOutputStream(toCreate, true)) {
      fos.write("This is our new file - LINE 1\n".getBytes());
      fos.write("This is our new file - LINE 2\n".getBytes());
      //fos.close(); - It gets auto closed if we put it to the ()s of the for loop
    } catch (Exception e) {
      e.printStackTrace();
    }

    /*System.out.println("\nDelete a file:");
    toCreate.delete();*/

    System.out.println("Rename a file:");
    boolean result = toCreate.renameTo(new File(toCreate.getParentFile() + File.separator + "newFileName.txt"));
    System.out.println(result ? "Rename successful" : "Rename failed");

    System.out.println("Create a folder/directory");
    File dirToCreate = new File("Lesson13/This/Is/My/Directory");
    dirToCreate.mkdirs();

    System.out.println("Another way to write to files");
    try (PrintWriter writer1 = new PrintWriter(
            new FileOutputStream(dirToCreate + File.separator + "file1.txt"));
         PrintWriter writer2 = new PrintWriter(
                 new FileOutputStream(dirToCreate + File.separator + "file2.txt"))
    ) {
      writer1.println("This is the first file");
      writer2.println("This is the second file");
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Delete a directory");
    files = new ArrayList<>();
    addFilesAndFolders(new File("Lesson13/This"), files);
    for (File f : files) {
      System.out.println("Deleting " + f + ": " + (f.delete() ? "succeed" : "failed"));
    }
  }
}
