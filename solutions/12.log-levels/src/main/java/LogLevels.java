public class LogLevels {
  public static String message(String logLine) {
    String newLog = logLine.substring(logLine.indexOf(" ")+1);
    return newLog.trim();
  }

  public static String logLevel(String logLine) {
    String newLog = logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]")); 
    return newLog.trim().toLowerCase();
  }

  public static String reformat(String logLine) {
    return message(logLine) + " (" + logLevel(logLine) + ")";
  }
}
