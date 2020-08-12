public class SerializableTest {

    public static void main(String[] args) {
//        System.out.println(PrintUtils.getDateLine("2020-04-08 11:15"));
//        System.out.println(PrintUtils.getGoodLine(new StringBuilder(), "", "商品条码/名称", "数量", "单价", "金额"));
//        System.out.println(PrintUtils.getGoodLine(new StringBuilder(), "大大大大超级大苹果（斤）", "11334134514531", "20.31", "12.22", "500.00"));
//        System.out.println(PrintUtils.getGoodLine(new StringBuilder(), "大大大大超级无敌大大大苹果（斤）", "11334134514531", "20.31", "12.22", "500.00"));
//        System.out.println(PrintUtils.getHalvingLine());
//        System.out.println(PrintUtils.getCountTotal("23.80", "2003.20", "1", "20.00"));
////        System.out.println(PrintUtils.getChineseAmt("2003.20"));
//        System.out.println(PrintUtils.getTwoColumnSide("应收:", "97.00"));
//        System.out.println(PrintUtils.getTwoColumnSide("实收:", "97.00"));
//        System.out.println(PrintUtils.getTwoColumnSide("人民币(RMB):", "10.00"));
//        System.out.println(PrintUtils.getTwoColumnSide("挂账:", "87.00"));
//        System.out.println();
//        System.out.println(PrintUtils.getSignatureLine());
//        System.out.println();

        StringBuilder sb = new StringBuilder();
        sb.append(PrintUtils.getTitle("新红一店"));
        sb.append("\n");
        sb.append(PrintUtils.getTwoColumn("门店号: 5552", "机号: 332"));
        sb.append("\n");
        sb.append(PrintUtils.getDateLine("2020-04-08 11:15"));
        sb.append("\n");
        sb.append(PrintUtils.getGoodLine(new StringBuilder(), "", "商品条码/名称", "数量", "单价", "金额"));
        sb.append("\n");
        sb.append(PrintUtils.getGoodLine(new StringBuilder(), "大大大大超级大苹果（斤）", "11334134514531", "20.31", "12.22", "500.00"));
        sb.append("\n");
        sb.append(PrintUtils.getGoodLine(new StringBuilder(), "大大大大超级无敌大大大苹果（斤）", "11334134514531", "20.31", "12.22", "500.00"));
        sb.append("\n");
        sb.append(PrintUtils.getHalvingLine());
        sb.append("\n");
        sb.append(PrintUtils.getTwoColumn("数量合计: 23.81", "金额合计: 50.12"));
        sb.append("\n");
        sb.append(PrintUtils.getTwoColumn("条码数: 23.81", "优惠: 50.12"));
        sb.append("\n");
        sb.append(PrintUtils.getTwoColumnSide("应收:", "97.00"));
        sb.append("\n");
        sb.append(PrintUtils.getTwoColumnSide("实收:", "97.00"));
        System.out.println(sb.toString());
    }
}
