// generated with ast extension for cup
// version 0.8
// 5/1/2018 13:42:7


package rs.ac.bg.etf.pp1.ast;

public class Mul extends Mulop {

    public Mul () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Mul(\n");

        buffer.append(tab);
        buffer.append(") [Mul]");
        return buffer.toString();
    }
}
