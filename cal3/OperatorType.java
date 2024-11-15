package questcal.cal3;

public enum OperatorType {
    ADD("+") {
        @Override
        public double operate(double a, double b){
            return a+b;
        }
    }, SUB("-") {
        @Override
        public double operate(double a, double b){
            return a-b;
        }
    }, DIV("/") {
        @Override
        public double operate(double a,double b){
            return a/b;
        }
    }, MUL("*") {
        @Override
        public double operate(double a, double b){
            return a*b;
        }
    };

    private final String opr;

    public String getOpr() {
        return opr;
    }

    OperatorType(String opr) {
        this.opr=opr;
    }

    public abstract double operate(double a, double b);
}
