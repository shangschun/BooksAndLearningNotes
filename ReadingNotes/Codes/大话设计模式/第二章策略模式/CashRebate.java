/**
 * 打折收费类
 */
public class CashRebate extends CashSuper{

    private double moneyRebate = 1;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}