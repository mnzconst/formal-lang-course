from antlr4 import *
from antlr4.InputStream import InputStream

from project.lang.langLexer import langLexer
from project.lang.langParser import langParser
from project.lang.langVisitor import langVisitor


class CountVisitor(langVisitor):

    def __init__(self):
        super(langVisitor, self).__init__()
        self.count = 0

    def enterEveryRule(self, rule):
        self.count += 1


class SerializeVisitor(langVisitor):

    def __init__(self):
        super(langVisitor, self).__init__()
        self.res = ""

    def enterEveryRule(self, rule):
        self.res += rule.getText()


def prog_to_tree(program: str) -> tuple[ParserRuleContext, bool]:
    parser = langParser(CommonTokenStream(langLexer(InputStream(program))))
    prog = parser.prog()
    is_correct = parser.getNumberOfSyntaxErrors() == 0
    return prog, is_correct


def nodes_count(tree: ParserRuleContext) -> int:
    visitor = CountVisitor()
    tree.accept(visitor)
    return visitor.count


def tree_to_prog(tree: ParserRuleContext) -> str:
    visitor = SerializeVisitor()
    tree.accept(visitor)
    return visitor.res
