package CodeWars.BracesChecker;

public class BraceChecker {

    public boolean isValid(String braces) {
        String braces2 = braces;
        for (int i = 0; i < braces.length()/2; i++) {
            braces2 = braces2.replaceAll("\\(\\)", "");
            braces2 = braces2.replaceAll("\\[\\]", "");
            braces2 = braces2.replaceAll("\\{\\}", "");
        }
        return braces2.isEmpty();
    }

    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker();
        System.out.println(braceChecker.isValid("[[]]"));
    }
}