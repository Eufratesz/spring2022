package objects.attributes;

public class Bill {

    public static void main(String[] args) {

        BillItem billItem1 = new BillItem("könyv", 1000, 1, 27);
        System.out.println(billItem1.getProduct());
        System.out.println(billItem1.getPrice());
        System.out.println(billItem1.getQuantity());
        System.out.println(billItem1.getVatPercent());
        System.out.println(billItem1.calculateTotalPrice(billItem1.getPrice(), billItem1.getQuantity(), billItem1.getVatPercent()));

        BillItem billItem2 = new BillItem("festék", 2000, 2, 27);
        System.out.println(billItem2.getProduct());
        System.out.println(billItem2.getPrice());
        System.out.println(billItem2.getQuantity());
        System.out.println(billItem2.getVatPercent());
        System.out.println(billItem2.calculateTotalPrice(billItem2.getPrice(), billItem2.getQuantity(), billItem2.getVatPercent()));
    }
}
