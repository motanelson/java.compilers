import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import java.util.regex.*;
import java.util.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("Uso: java  <ficheiro.cs>");
            return;
        }
         String code ="";
        try{
            code = new String(Files.readAllBytes(Paths.get(args[0])));
        }catch (Exception e) {
              System.out.println("error\n");
        }
        CharStream input = CharStreams.fromString(code);
        javaLexer lexer = new javaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        javaParser parser = new javaParser(tokens);

        ParseTree tree = parser.program();

        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
