package tests;

import java.util.regex.Pattern;

public class RegularExpressionTime {

    public static void main(String[] args) {

        System.out.println("01 "+Pattern.matches(".*Dhava.*","hello Dhaval"));
        System.out.println("02 "+Pattern.matches(".*o D.*","hello Dhaval"));
        System.out.println("03 "+Pattern.matches(".*oD.*","hello Dhaval"));
        System.out.println("04 "+Pattern.matches("lo","hello Dhaval"));
        System.out.println("05 "+Pattern.matches("lop","lop"));
        System.out.println("06 "+Pattern.matches("lop","Lop"));
        System.out.println("07 "+Pattern.matches("[Ll]op","lop"));
        System.out.println("08 "+Pattern.matches("[Ll]op","op"));
        System.out.println("09 "+Pattern.matches("lo[Pp]","lop"));
        System.out.println("10 "+Pattern.matches("lo[zZ]er","loZer"));
        System.out.println();

        System.out.println("11 "+Pattern.matches("lo[zZtTaA]er","loTer"));
        System.out.println("12 "+Pattern.matches("lo[zZtTaA]er","loaer"));
        System.out.println("13 "+Pattern.matches("lo[zZtTaA]er","loaer"));
        System.out.println("14 "+Pattern.matches(".ava","java"));
        System.out.println("15 "+Pattern.matches(".av.","java"));
        System.out.println("16 "+Pattern.matches(".av.","Ajava"));
        System.out.println("17 "+Pattern.matches(".*av.","Ajava"));
        System.out.println("18 "+Pattern.matches("[0-9]am","7am"));
        System.out.println("19 "+Pattern.matches("[a-z]java","Ajava"));
        System.out.println("20 "+Pattern.matches("[A-Z]jav.","Ajava"));
        System.out.println();

        System.out.println("21 "+Pattern.matches("[a-z]..","abc"));
        System.out.println("22 "+Pattern.matches("[a-z]...","abcd"));
        System.out.println("23 "+Pattern.matches("[a-z].","abc"));
        System.out.println("24 "+Pattern.matches("[a-zA-Z0-9].","A#"));
        System.out.println("25 "+Pattern.matches("[^0-9]et","set"));
        System.out.println("26 "+Pattern.matches("s[a-e]t","set"));
        System.out.println("27 "+Pattern.matches("s[^aeiou]9","se9"));
        System.out.println("28 "+Pattern.matches("s[^aiou][0-9]","se9"));
        System.out.println("29 "+Pattern.matches("s\\d","s9"));
        System.out.println("30 "+Pattern.matches("s\\d","sb"));
        System.out.println();

        System.out.println("31 "+Pattern.matches("s\\D","s9"));
        System.out.println("32 "+Pattern.matches("s\\D","sd"));
        System.out.println("33 "+Pattern.matches("s\\D","sD"));
        System.out.println("34 "+Pattern.matches("s\\w","s9"));
        System.out.println("35 "+Pattern.matches("s\\w","sa"));
        System.out.println("36 "+Pattern.matches("s\\w","sA"));
        System.out.println("37 "+Pattern.matches("s\\W","sA"));
        System.out.println("38 "+Pattern.matches("s\\W","sA"));
        System.out.println("39 "+Pattern.matches("s\\W","sA"));
        System.out.println("40 "+Pattern.matches("s\\W","s#"));
        System.out.println();

        System.out.println("31 "+Pattern.matches("s\\D","s9"));
        System.out.println("32 "+Pattern.matches("s\\D","sd"));
        System.out.println("33 "+Pattern.matches("s\\D","sD"));
        System.out.println("34 "+Pattern.matches("s\\w","s9"));
        System.out.println("35 "+Pattern.matches("s\\w","sa"));
        System.out.println("36 "+Pattern.matches("s\\w","sA"));
        System.out.println("37 "+Pattern.matches("s\\W","sA"));
        System.out.println("38 "+Pattern.matches("s\\W","sA"));
        System.out.println("39 "+Pattern.matches("s\\W","sA"));
        System.out.println("40 "+Pattern.matches("s\\W","s#"));
        System.out.println();

        System.out.println("41 "+Pattern.matches("^My","My apps"));
        System.out.println("42 "+Pattern.matches("^My","My"));
        System.out.println("43 "+Pattern.matches("^My.*","My apps"));
        System.out.println("44 "+Pattern.matches("^My","My a"));
        System.out.println("45 "+Pattern.matches("pps$","My apps"));
        System.out.println("46 "+Pattern.matches(".*pps$","My apps"));
        System.out.println("47 "+Pattern.matches("M.*ps$","My apps"));
        System.out.println("48 "+Pattern.matches("M.*ps.*","My apps"));
        System.out.println("49 "+Pattern.matches("M.*ps$","My apps"));
        System.out.println("50 "+Pattern.matches("^M.*ps.*","My apps"));
        System.out.println();

        System.out.println("51 "+Pattern.matches("^My.{2}pps","My apps"));
        System.out.println("52 "+Pattern.matches("Java|java","java"));
        System.out.println("53 "+Pattern.matches("[a-d[m-p]]","c"));
        System.out.println("54 "+Pattern.matches("[a-d[m-p]]","e"));
        System.out.println("55 "+Pattern.matches("[a-d[m-p]]","n"));
        System.out.println("56 "+Pattern.matches("[a-z&&[def]]","t"));
        System.out.println("57 "+Pattern.matches("[a-z&&[def]]","e"));
        System.out.println("58 "+Pattern.matches("[a-z&&[^bc]]","b"));
        System.out.println("59 "+Pattern.matches("[a-z&&[^bc]]","d"));
        System.out.println("60 "+Pattern.matches("[a-z&&[^m-p]]","m"));
        System.out.println();

        System.out.println("61 "+Pattern.matches("b{2}at","bbat"));
        System.out.println("62 "+Pattern.matches("b.*at","bbat"));
        System.out.println("63 "+Pattern.matches("b.+at","bbat"));





    }

}
