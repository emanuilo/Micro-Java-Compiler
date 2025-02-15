// generated with ast extension for cup
// version 0.8
// 5/1/2018 13:42:6


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclars implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String I1;
    private Extension Extension;
    private MultiVarDeclars MultiVarDeclars;
    private MethodDeclars MethodDeclars;

    public ClassDeclars (String I1, Extension Extension, MultiVarDeclars MultiVarDeclars, MethodDeclars MethodDeclars) {
        this.I1=I1;
        this.Extension=Extension;
        if(Extension!=null) Extension.setParent(this);
        this.MultiVarDeclars=MultiVarDeclars;
        if(MultiVarDeclars!=null) MultiVarDeclars.setParent(this);
        this.MethodDeclars=MethodDeclars;
        if(MethodDeclars!=null) MethodDeclars.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public Extension getExtension() {
        return Extension;
    }

    public void setExtension(Extension Extension) {
        this.Extension=Extension;
    }

    public MultiVarDeclars getMultiVarDeclars() {
        return MultiVarDeclars;
    }

    public void setMultiVarDeclars(MultiVarDeclars MultiVarDeclars) {
        this.MultiVarDeclars=MultiVarDeclars;
    }

    public MethodDeclars getMethodDeclars() {
        return MethodDeclars;
    }

    public void setMethodDeclars(MethodDeclars MethodDeclars) {
        this.MethodDeclars=MethodDeclars;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Extension!=null) Extension.accept(visitor);
        if(MultiVarDeclars!=null) MultiVarDeclars.accept(visitor);
        if(MethodDeclars!=null) MethodDeclars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Extension!=null) Extension.traverseTopDown(visitor);
        if(MultiVarDeclars!=null) MultiVarDeclars.traverseTopDown(visitor);
        if(MethodDeclars!=null) MethodDeclars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Extension!=null) Extension.traverseBottomUp(visitor);
        if(MultiVarDeclars!=null) MultiVarDeclars.traverseBottomUp(visitor);
        if(MethodDeclars!=null) MethodDeclars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDeclars(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(Extension!=null)
            buffer.append(Extension.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultiVarDeclars!=null)
            buffer.append(MultiVarDeclars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodDeclars!=null)
            buffer.append(MethodDeclars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclars]");
        return buffer.toString();
    }
}
