package com.certification.java17._3_text_blocks;

public class TextBlocksTest {

    public static final String TEXT = """
            \"""abc\""" I don't "belivier" rgrg 'rnruvr' "Nikolas" is not
            
            <html>
            <body>
                <h1>
                    HI, I'm Nikolas, GGGGGGGGGGGG
                </h1>
            </body>
            </html>
            """;

    public static void main(String[] args) {
        var a = """
                a""";

        System.out.println(TEXT);
    }
}
