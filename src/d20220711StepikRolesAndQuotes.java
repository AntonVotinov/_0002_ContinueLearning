public class d20220711StepikRolesAndQuotes {
    public static void main(String[] args) {
        String[] roles = {
                "A", "AA", "AAA"
        };
        String[] textLines = {
                "AAA: 1A", "AA: 2AA", "A: 3AAA"
        };

        /*        StringBuilder finalString = new StringBuilder();*/
        StringBuilder printTextPerRole = new StringBuilder();

        for (int j = 0; j < roles.length; j++) {
            printTextPerRole.append(roles[j] + ":" + "\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(roles[j].concat(":"))) {
                    int tempNumber = i + 1;
                    String tempText = tempNumber + ") " + textLines[i].replaceFirst(roles[j] + ": ", "") + "\n";
                    printTextPerRole.append(tempText);
                }
            }
            printTextPerRole.append("\n");
        }

/*        for (int i = 0; i < textLines.length; i++) {
if (textLines[i].startsWith(StringGor1)) {
int tempNumber = i+1;
String tempText = tempNumber+") "+textLines[i].replaceAll(StringGor1,"")+"\n";
finalString.append(tempText);
}
}
System.out.println(finalString);*/
        System.out.println(printTextPerRole);
        String finalFullStringConvertedFromStringBuilder = printTextPerRole.toString();
        System.out.println("-------________-------");
        System.out.println(finalFullStringConvertedFromStringBuilder);
    }
}