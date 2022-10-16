/**
 * 运算乘法类
 */

class OperationMul extends Operation{
    @Override
    double GetResult() {
        return getNumberA() * getNumberB();
    }
}