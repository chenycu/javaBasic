public class PrintUtils {

    /**
     * 纸的宽度（占用字节）
     **/
    public final static int WIDTH_ALL = 48;
    public final static int WIDTH_1 = 19;
    public final static int WIDTH_2 = 8;
    public final static int WIDTH_3 = 8;
    public final static int WIDTH_4 = 10;

    public final static int WIDTH_TWO_1 = 18;
    public final static int WIDTH_TWO_2 = 4;
    public final static int WIDTH_TWO_3 = 7;
    public final static int WIDTH_TWO_4 = 7;
    public final static int WIDTH_TWO_5 = 8;

    public static String getTwoColumnSide(String leftStr, String rightStr){
        StringBuilder sb = new StringBuilder();
        sb.append(leftStr);
        int sc = WIDTH_ALL - length(leftStr) - length(rightStr);
        for(int i = 0; i < sc-1; i++) {
            sb.append(" ");
        }
        sb.append(rightStr);
        return sb.toString();
    }

    public static String getTwoColumn(String leftStr, String rightStr){
        StringBuilder sb = new StringBuilder();
        sb.append(leftStr);
        int leftSurplus = WIDTH_ALL / 2 - length(sb.toString());
        for (int i = 0; i < leftSurplus; i++) {
            sb.append(" ");
        }
        sb.append(rightStr);
        return sb.toString();
    }


    public static String getSignatureLine() {
        StringBuilder sb = new StringBuilder();
        sb.append("  经手人:");
        int leftSurplus = WIDTH_ALL / 2 - length(sb.toString());
        for (int i = 0; i < leftSurplus; i++) {
            sb.append(" ");
        }
        sb.append("客户签字:");
        return sb.toString();
    }

    public static String getTitle(String title) {
        StringBuilder sb = new StringBuilder();
        int sc = WIDTH_ALL - length(title);
        int re = sc % 2;
        for (int i = 1; i < sc / 2; i++) {
            sb.append(" ");
        }
        sb.append(title);
        sb.append("\n");
        return sb.toString();
    }

    public static String getDateLine(String date) {
        StringBuilder sb = new StringBuilder();
        int sc = WIDTH_ALL - length(date);
        int re = sc % 2;
        for (int i = 0; i < sc / 2; i++) {
            if (i % 2 == 0) {
                sb.append("-");
            } else {
                sb.append(" ");
            }
        }
        sb.append(date);
        for (int i = 0; i < sc / 2 + re; i++) {
            if (i % 2 == 0) {
                sb.append("-");
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String getHalvingLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < WIDTH_ALL; i++) {
            if (i % 2 == 0) {
                sb.append("-");
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }


    public static String getGoodLine(StringBuilder sb, String barcode, String c1, boolean isGive, String c3, String c4, String c5) {
        String sub1 = "";
        String sub2 = "";
        String sub3 = "";
        String sub4 = "";

        if (!barcode.isEmpty()) {
            sub1 = getGoodLineLeft(sb, barcode, WIDTH_TWO_1) + c1;
            if (isGive) {
                sb.append(" ");
                sb.append("赠送");
            } else {
                sb.append("     ");
            }
        } else {
            sub1 = getGoodLineLeft(sb, c1, WIDTH_TWO_1);
            sb.append("     ");
        }

        sb.append(" ");

        sub2 = getGoodLine(sb, c3, WIDTH_TWO_3);

        sb.append(" ");

        sub3 = getGoodLine(sb, c4, WIDTH_TWO_4);

        sb.append(" ");

        sub4 = getGoodLine(sb, c5, WIDTH_TWO_5);

        if (!sub1.isEmpty() || !sub2.isEmpty() || !sub3.isEmpty() || !sub4.isEmpty()) {
            sb.append("\n");
            getGoodLine(sb, "", sub1, isGive, sub2, sub3, sub4);
        }
        return sb.toString();
    }


    /**
     * 生成商品行
     *
     * @param sb
     * @param goodName
     * @param c1
     * @param c2
     * @param c3
     * @param c4
     * @return
     */
    public static String getGoodLine(StringBuilder sb, String goodName, String c1, String c2, String c3, String c4) {
        String sub1;
        String sub2;
        String sub3;
        String sub4;

        if (!goodName.isEmpty()) {
            getGoodLineLeft(sb, goodName, WIDTH_ALL);
            sb.append("\n");
        }

        sub1 = getGoodLineLeft(sb, c1, WIDTH_1);

        sb.append(" ");

        sub2 = getGoodLine(sb, c2, WIDTH_2);

        sb.append(" ");

        sub3 = getGoodLine(sb, c3, WIDTH_3);

        sb.append(" ");

        sub4 = getGoodLine(sb, c4, WIDTH_4);

        if (!sub1.isEmpty() || !sub2.isEmpty() || !sub3.isEmpty() || !sub4.isEmpty()) {
            sb.append("\n");
            getGoodLine(sb, "", sub1, sub2, sub3, sub4);
        }
        return sb.toString();
    }

    private static String getGoodLineLeft(StringBuilder sb, String c1, int width1) {
        String sub = "";
        int sc1 = width1 - length(c1);
        if (sc1 >= 0) {
            sb.append(setLeft(c1, sc1));
        } else {
            String cs1 = mySub(c1, 0, width1);
            sub = mySub(c1, width1, length(c1));
            sb.append(setLeft(cs1, width1 - length(cs1)));
        }

        return sub;
    }

    private static String getGoodLine(StringBuilder sb, String c1, int width1) {
        String sub = "";
        int sc1 = width1 - length(c1);
        if (sc1 >= 0) {
            sb.append(setCenter(c1, sc1));
        } else {
            String cs1 = mySub(c1, 0, width1);
            sub = mySub(c1, width1, length(c1));
            sb.append(setCenter(cs1, width1 - length(cs1)));
        }

        return sub;
    }

    private static String mySub(String value, int start, int end) {
        StringBuilder sb = new StringBuilder();
        String chinese = "[\u0391-\uFFE5]";
        int realStart = -1;
        int realEnd = -1;
        int valueLength = 0;
        for (int i = 0; i < value.length(); i++) {
            /* 获取一个字符 */
            String temp = value.substring(i, i + 1);
            /* 判断是否为中文字符 */
            if (temp.matches(chinese)) {
                /* 中文字符长度为2 */
                valueLength += 2;
            } else {
                /* 其他字符长度为1 */
                valueLength += 1;
            }
            if (valueLength >= start && realStart == -1) {
                realStart = i;
            }
            if (valueLength >= end && realEnd == -1) {
                realEnd = i;
            }
            if (realEnd == value.length() - 1) {
                realEnd++;
            }
        }

        return value.substring(realStart, realEnd);
    }

    private static StringBuilder setCenter(String c, int sc) {
        StringBuilder sb = new StringBuilder();
        int re = sc % 2;
        for (int i = 0; i < sc / 2; i++) {
            sb.append(" ");
        }
        sb.append(c);
        for (int i = 0; i < sc / 2 + re; i++) {
            sb.append(" ");
        }
        return sb;
    }

    public static StringBuilder setLeft(String c, int sc) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        for (int i = 0; i < sc; i++) {
            sb.append(" ");
        }
        return sb;
    }

    private static int length(String value) {
        int valueLength = 0;
        String chinese = "[\u0391-\uFFE5]";
        /* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
        for (int i = 0; i < value.length(); i++) {
            /* 获取一个字符 */
            String temp = value.substring(i, i + 1);
            /* 判断是否为中文字符 */
            if (temp.matches(chinese)) {
                /* 中文字符长度为2 */
                valueLength += 2;
            } else {
                /* 其他字符长度为1 */
                valueLength += 1;
            }
        }
        return valueLength;
    }
}
