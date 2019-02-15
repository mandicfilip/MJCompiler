// generated with ast extension for cup
// version 0.8
// 6/1/2019 17:53:31


package rs.ac.bg.etf.pp1.ast;

public class EnumDesignator extends Designator {

    private String designatorName;
    private String enumMember;

    public EnumDesignator (String designatorName, String enumMember) {
        this.designatorName=designatorName;
        this.enumMember=enumMember;
    }

    public String getDesignatorName() {
        return designatorName;
    }

    public void setDesignatorName(String designatorName) {
        this.designatorName=designatorName;
    }

    public String getEnumMember() {
        return enumMember;
    }

    public void setEnumMember(String enumMember) {
        this.enumMember=enumMember;
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
        buffer.append("EnumDesignator(\n");

        buffer.append(" "+tab+designatorName);
        buffer.append("\n");

        buffer.append(" "+tab+enumMember);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [EnumDesignator]");
        return buffer.toString();
    }
}
