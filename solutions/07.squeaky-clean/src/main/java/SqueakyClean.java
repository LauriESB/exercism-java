import java.util.regex.Pattern;
import java.util.regex.Matcher;

class SqueakyClean {
  static String clean(String identifier) {
    String string01 = identifier.replaceAll("\\s","_");
   
    String regex = "-(\\w)";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(string01);
    StringBuilder builder = new StringBuilder();

    while (matcher.find()) {
      matcher.appendReplacement(builder, matcher.group(1).toUpperCase());
    }
    matcher.appendTail(builder);

    String string02 = builder.toString();

    String finalString = string02.replaceAll("0", "o").replaceAll("1", "l")
                                 .replaceAll("3", "e").replaceAll("4", "a")
                                 .replaceAll("7", "t").replaceAll("[^a-zA-Z_]", "");
    return finalString;
  }
}
