package questcal.cal3;

public enum OperatorType {
    ADD("+"), SUB("-"), DIV("/"), MUL("*");

    private final String opr;

    public String getOpr() {
        return opr;
    }

    OperatorType(String opr) {
        this.opr=opr;
    }
}
