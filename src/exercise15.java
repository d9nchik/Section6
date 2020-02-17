public class exercise15 {
    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;
        if (status == 0) { // Compute tax for single filers
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (taxableIncome - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
        } else if (status == 1) {
            if (taxableIncome <= 16_700)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 67_900)
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            else if (taxableIncome <= 137_050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (taxableIncome - 67900) * 0.25;
            else if (taxableIncome <= 208_850)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
            else if (taxableIncome <= 372_950)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28 +
                        (taxableIncome - 208850) * 0.33;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28 +
                        (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
        } else if (status == 2) {
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 68_525)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 104_425)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
            else if (taxableIncome <= 186_475)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 82250) * 0.28 +
                        (taxableIncome - 104425) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 82250) * 0.28 +
                        (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
        } else if (status == 3) {
            if (taxableIncome <= 11_950)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 45_500)
                tax = 11_950 * 0.10 + (taxableIncome - 11_950) * 0.15;
            else if (taxableIncome <= 117_450)
                tax = 11_950 * 0.10 + (45_500 - 11_950) * 0.15 +
                        (taxableIncome - 45_500) * 0.25;
            else if (taxableIncome <= 190_200)
                tax = 11_950 * 0.10 + (45_500 - 11_950) * 0.15 +
                        (117_450 - 45_500) * 0.25 + (taxableIncome - 117_450) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 11_950 * 0.10 + (45_500 - 11_950) * 0.15 +
                        (117_450 - 45_500) * 0.25 + (190_200 - 117_450) * 0.28 +
                        (taxableIncome - 190_200) * 0.33;
            else
                tax = 11_950 * 0.10 + (45_500 - 11_950) * 0.15 +
                        (117_450 - 45_500) * 0.25 + (190_200 - 117_450) * 0.28 +
                        (372950 - 117_450) * 0.33 + (taxableIncome - 372950) * 0.35;
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        return tax;
    }

    public static void main(String[] args) {
        System.out.println("Taxable\tSingle\tMarried Joint\tMarried\tHead of");
        System.out.println("Income \t     \tor Qualifying\tSeparate\ta House");
        System.out.println("       \t      \tWidow(er)");
        System.out.println("--------------------------------------------------");
        for (int x = 50_000; x <= 70_000; x += 100) {
            long single = Math.round(computeTax(0, x));
            long marriedJoint = Math.round(computeTax(1, x));
            long marriesSep = Math.round(computeTax(2, x));
            long head = Math.round(computeTax(3, x));

            System.out.printf("%-7d\t%-6d\t%-13d\t%-7d%-7d\n", x, single, marriedJoint, marriesSep, head);
        }
    }
}
