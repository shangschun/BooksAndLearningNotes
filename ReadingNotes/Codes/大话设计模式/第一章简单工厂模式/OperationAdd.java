/**
 * 运算加法类
 */

class OperationAdd extends Operation{
    @Override
    double GetResult() {
        return getNumberA() + getNumberB();
    }
}