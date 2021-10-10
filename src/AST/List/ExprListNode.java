package AST.List;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.Expr.ExprNode;
import Util.position;

import java.util.ArrayList;

public class ExprListNode extends ASTNode {
    public ArrayList<ExprNode> exprs = new ArrayList<>();
    public ExprListNode(position pos) {
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
