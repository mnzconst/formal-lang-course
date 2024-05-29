from antlr4 import *
from antlr4.InputStream import InputStream

from project.lang.langLexer import langLexer
from project.lang.langParser import langParser
from project.lang.langVisitor import langVisitor
from project.lang.langListener import langListener


class CountVisitor(langVisitor):
    count = 0

    def __init__(self):
        super(langVisitor, self).__init__()

    def enterEveryRule(self, rule):
        self.count += 1

    def exitEveryRule(self, rule):
        pass


class SerializeVisitor(langVisitor):
    res = ""

    def __init__(self):
        super(langVisitor, self).__init__()

    def enterEveryRule(self, rule):
        self.res += rule.getText()

    def exitEveryRule(self, rule):
        pass


def get_parser(program: str) -> langParser:
    return langParser(CommonTokenStream(langLexer(InputStream(program))))


def prog_to_tree(program: str) -> tuple[ParserRuleContext, bool]:
    parser = get_parser(program)
    ctx = parser.prog()
    return (ctx, parser.getNumberOfSyntaxErrors() == 0)


def nodes_count(tree: ParserRuleContext) -> int:
    visitor = CountVisitor()
    tree.accept(visitor)
    return visitor.count


def tree_to_prog(tree: ParserRuleContext) -> str:
    visitor = SerializeVisitor()
    tree.accept(visitor)
    return visitor.res
