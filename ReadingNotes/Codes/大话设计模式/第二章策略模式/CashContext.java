/**
 * 收费策略类
 */
public class CashContext {
    CashSuper cs = null;

//    将实例化具体策略的过程由客户端转移到Context类中，是简单工厂的应用
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cn = new CashNormal();
                cs = cn;
                break;
            case "满300返100":
                CashReturn cr = new CashReturn("300", "100");
                cs = cr;
                break;
            case "打8折":
                CashRebate cr1 = new CashRebate("0.8");
                cs = cr1;
                break;
        }
    }

}