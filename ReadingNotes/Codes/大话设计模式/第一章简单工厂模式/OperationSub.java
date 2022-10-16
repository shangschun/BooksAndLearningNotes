/**
* 运算减法类
*/

class OperationSub extends Operation{
    @Override
    double GetResult() {
        return getNumberA() - getNumberB();
    }
}