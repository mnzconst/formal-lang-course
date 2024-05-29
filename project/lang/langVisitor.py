# Generated from project/lang.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .langParser import langParser
else:
    from langParser import langParser

# This class defines a complete generic visitor for a parse tree produced by langParser.

class langVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by langParser#prog.
    def visitProg(self, ctx:langParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#stmt.
    def visitStmt(self, ctx:langParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#declare.
    def visitDeclare(self, ctx:langParser.DeclareContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#bind.
    def visitBind(self, ctx:langParser.BindContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#remove.
    def visitRemove(self, ctx:langParser.RemoveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#add.
    def visitAdd(self, ctx:langParser.AddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#expr.
    def visitExpr(self, ctx:langParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#set_expr.
    def visitSet_expr(self, ctx:langParser.Set_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#edge_expr.
    def visitEdge_expr(self, ctx:langParser.Edge_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#regexp.
    def visitRegexp(self, ctx:langParser.RegexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#range.
    def visitRange(self, ctx:langParser.RangeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#select.
    def visitSelect(self, ctx:langParser.SelectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#v_filter.
    def visitV_filter(self, ctx:langParser.V_filterContext):
        return self.visitChildren(ctx)



del langParser