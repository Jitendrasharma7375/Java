

public class WriteData 
{
  public static void main(String[] args) throws Exception 
  {
    java.io.File file = new java.io.File("vitbpl.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    // Create a file
    java.io.PrintWriter output = new java.io.PrintWriter(file);

    // Write formatted output to the file
    output.print("Nimit Kumar Singh ");
    output.println(18);
    output.print("Sumit Kumar Singh ");
    output.println(18);

    // Close the file
    output.close();
  }
}
