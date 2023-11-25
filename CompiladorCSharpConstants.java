/* Generated By:JavaCC: Do not edit this line. CompiladorCSharpConstants.java */
package compiler;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface CompiladorCSharpConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COMENTARIO_SIMPLES = 5;
  /** RegularExpression Id. */
  int COMENTARIOS_LONGO = 6;
  /** RegularExpression Id. */
  int OBS = 7;
  /** RegularExpression Id. */
  int INT = 8;
  /** RegularExpression Id. */
  int VAR = 9;
  /** RegularExpression Id. */
  int FLOAT = 10;
  /** RegularExpression Id. */
  int BOOL = 11;
  /** RegularExpression Id. */
  int CHAR = 12;
  /** RegularExpression Id. */
  int STRING = 13;
  /** RegularExpression Id. */
  int NULL = 14;
  /** RegularExpression Id. */
  int USING = 15;
  /** RegularExpression Id. */
  int NAMESPACE = 16;
  /** RegularExpression Id. */
  int CLASS = 17;
  /** RegularExpression Id. */
  int MAIN = 18;
  /** RegularExpression Id. */
  int VOID = 19;
  /** RegularExpression Id. */
  int RETURN = 20;
  /** RegularExpression Id. */
  int STATIC = 21;
  /** RegularExpression Id. */
  int PRIVATE = 22;
  /** RegularExpression Id. */
  int PROTECTED = 23;
  /** RegularExpression Id. */
  int PUBLIC = 24;
  /** RegularExpression Id. */
  int INTERNAl = 25;
  /** RegularExpression Id. */
  int IF = 26;
  /** RegularExpression Id. */
  int ELSE = 27;
  /** RegularExpression Id. */
  int TRUE = 28;
  /** RegularExpression Id. */
  int FALSE = 29;
  /** RegularExpression Id. */
  int PRINT = 30;
  /** RegularExpression Id. */
  int INPUT = 31;
  /** RegularExpression Id. */
  int WHILE = 32;
  /** RegularExpression Id. */
  int BREAK = 33;
  /** RegularExpression Id. */
  int CONTINUE = 34;
  /** RegularExpression Id. */
  int ABRE_PARENTESES = 35;
  /** RegularExpression Id. */
  int FECHA_PARENTESES = 36;
  /** RegularExpression Id. */
  int ABRE_CHAVE = 37;
  /** RegularExpression Id. */
  int FECHA_CHAVE = 38;
  /** RegularExpression Id. */
  int ABRE_COLCHETE = 39;
  /** RegularExpression Id. */
  int FECHA_COLCHETE = 40;
  /** RegularExpression Id. */
  int PONTO_VIRGULA = 41;
  /** RegularExpression Id. */
  int VIRGULA = 42;
  /** RegularExpression Id. */
  int PONTO = 43;
  /** RegularExpression Id. */
  int RECEBE = 44;
  /** RegularExpression Id. */
  int MAIOR = 45;
  /** RegularExpression Id. */
  int MENOR = 46;
  /** RegularExpression Id. */
  int NEGACAO = 47;
  /** RegularExpression Id. */
  int DOIS_PONTOS = 48;
  /** RegularExpression Id. */
  int IGUAL = 49;
  /** RegularExpression Id. */
  int MAIOR_IGUAL = 50;
  /** RegularExpression Id. */
  int MENOR_IGUAL = 51;
  /** RegularExpression Id. */
  int DIFERENTE = 52;
  /** RegularExpression Id. */
  int OR = 53;
  /** RegularExpression Id. */
  int AND = 54;
  /** RegularExpression Id. */
  int INCREMENTO = 55;
  /** RegularExpression Id. */
  int DECREMENTO = 56;
  /** RegularExpression Id. */
  int MAIS = 57;
  /** RegularExpression Id. */
  int MENOS = 58;
  /** RegularExpression Id. */
  int ASTERISCO = 59;
  /** RegularExpression Id. */
  int BARRA = 60;
  /** RegularExpression Id. */
  int PORCENTO = 61;
  /** RegularExpression Id. */
  int MAIS_IGUAL = 62;
  /** RegularExpression Id. */
  int MENOS_IGUAL = 63;
  /** RegularExpression Id. */
  int ASTERISCO_IGUAL = 64;
  /** RegularExpression Id. */
  int BARRA_IGUAL = 65;
  /** RegularExpression Id. */
  int PORCENTO_IGUAL = 66;
  /** RegularExpression Id. */
  int IDENTIFICADOR = 67;
  /** RegularExpression Id. */
  int LETRA = 68;
  /** RegularExpression Id. */
  int DIGITO = 69;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 70;
  /** RegularExpression Id. */
  int DECIMAL = 71;
  /** RegularExpression Id. */
  int FLOATING_LITERAL = 72;
  /** RegularExpression Id. */
  int EXPONENT = 73;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 74;
  /** RegularExpression Id. */
  int STRING_LITERAL = 75;
  /** RegularExpression Id. */
  int BOOL_LITERAL = 76;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "<COMENTARIO_SIMPLES>",
    "<COMENTARIOS_LONGO>",
    "<OBS>",
    "\"int\"",
    "\"var\"",
    "\"float\"",
    "\"bool\"",
    "\"char\"",
    "\"string\"",
    "\"null\"",
    "\"using\"",
    "\"namespace\"",
    "\"class\"",
    "\"Main\"",
    "\"void\"",
    "\"return\"",
    "\"static\"",
    "\"private\"",
    "\"protected\"",
    "\"public\"",
    "\"internal\"",
    "\"if\"",
    "\"else\"",
    "\"true\"",
    "\"false\"",
    "\"Console.WriteLine\"",
    "\"Console.ReadLine\"",
    "\"while\"",
    "\"break\"",
    "\"continue\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\">\"",
    "\"<\"",
    "\"!\"",
    "\":\"",
    "\"==\"",
    "\"<=\"",
    "\">=\"",
    "\"!=\"",
    "\"||\"",
    "\"&&\"",
    "\"++\"",
    "\"--\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"%=\"",
    "<IDENTIFICADOR>",
    "<LETRA>",
    "<DIGITO>",
    "<INTEGER_LITERAL>",
    "<DECIMAL>",
    "<FLOATING_LITERAL>",
    "<EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "<BOOL_LITERAL>",
  };

}