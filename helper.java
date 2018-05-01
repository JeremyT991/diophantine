import java.io.*;

public class helper {
  public String input(String prompt) {
    String inputLine = null;
    System.out.print(prompt + " ");
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      inputLine = in.readLine();
      if (inputLine.length() == 0) return null;
    } catch (IOException e) {
      System.out.println("IOException: " + e);
    }
    
    return inputLine;
  }
  
  public static int input() {
    String inputLine = null;
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      inputLine = in.readLine();
      if (inputLine.length() == 0) return -1;
    } catch (IOException e) {
      System.out.println("IOException: " + e);
    }

    return Integer.parseInt(inputLine);
  }

}
