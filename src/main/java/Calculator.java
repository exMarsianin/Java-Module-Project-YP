

public class Calculator {
    String names = "";
    int people;
    double valueResult;


     Calculator(int people){
        this.people = people;
    }

    void addmember(Product product){
        valueResult += product.productValue;
        names += product.productName + "\n";
    }

    public String Cost() {
        double sum = valueResult / people;
        var rubles = Math.floor(sum);
        var suffix = getSuffix(rubles);

        return String.format("%.2f", sum) + " рубл" + suffix;
    }

    public static String getSuffix(double rubles) {
        if (rubles % 100 >= 11 && rubles%100 <= 14){
            return "ей";
        }
        else if (rubles % 10 == 1) {
            return "ь";
        } else if (rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4) {
            return "я";
        } else {
            return "ей";
        }
    }
}
