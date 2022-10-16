/**
 * 运算除法类
 */

class OperationDiv extends Operation{
    @Override
    double GetResult() {
        if (getNumberB() == 0) {
            System.out.println("除数不能为0");
        }
        return getNumberA() / getNumberB();
    }
}