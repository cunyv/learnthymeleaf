package top.allhere.lambda;

public class LambdaEntity {
    private int var1;
    private int var2;

    public LambdaEntity() {
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "LambdaEntity{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                '}';
    }
}
