public class Main {
    public static void main(String[] args) {
        chart pieChart=new chart();
        pieChart.addChart(new subject(5,'IPA'));
        pieChart.addChart(new subject(5,'B. IND'));
        System.out.println(pieChart);
        System.out.println();
        pieChart.addChart(new subject(30,"B. ING"));
        System.out.println(pieChart);
    }
}
