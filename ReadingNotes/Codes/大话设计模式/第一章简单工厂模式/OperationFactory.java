/**
 * 运算工厂类，在工厂类中，客户端可以根据运算类型创建对应的运算类，后续的新增也只是新增工厂类的case语句和新的运算类，而已上线的运算类则不受影响
 */


public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}