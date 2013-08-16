/* The following code was generated by JFlex 1.4.3 on 8/17/13 1:23 AM */

package org.intellij.jflex.parser;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.intellij.jflex.psi.JFlexTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/17/13 1:23 AM from the specification file
 * <tt>/Projects/grammar-kit/support/org/intellij/jflex/parser/_JFlexLexer.flex</tt>
 */
public class _JFlexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int DECLARATIONS = 2;
  public static final int YYINITIAL = 0;
  public static final int CHAR_CLASS = 6;
  public static final int BLOCK = 8;
  public static final int RULES = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\6\2\0\1\14\22\0\1\40\1\74\1\4\1\0\1\73"+
    "\1\37\1\0\1\13\1\63\1\64\1\11\1\12\1\71\1\66\1\70"+
    "\1\10\1\3\1\57\4\3\1\60\1\55\1\56\1\3\1\16\1\0"+
    "\1\61\1\41\1\62\1\65\1\0\4\1\1\76\1\100\10\1\1\77"+
    "\13\1\1\15\1\5\1\24\1\67\1\1\1\0\1\33\1\53\1\32"+
    "\1\25\1\21\1\47\1\27\1\44\1\26\1\17\1\54\1\20\1\52"+
    "\1\43\1\35\1\31\1\1\1\23\1\34\1\22\1\30\1\50\1\36"+
    "\1\46\1\45\1\1\1\42\1\72\1\51\1\75\53\0\1\2\12\0"+
    "\1\2\4\0\1\2\5\0\27\2\1\0\37\2\1\0\u013f\2\31\0"+
    "\162\2\4\0\14\2\16\0\5\2\11\0\1\2\213\0\1\2\13\0"+
    "\1\2\1\0\3\2\1\0\1\2\1\0\24\2\1\0\54\2\1\0"+
    "\46\2\1\0\5\2\4\0\202\2\10\0\105\2\1\0\46\2\2\0"+
    "\2\2\6\0\20\2\41\0\46\2\2\0\1\2\7\0\47\2\110\0"+
    "\33\2\5\0\3\2\56\0\32\2\5\0\13\2\25\0\12\7\4\0"+
    "\2\2\1\0\143\2\1\0\1\2\17\0\2\2\7\0\2\2\12\7"+
    "\3\2\2\0\1\2\20\0\1\2\1\0\36\2\35\0\3\2\60\0"+
    "\46\2\13\0\1\2\u0152\0\66\2\3\0\1\2\22\0\1\2\7\0"+
    "\12\2\4\0\12\7\25\0\10\2\2\0\2\2\2\0\26\2\1\0"+
    "\7\2\1\0\1\2\3\0\4\2\3\0\1\2\36\0\2\2\1\0"+
    "\3\2\4\0\12\7\2\2\23\0\6\2\4\0\2\2\2\0\26\2"+
    "\1\0\7\2\1\0\2\2\1\0\2\2\1\0\2\2\37\0\4\2"+
    "\1\0\1\2\7\0\12\7\2\0\3\2\20\0\11\2\1\0\3\2"+
    "\1\0\26\2\1\0\7\2\1\0\2\2\1\0\5\2\3\0\1\2"+
    "\22\0\1\2\17\0\2\2\4\0\12\7\25\0\10\2\2\0\2\2"+
    "\2\0\26\2\1\0\7\2\1\0\2\2\1\0\5\2\3\0\1\2"+
    "\36\0\2\2\1\0\3\2\4\0\12\7\1\0\1\2\21\0\1\2"+
    "\1\0\6\2\3\0\3\2\1\0\4\2\3\0\2\2\1\0\1\2"+
    "\1\0\2\2\3\0\2\2\3\0\3\2\3\0\10\2\1\0\3\2"+
    "\55\0\11\7\25\0\10\2\1\0\3\2\1\0\27\2\1\0\12\2"+
    "\1\0\5\2\46\0\2\2\4\0\12\7\25\0\10\2\1\0\3\2"+
    "\1\0\27\2\1\0\12\2\1\0\5\2\3\0\1\2\40\0\1\2"+
    "\1\0\2\2\4\0\12\7\25\0\10\2\1\0\3\2\1\0\27\2"+
    "\1\0\20\2\46\0\2\2\4\0\12\7\25\0\22\2\3\0\30\2"+
    "\1\0\11\2\1\0\1\2\2\0\7\2\72\0\60\2\1\0\2\2"+
    "\14\0\7\2\11\0\12\7\47\0\2\2\1\0\1\2\2\0\2\2"+
    "\1\0\1\2\2\0\1\2\6\0\4\2\1\0\7\2\1\0\3\2"+
    "\1\0\1\2\1\0\1\2\2\0\2\2\1\0\4\2\1\0\2\2"+
    "\11\0\1\2\2\0\5\2\1\0\1\2\11\0\12\7\2\0\2\2"+
    "\42\0\1\2\37\0\12\7\26\0\10\2\1\0\42\2\35\0\4\2"+
    "\164\0\42\2\1\0\5\2\1\0\2\2\25\0\12\7\6\0\6\2"+
    "\112\0\46\2\12\0\51\2\7\0\132\2\5\0\104\2\5\0\122\2"+
    "\6\0\7\2\1\0\77\2\1\0\1\2\1\0\4\2\2\0\7\2"+
    "\1\0\1\2\1\0\4\2\2\0\47\2\1\0\1\2\1\0\4\2"+
    "\2\0\37\2\1\0\1\2\1\0\4\2\2\0\7\2\1\0\1\2"+
    "\1\0\4\2\2\0\7\2\1\0\7\2\1\0\27\2\1\0\37\2"+
    "\1\0\1\2\1\0\4\2\2\0\7\2\1\0\47\2\1\0\23\2"+
    "\16\0\11\7\56\0\125\2\14\0\u026c\2\2\0\10\2\12\0\32\2"+
    "\5\0\113\2\25\0\15\2\1\0\4\2\16\0\22\2\16\0\22\2"+
    "\16\0\15\2\1\0\3\2\17\0\64\2\43\0\1\2\4\0\1\2"+
    "\3\0\12\7\46\0\12\7\6\0\130\2\10\0\51\2\127\0\35\2"+
    "\51\0\12\7\36\2\2\0\5\2\u038b\0\154\2\224\0\234\2\4\0"+
    "\132\2\6\0\26\2\2\0\6\2\2\0\46\2\2\0\6\2\2\0"+
    "\10\2\1\0\1\2\1\0\1\2\1\0\1\2\1\0\37\2\2\0"+
    "\65\2\1\0\7\2\1\0\1\2\3\0\3\2\1\0\7\2\3\0"+
    "\4\2\2\0\6\2\4\0\15\2\5\0\3\2\1\0\7\2\164\0"+
    "\1\2\15\0\1\2\202\0\1\2\4\0\1\2\2\0\12\2\1\0"+
    "\1\2\3\0\5\2\6\0\1\2\1\0\1\2\1\0\1\2\1\0"+
    "\4\2\1\0\3\2\1\0\7\2\3\0\3\2\5\0\5\2\u0ebb\0"+
    "\2\2\52\0\5\2\5\0\2\2\4\0\126\2\6\0\3\2\1\0"+
    "\132\2\1\0\4\2\5\0\50\2\4\0\136\2\21\0\30\2\70\0"+
    "\20\2\u0200\0\u19b6\2\112\0\u51a6\2\132\0\u048d\2\u0773\0\u2ba4\2\u215c\0"+
    "\u012e\2\2\0\73\2\225\0\7\2\14\0\5\2\5\0\1\2\1\0"+
    "\12\2\1\0\15\2\1\0\5\2\1\0\1\2\1\0\2\2\1\0"+
    "\2\2\1\0\154\2\41\0\u016b\2\22\0\100\2\2\0\66\2\50\0"+
    "\14\2\164\0\5\2\1\0\207\2\23\0\12\7\7\0\32\2\6\0"+
    "\32\2\13\0\131\2\3\0\6\2\2\0\6\2\2\0\6\2\2\0"+
    "\3\2\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\2\1\1\2\1\1\1\3\1\4\1\3\1\5"+
    "\1\6\1\7\1\5\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\5\1\16\1\17\1\20\1\5\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\2\5\1\34\1\35\1\5\1\36\1\5\1\37"+
    "\3\1\1\3\1\0\1\40\1\41\1\42\1\0\1\43"+
    "\1\0\1\44\1\41\12\0\1\45\1\46\1\47\2\0"+
    "\1\50\10\0\1\40\1\41\1\1\4\0\1\51\2\41"+
    "\46\0\2\1\1\40\2\41\3\0\2\41\14\0\1\52"+
    "\10\0\1\53\25\0\2\40\3\41\10\0\1\54\2\0"+
    "\1\55\3\0\1\56\11\0\1\57\6\0\1\60\13\0"+
    "\1\61\3\0\1\62\1\63\4\0\1\64\13\0\1\65"+
    "\1\66\4\0\1\67\4\0\1\70\7\0\1\71\5\0"+
    "\1\72\1\0\1\73\2\0\1\74\1\75\4\0\1\76"+
    "\21\0\1\77\2\0\1\100\1\0\1\101\4\0\1\102"+
    "\2\0\1\103\1\0\1\104\1\105\13\0\1\106\1\107"+
    "\1\0\1\110\1\111\1\0\1\112\1\0\1\113\1\114"+
    "\6\0\1\115\3\0\1\116\5\0\1\117\1\0\1\120"+
    "\1\121\3\0\1\122\1\123\1\0\1\124\3\0\1\125"+
    "\5\0\1\126\2\0\1\127\1\0\1\130\3\0\1\131"+
    "\1\0\1\132\2\0\1\133\3\0\1\134\1\135\1\136"+
    "\1\137\1\140\1\141\1\142\4\0\1\143\1\144\1\0"+
    "\1\145\1\146\2\0\1\147";

  private static int [] zzUnpackAction() {
    int [] result = new int[419];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\101\0\202\0\303\0\u0104\0\u0145\0\u0186\0\u01c7"+
    "\0\u0208\0\u0249\0\u028a\0\u02cb\0\u030c\0\u034d\0\u038e\0\u03cf"+
    "\0\u0410\0\u02cb\0\u02cb\0\u0451\0\u02cb\0\u0492\0\u02cb\0\u02cb"+
    "\0\u02cb\0\u04d3\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u02cb"+
    "\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u0514\0\u0555\0\u04d3"+
    "\0\u02cb\0\u03cf\0\u02cb\0\u0451\0\u02cb\0\u0596\0\u05d7\0\u0618"+
    "\0\u0659\0\u069a\0\u06db\0\u071c\0\u02cb\0\u038e\0\u02cb\0\u075d"+
    "\0\u02cb\0\u079e\0\u07df\0\u0820\0\u0861\0\u08a2\0\u08e3\0\u0924"+
    "\0\u0965\0\u09a6\0\u09e7\0\u0a28\0\u0a69\0\u02cb\0\u02cb\0\u0aaa"+
    "\0\u0aeb\0\u0b2c\0\u0b6d\0\u0bae\0\u0bef\0\u0c30\0\u0c71\0\u0cb2"+
    "\0\u0cf3\0\u0d34\0\u0d75\0\u0db6\0\u0df7\0\u0e38\0\u0e79\0\u0eba"+
    "\0\u0efb\0\u02cb\0\u0f3c\0\u0f7d\0\u0fbe\0\u0fff\0\u1040\0\u1081"+
    "\0\u10c2\0\u1103\0\u1144\0\u1185\0\u11c6\0\u1207\0\u1248\0\u1289"+
    "\0\u12ca\0\u130b\0\u134c\0\u138d\0\u13ce\0\u140f\0\u1450\0\u1491"+
    "\0\u14d2\0\u1513\0\u1554\0\u1595\0\u15d6\0\u1617\0\u1658\0\u1699"+
    "\0\u16da\0\u171b\0\u175c\0\u179d\0\u17de\0\u181f\0\u1860\0\u18a1"+
    "\0\u18e2\0\u1923\0\u02cb\0\u0cf3\0\u1964\0\u19a5\0\u19e6\0\u1a27"+
    "\0\u1a68\0\u1aa9\0\u0145\0\u02cb\0\u1aea\0\u1b2b\0\u1b6c\0\u1bad"+
    "\0\u1bee\0\u1c2f\0\u1c70\0\u1cb1\0\u1cf2\0\u1d33\0\u1d74\0\u1db5"+
    "\0\u1df6\0\u1e37\0\u1e78\0\u1eb9\0\u1efa\0\u1f3b\0\u1f7c\0\u1fbd"+
    "\0\u1ffe\0\u203f\0\u2080\0\u20c1\0\u2102\0\u2143\0\u2184\0\u21c5"+
    "\0\u2206\0\u2247\0\u2288\0\u22c9\0\u230a\0\u234b\0\u238c\0\u23cd"+
    "\0\u240e\0\u244f\0\u2490\0\u24d1\0\u2512\0\u2553\0\u2594\0\u25d5"+
    "\0\u2616\0\u0596\0\u2657\0\u2698\0\u26d9\0\u271a\0\u275b\0\u279c"+
    "\0\u27dd\0\u281e\0\u285f\0\u28a0\0\u02cb\0\u28e1\0\u2922\0\u02cb"+
    "\0\u2963\0\u29a4\0\u29e5\0\u02cb\0\u2a26\0\u2a67\0\u2aa8\0\u2ae9"+
    "\0\u2b2a\0\u2b6b\0\u2bac\0\u2bed\0\u2c2e\0\u02cb\0\u2c6f\0\u2cb0"+
    "\0\u2cf1\0\u2d32\0\u2d73\0\u2db4\0\u02cb\0\u2df5\0\u2e36\0\u2e77"+
    "\0\u2eb8\0\u2ef9\0\u2f3a\0\u2f7b\0\u2fbc\0\u2ffd\0\u303e\0\u307f"+
    "\0\u02cb\0\u30c0\0\u3101\0\u3142\0\u02cb\0\u02cb\0\u3183\0\u31c4"+
    "\0\u3205\0\u3246\0\u02cb\0\u3287\0\u32c8\0\u3309\0\u334a\0\u338b"+
    "\0\u33cc\0\u340d\0\u344e\0\u348f\0\u34d0\0\u3511\0\u02cb\0\u02cb"+
    "\0\u3552\0\u3593\0\u35d4\0\u3615\0\u02cb\0\u3656\0\u3697\0\u36d8"+
    "\0\u3719\0\u02cb\0\u375a\0\u379b\0\u37dc\0\u381d\0\u385e\0\u389f"+
    "\0\u38e0\0\u02cb\0\u3921\0\u3962\0\u39a3\0\u39e4\0\u3a25\0\u02cb"+
    "\0\u3a66\0\u02cb\0\u3aa7\0\u3ae8\0\u02cb\0\u02cb\0\u3b29\0\u3b6a"+
    "\0\u3bab\0\u3bec\0\u02cb\0\u3c2d\0\u3c6e\0\u3caf\0\u3cf0\0\u3d31"+
    "\0\u3d72\0\u3db3\0\u3df4\0\u3e35\0\u3e76\0\u3eb7\0\u3ef8\0\u3f39"+
    "\0\u3f7a\0\u3fbb\0\u3ffc\0\u403d\0\u02cb\0\u407e\0\u40bf\0\u02cb"+
    "\0\u4100\0\u02cb\0\u4141\0\u4182\0\u41c3\0\u4204\0\u02cb\0\u4245"+
    "\0\u4286\0\u02cb\0\u42c7\0\u02cb\0\u02cb\0\u4308\0\u4349\0\u438a"+
    "\0\u43cb\0\u440c\0\u444d\0\u448e\0\u44cf\0\u4510\0\u4551\0\u4592"+
    "\0\u02cb\0\u02cb\0\u45d3\0\u02cb\0\u02cb\0\u4614\0\u02cb\0\u4655"+
    "\0\u02cb\0\u02cb\0\u4696\0\u46d7\0\u4718\0\u4759\0\u479a\0\u47db"+
    "\0\u02cb\0\u481c\0\u485d\0\u489e\0\u02cb\0\u48df\0\u4920\0\u4961"+
    "\0\u49a2\0\u49e3\0\u02cb\0\u4a24\0\u4a65\0\u02cb\0\u4aa6\0\u4ae7"+
    "\0\u4b28\0\u02cb\0\u02cb\0\u4b69\0\u02cb\0\u4baa\0\u4beb\0\u4c2c"+
    "\0\u02cb\0\u4c6d\0\u4cae\0\u4cef\0\u4d30\0\u4d71\0\u02cb\0\u4db2"+
    "\0\u4df3\0\u02cb\0\u4e34\0\u4e75\0\u4eb6\0\u4ef7\0\u4f38\0\u02cb"+
    "\0\u4f79\0\u02cb\0\u4fba\0\u4ffb\0\u02cb\0\u503c\0\u507d\0\u50be"+
    "\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u02cb\0\u50ff\0\u02cb\0\u5140"+
    "\0\u5181\0\u51c2\0\u5203\0\u02cb\0\u02cb\0\u5244\0\u02cb\0\u02cb"+
    "\0\u5285\0\u52c6\0\u02cb";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[419];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\6\6\1\7\1\6\1\10\3\6\1\11\22\6\1\12"+
    "\1\13\40\6\1\14\2\15\1\16\1\17\1\20\1\7"+
    "\1\16\1\21\1\22\1\23\1\14\1\13\1\24\1\14"+
    "\5\15\1\25\12\15\1\26\1\13\1\27\1\30\6\15"+
    "\1\31\3\15\4\16\1\32\1\14\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\3\15\1\14\2\15\1\16\1\17\1\20\1\7\1\16"+
    "\1\21\1\22\1\23\1\46\1\13\1\24\1\14\5\15"+
    "\1\25\12\15\1\47\1\13\1\14\1\30\6\15\1\31"+
    "\3\15\4\16\1\50\1\51\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\3\15"+
    "\4\14\1\17\1\52\1\53\6\14\1\54\6\14\1\55"+
    "\41\14\1\36\1\37\11\14\6\56\1\7\1\56\1\57"+
    "\2\56\1\60\1\61\22\56\1\62\1\13\10\56\1\31"+
    "\27\56\6\6\1\0\30\6\2\0\40\6\6\0\1\7"+
    "\72\0\6\6\1\0\1\6\1\63\1\64\25\6\2\0"+
    "\46\6\1\0\5\6\1\11\22\6\1\0\1\13\40\6"+
    "\37\0\1\65\55\0\1\13\23\0\1\13\142\0\1\15"+
    "\1\0\1\15\13\0\5\15\1\0\12\15\4\0\6\15"+
    "\1\0\7\15\15\0\3\15\3\0\1\16\3\0\1\16"+
    "\45\0\4\16\20\0\4\66\1\67\1\70\73\66\6\71"+
    "\1\0\72\71\10\0\1\63\1\72\105\0\1\73\102\0"+
    "\1\74\1\75\1\76\2\0\1\77\1\100\1\0\1\101"+
    "\1\102\1\103\1\104\1\105\2\0\1\106\2\0\1\107"+
    "\1\110\1\0\1\111\1\112\1\113\3\0\1\114\1\0"+
    "\1\115\1\116\1\117\102\0\1\120\17\0\5\121\1\122"+
    "\5\121\1\0\65\121\37\0\1\106\41\0\6\56\1\0"+
    "\4\56\1\60\23\56\2\0\10\56\1\0\35\56\1\0"+
    "\1\56\1\123\1\124\1\56\1\60\23\56\2\0\10\56"+
    "\1\0\34\56\1\125\1\126\4\56\1\60\23\56\2\126"+
    "\10\56\1\126\35\56\1\0\4\56\1\60\1\61\22\56"+
    "\1\0\1\13\10\56\1\0\27\56\21\0\1\127\4\0"+
    "\1\130\16\0\1\131\3\0\1\132\27\0\6\63\1\0"+
    "\72\63\6\64\1\72\2\64\1\133\25\64\2\72\40\64"+
    "\6\66\1\0\72\66\11\72\1\134\67\72\17\0\1\135"+
    "\1\136\4\0\1\137\2\0\1\140\76\0\1\141\107\0"+
    "\1\142\10\0\1\143\65\0\1\144\11\0\1\145\54\0"+
    "\1\146\106\0\1\147\13\0\1\150\6\0\1\151\71\0"+
    "\1\152\65\0\1\153\2\0\1\154\65\0\1\155\1\0"+
    "\1\156\5\0\1\157\2\0\1\160\1\0\1\161\6\0"+
    "\1\162\65\0\1\163\21\0\1\164\47\0\1\165\7\0"+
    "\1\166\3\0\1\167\77\0\1\170\110\0\1\171\67\0"+
    "\1\172\72\0\1\173\1\0\1\174\100\0\1\175\14\0"+
    "\1\176\106\0\1\177\100\0\1\200\105\0\1\201\116\0"+
    "\1\202\15\0\1\203\65\0\6\121\1\0\4\121\1\204"+
    "\65\121\6\123\1\0\4\123\1\205\23\123\2\63\10\123"+
    "\1\63\27\123\6\124\1\72\2\124\1\206\1\124\1\207"+
    "\23\124\2\72\10\124\1\72\27\124\6\56\1\0\4\56"+
    "\1\60\23\56\2\126\10\56\1\126\27\56\13\0\1\56"+
    "\122\0\1\210\106\0\1\211\102\0\1\212\33\0\6\64"+
    "\1\72\1\64\1\213\1\133\25\64\2\72\40\64\10\72"+
    "\1\214\1\134\67\72\20\0\1\215\101\0\1\216\13\0"+
    "\1\217\71\0\1\220\103\0\1\221\112\0\1\222\104\0"+
    "\1\223\53\0\1\224\131\0\1\225\56\0\1\226\122\0"+
    "\1\227\70\0\1\230\57\0\1\231\3\0\1\232\3\0"+
    "\1\233\77\0\1\234\75\0\1\235\125\0\1\236\57\0"+
    "\1\237\101\0\1\240\102\0\1\241\74\0\1\242\103\0"+
    "\1\243\64\0\1\244\113\0\1\245\73\0\1\246\106\0"+
    "\1\247\77\0\1\250\100\0\1\251\73\0\1\252\74\0"+
    "\1\253\76\0\1\254\1\255\101\0\1\256\121\0\1\257"+
    "\55\0\1\260\22\0\1\261\104\0\1\262\64\0\1\263"+
    "\73\0\1\264\100\0\1\265\125\0\1\266\124\0\1\267"+
    "\1\0\5\123\1\270\1\126\4\123\1\205\23\123\2\271"+
    "\10\123\1\271\27\123\6\124\1\72\1\124\1\272\1\206"+
    "\1\124\1\207\23\124\2\72\10\124\1\72\34\124\1\273"+
    "\1\274\2\124\1\206\1\124\1\207\23\124\2\274\10\124"+
    "\1\274\27\124\47\0\1\275\57\0\1\276\72\0\1\277"+
    "\101\0\1\300\101\0\1\301\114\0\1\302\71\0\1\303"+
    "\102\0\1\304\70\0\1\305\101\0\1\306\7\0\1\307"+
    "\7\0\1\310\5\0\1\311\51\0\1\312\77\0\1\313"+
    "\101\0\1\314\107\0\1\315\105\0\1\316\64\0\1\317"+
    "\14\0\1\320\64\0\1\321\76\0\1\322\100\0\1\323"+
    "\112\0\1\324\66\0\1\325\134\0\1\326\60\0\1\327"+
    "\67\0\1\330\102\0\1\331\6\0\1\332\65\0\1\333"+
    "\107\0\1\334\73\0\1\335\106\0\1\336\71\0\1\337"+
    "\100\0\1\340\20\0\1\341\100\0\1\342\57\0\1\343"+
    "\106\0\1\344\71\0\1\345\114\0\1\346\76\0\1\347"+
    "\100\0\1\350\65\0\1\351\112\0\1\352\115\0\1\353"+
    "\63\0\1\354\70\0\1\355\100\0\1\356\104\0\1\357"+
    "\152\0\1\360\6\123\1\0\4\123\1\205\23\123\2\271"+
    "\10\123\1\271\27\123\6\63\1\0\4\63\1\123\65\63"+
    "\6\124\1\72\2\124\1\206\1\124\1\207\23\124\2\274"+
    "\10\124\1\274\27\124\11\72\1\134\1\72\1\124\65\72"+
    "\22\0\1\361\25\0\1\362\1\363\51\0\1\364\77\0"+
    "\1\365\101\0\1\366\100\0\1\367\77\0\1\370\105\0"+
    "\1\371\73\0\1\372\123\0\1\373\54\0\1\374\113\0"+
    "\1\375\110\0\1\376\56\0\1\377\106\0\1\u0100\74\0"+
    "\1\u0101\104\0\1\u0102\74\0\1\u0103\77\0\1\u0104\17\0"+
    "\1\u0105\66\0\1\u0106\71\0\1\u0107\114\0\1\u0108\71\0"+
    "\1\u0109\106\0\1\u010a\77\0\1\u010b\66\0\1\u010c\124\0"+
    "\1\u010d\53\0\1\u010e\132\0\1\u010f\51\0\1\u0110\100\0"+
    "\1\u0111\76\0\1\u0112\104\0\1\u0113\74\0\1\u0114\111\0"+
    "\1\u0115\111\0\1\u0116\103\0\1\u0117\101\0\1\u0118\53\0"+
    "\1\u0119\76\0\1\u011a\102\0\1\u011b\77\0\1\u011c\111\0"+
    "\1\u011d\70\0\1\u011e\140\0\1\u011f\62\0\1\u0120\67\0"+
    "\1\u0121\67\0\1\u0122\26\0\1\u0123\75\0\1\u0124\54\0"+
    "\1\u0125\77\0\1\u0126\102\0\1\u0127\77\0\1\u0128\101\0"+
    "\1\u0129\100\0\1\u012a\112\0\1\u012b\63\0\1\u012c\105\0"+
    "\1\u012d\74\0\1\u012e\100\0\1\u012f\112\0\1\u0130\111\0"+
    "\1\u0131\61\0\1\u0132\125\0\1\u0133\53\0\1\u0134\105\0"+
    "\1\u0135\71\0\1\u0136\130\0\1\u0137\77\0\1\u0138\47\0"+
    "\1\u0139\122\0\1\u013a\63\0\1\u013b\105\0\1\u013c\100\0"+
    "\1\u013d\70\0\1\u013e\121\0\1\u013f\62\0\1\u0140\74\0"+
    "\1\u0141\77\0\1\u0142\105\0\1\u0143\75\0\1\u0144\137\0"+
    "\1\u0145\41\0\1\u0146\75\0\1\u0147\124\0\1\u0148\56\0"+
    "\1\u0149\77\0\1\u014a\102\0\1\u014b\107\0\1\u014c\64\0"+
    "\1\u014d\114\0\1\u014e\103\0\1\u014f\77\0\1\u0150\106\0"+
    "\1\u0151\72\0\1\u0152\76\0\1\u0153\71\0\1\u0154\106\0"+
    "\1\u0155\72\0\1\u0156\76\0\1\u0157\100\0\1\u0158\100\0"+
    "\1\u0159\106\0\1\u015a\101\0\1\u015b\104\0\1\u015c\114\0"+
    "\1\u015d\62\0\1\u015e\66\0\1\u015f\103\0\1\u0160\123\0"+
    "\1\u0161\76\0\1\u0162\71\0\1\u0163\100\0\1\u0164\114\0"+
    "\1\u0165\52\0\1\u0166\121\0\1\u0167\57\0\1\u0168\73\0"+
    "\1\u0169\115\0\1\u016a\71\0\1\u016b\107\0\1\u016c\103\0"+
    "\1\u016d\63\0\1\u016e\112\0\1\u016f\102\0\1\u0170\106\0"+
    "\1\u0171\64\0\1\u0172\105\0\1\u0173\77\0\1\u0174\67\0"+
    "\1\u0175\113\0\1\u0176\100\0\1\u0177\66\0\1\u0178\120\0"+
    "\1\u0179\73\0\1\u017a\77\0\1\u017b\66\0\1\u017c\73\0"+
    "\1\u017d\6\0\1\u017e\77\0\1\u017f\110\0\1\u0180\100\0"+
    "\1\u0181\106\0\1\u0182\72\0\1\u0183\102\0\1\u0184\64\0"+
    "\1\u0185\100\0\1\u0186\121\0\1\u0187\60\0\1\u0188\112\0"+
    "\1\u0189\114\0\1\u018a\65\0\1\u018b\77\0\1\u018c\67\0"+
    "\1\u018d\102\0\1\u018e\73\0\1\u018f\100\0\1\u0190\100\0"+
    "\1\u0191\121\0\1\u0192\72\0\1\u0193\65\0\1\u0194\100\0"+
    "\1\u0195\115\0\1\u0196\113\0\1\u0197\65\0\1\u0198\71\0"+
    "\1\u0199\67\0\1\u019a\100\0\1\u019b\124\0\1\u019c\107\0"+
    "\1\u019d\55\0\1\u019e\76\0\1\u019f\100\0\1\u01a0\76\0"+
    "\1\u01a1\74\0\1\u01a2\106\0\1\u01a3\54\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[21255];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\7\1\1\11\5\1\2\11\1\1\1\11\1\1"+
    "\3\11\1\1\13\11\3\1\1\11\1\1\1\11\1\1"+
    "\1\11\4\1\1\0\2\1\1\11\1\0\1\11\1\0"+
    "\1\11\1\1\12\0\1\1\2\11\2\0\1\1\10\0"+
    "\3\1\4\0\1\11\2\1\46\0\1\11\4\1\3\0"+
    "\1\1\1\11\14\0\1\1\10\0\1\1\25\0\5\1"+
    "\10\0\1\11\2\0\1\11\3\0\1\11\11\0\1\11"+
    "\6\0\1\11\13\0\1\11\3\0\2\11\4\0\1\11"+
    "\13\0\2\11\4\0\1\11\4\0\1\11\7\0\1\11"+
    "\5\0\1\11\1\0\1\11\2\0\2\11\4\0\1\11"+
    "\21\0\1\11\2\0\1\11\1\0\1\11\4\0\1\11"+
    "\2\0\1\11\1\0\2\11\13\0\2\11\1\0\2\11"+
    "\1\0\1\11\1\0\2\11\6\0\1\11\3\0\1\11"+
    "\5\0\1\11\1\0\1\1\1\11\3\0\2\11\1\0"+
    "\1\11\3\0\1\11\5\0\1\11\2\0\1\11\1\0"+
    "\1\1\3\0\1\11\1\0\1\11\2\0\1\11\3\0"+
    "\5\11\1\1\1\11\4\0\2\11\1\0\2\11\2\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[419];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private int prevState;
  private int parenCount;

  public _JFlexLexer() {
    this((java.io.Reader)null);
  }


  public _JFlexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _JFlexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1324) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 88: 
          { return FLEX_PERC_12;
          }
        case 104: break;
        case 74: 
          { return FLEX_PERC_18;
          }
        case 105: break;
        case 36: 
          { return FLEX_ESCAPED_CHAR;
          }
        case 106: break;
        case 92: 
          { return FLEX_PERC_51;
          }
        case 107: break;
        case 57: 
          { return FLEX_PERC_57;
          }
        case 108: break;
        case 60: 
          { return FLEX_PERC_41;
          }
        case 109: break;
        case 8: 
          { return FLEX_SLASH;
          }
        case 110: break;
        case 19: 
          { return FLEX_QUESTION;
          }
        case 111: break;
        case 51: 
          { return FLEX_PERC_47;
          }
        case 112: break;
        case 80: 
          { return FLEX_PERC_31;
          }
        case 113: break;
        case 59: 
          { return FLEX_PERC_5;
          }
        case 114: break;
        case 1: 
          { return FLEX_JAVA;
          }
        case 115: break;
        case 16: 
          { --parenCount; return FLEX_BRACE2;
          }
        case 116: break;
        case 24: 
          { return FLEX_OR;
          }
        case 117: break;
        case 96: 
          { return FLEX_PERC_37;
          }
        case 118: break;
        case 91: 
          { return FLEX_CLASS1;
          }
        case 119: break;
        case 42: 
          { return FLEX_PERC_21;
          }
        case 120: break;
        case 68: 
          { return FLEX_PERC_17;
          }
        case 121: break;
        case 20: 
          { return FLEX_DASH;
          }
        case 122: break;
        case 83: 
          { return FLEX_PERC_50;
          }
        case 123: break;
        case 27: 
          { return FLEX_NOT2;
          }
        case 124: break;
        case 58: 
          { return FLEX_PERC_56;
          }
        case 125: break;
        case 82: 
          { return FLEX_PERC_40;
          }
        case 126: break;
        case 3: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 127: break;
        case 49: 
          { return FLEX_PERC_46;
          }
        case 128: break;
        case 63: 
          { return FLEX_PERC_4;
          }
        case 129: break;
        case 22: 
          { return FLEX_DOT;
          }
        case 130: break;
        case 45: 
          { parenCount=1; yybegin(BLOCK); return FLEX_PERC_29;
          }
        case 131: break;
        case 93: 
          { parenCount=1; yybegin(BLOCK); return FLEX_PERC_13;
          }
        case 132: break;
        case 54: 
          { return FLEX_PERC_36;
          }
        case 133: break;
        case 72: 
          { return FLEX_PERC_20;
          }
        case 134: break;
        case 101: 
          { return FLEX_CLASS6;
          }
        case 135: break;
        case 98: 
          { parenCount=0; yybegin(DECLARATIONS); return FLEX_PERC_14;
          }
        case 136: break;
        case 89: 
          { return FLEX_PERC_16;
          }
        case 137: break;
        case 11: 
          { return FLEX_PLUS;
          }
        case 138: break;
        case 21: 
          { return FLEX_ROOF;
          }
        case 139: break;
        case 34: 
          { yybegin(DECLARATIONS); return FLEX_PERC2;
          }
        case 140: break;
        case 87: 
          { parenCount=1; yybegin(BLOCK); return FLEX_PERC_32;
          }
        case 141: break;
        case 77: 
          { return FLEX_PERC_55;
          }
        case 142: break;
        case 90: 
          { parenCount=0; yybegin(DECLARATIONS); return FLEX_PERC_33;
          }
        case 143: break;
        case 25: 
          { return FLEX_DOLLAR;
          }
        case 144: break;
        case 50: 
          { return FLEX_PERC_45;
          }
        case 145: break;
        case 71: 
          { return FLEX_PERC_3;
          }
        case 146: break;
        case 30: 
          { yybegin(prevState); return FLEX_NEWLINE;
          }
        case 147: break;
        case 102: 
          { return FLEX_CLASS5;
          }
        case 148: break;
        case 12: 
          { prevState = yystate(); yybegin(CHAR_CLASS); return FLEX_BRACK1;
          }
        case 149: break;
        case 5: 
          { return FLEX_CHAR;
          }
        case 150: break;
        case 76: 
          { return FLEX_PERC_15;
          }
        case 151: break;
        case 2: 
          { return FLEX_NEWLINE;
          }
        case 152: break;
        case 15: 
          { parenCount++; return FLEX_BRACE1;
          }
        case 153: break;
        case 9: 
          { return FLEX_SLASH2;
          }
        case 154: break;
        case 26: 
          { return FLEX_NOT;
          }
        case 155: break;
        case 18: 
          { return FLEX_PAREN2;
          }
        case 156: break;
        case 65: 
          { return FLEX_PERC_54;
          }
        case 157: break;
        case 69: 
          { return FLEX_EOF;
          }
        case 158: break;
        case 6: 
          { return FLEX_ID;
          }
        case 159: break;
        case 47: 
          { return FLEX_PERC_44;
          }
        case 160: break;
        case 94: 
          { return FLEX_PERC_2;
          }
        case 161: break;
        case 14: 
          { return FLEX_EQ;
          }
        case 162: break;
        case 35: 
          { return FLEX_STRING;
          }
        case 163: break;
        case 70: 
          { parenCount=1; yybegin(BLOCK); return FLEX_PERC_27;
          }
        case 164: break;
        case 81: 
          { return FLEX_PERC_34;
          }
        case 165: break;
        case 32: 
          { return FLEX_LINE_COMMENT;
          }
        case 166: break;
        case 78: 
          { parenCount=0; yybegin(DECLARATIONS); return FLEX_PERC_28;
          }
        case 167: break;
        case 23: 
          { return FLEX_COMMA;
          }
        case 168: break;
        case 79: 
          { return FLEX_CLASS4;
          }
        case 169: break;
        case 97: 
          { return FLEX_PERC_24;
          }
        case 170: break;
        case 41: 
          { parenCount=0; yybegin(DECLARATIONS); return FLEX_PERC_9;
          }
        case 171: break;
        case 40: 
          { return FLEX_PERC_69;
          }
        case 172: break;
        case 17: 
          { return FLEX_PAREN1;
          }
        case 173: break;
        case 31: 
          { yybegin(prevState); return FLEX_BRACK2;
          }
        case 174: break;
        case 44: 
          { return FLEX_PERC_53;
          }
        case 175: break;
        case 38: 
          { yybegin(RULES); return FLEX_PERC2;
          }
        case 176: break;
        case 33: 
          { return FLEX_BLOCK_COMMENT;
          }
        case 177: break;
        case 67: 
          { return FLEX_PERC_59;
          }
        case 178: break;
        case 53: 
          { return FLEX_PERC_43;
          }
        case 179: break;
        case 56: 
          { return FLEX_PERC_1;
          }
        case 180: break;
        case 61: 
          { return FLEX_PERC_49;
          }
        case 181: break;
        case 95: 
          { return FLEX_PERC_7;
          }
        case 182: break;
        case 55: 
          { parenCount=1; yybegin(BLOCK); return FLEX_PERC_10;
          }
        case 183: break;
        case 29: 
          { return FLEX_ANGLE2;
          }
        case 184: break;
        case 86: 
          { return FLEX_CLASS3;
          }
        case 185: break;
        case 64: 
          { return FLEX_PERC_39;
          }
        case 186: break;
        case 62: 
          { parenCount=0; yybegin(DECLARATIONS); return FLEX_PERC_11;
          }
        case 187: break;
        case 10: 
          { return FLEX_STAR;
          }
        case 188: break;
        case 46: 
          { return FLEX_PERC_23;
          }
        case 189: break;
        case 4: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 190: break;
        case 39: 
          { parenCount=1; yybegin(BLOCK); return FLEX_PERC_8;
          }
        case 191: break;
        case 85: 
          { return FLEX_PERC_19;
          }
        case 192: break;
        case 13: 
          { return FLEX_BRACK2;
          }
        case 193: break;
        case 48: 
          { return FLEX_PERC_52;
          }
        case 194: break;
        case 52: 
          { parenCount=0; yybegin(DECLARATIONS); return FLEX_PERC_30;
          }
        case 195: break;
        case 7: 
          { return FLEX_NUMBER;
          }
        case 196: break;
        case 37: 
          { return FLEX_PERC_58;
          }
        case 197: break;
        case 66: 
          { return FLEX_PERC_42;
          }
        case 198: break;
        case 99: 
          { parenCount=1; yybegin(BLOCK); return FLEX_PERC_25;
          }
        case 199: break;
        case 75: 
          { return FLEX_PERC_48;
          }
        case 200: break;
        case 84: 
          { return FLEX_PERC_6;
          }
        case 201: break;
        case 28: 
          { return FLEX_ANGLE1;
          }
        case 202: break;
        case 100: 
          { parenCount=0; yybegin(DECLARATIONS); return FLEX_PERC_26;
          }
        case 203: break;
        case 103: 
          { return FLEX_CLASS2;
          }
        case 204: break;
        case 43: 
          { return FLEX_PERC_38;
          }
        case 205: break;
        case 73: 
          { return FLEX_PERC_22;
          }
        case 206: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
