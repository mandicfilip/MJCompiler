// generated with ast extension for cup
// version 0.8
// 6/1/2019 17:53:30


package rs.ac.bg.etf.pp1.ast;

public class NoFormParamsDeclaration extends FormParams {

    public NoFormParamsDeclaration () {
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
        buffer.append("NoFormParamsDeclaration(\n");

        buffer.append(tab);
        buffer.append(") [NoFormParamsDeclaration]");
        return buffer.toString();
    }
}
