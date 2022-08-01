public class EastCoast {
    public static void main(String[] args) {
        double total_sales;
        double sales_percent;
        double east_sales;

        total_sales = 8.6;
        sales_percent = 58.0 / 100.0;
        east_sales = total_sales * sales_percent;

        System.out.println("The East Coast division will generate $" + Math.round(east_sales) + " million in sales this year.");
    }
}