/* CorpusQueryLanguageParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. CorpusQueryLanguageParserTokenManager.java */
package nl.inl.blacklab.queryParser.corpusql;
import java.util.Map;
import java.util.HashMap;
import nl.inl.blacklab.index.complex.ComplexFieldUtil;
import nl.inl.blacklab.search.TextPattern;
import nl.inl.blacklab.search.TextPatternAnd;
import nl.inl.blacklab.search.TextPatternEdge;
import nl.inl.blacklab.search.TextPatternNot;
import nl.inl.blacklab.search.TextPatternOr;
import nl.inl.blacklab.search.TextPatternPositionFilter;
import nl.inl.blacklab.search.TextPatternPositionFilter.Operation;
import nl.inl.blacklab.search.TextPatternProperty;
import nl.inl.blacklab.search.TextPatternRegex;
import nl.inl.blacklab.search.TextPatternTags;
import nl.inl.blacklab.search.TextPatternCaptureGroup;
import nl.inl.blacklab.search.indexstructure.IndexStructure;
import nl.inl.blacklab.search.sequences.TextPatternAnyToken;
import nl.inl.blacklab.search.sequences.TextPatternRepetition;
import nl.inl.blacklab.search.sequences.TextPatternSequence;

/** Token Manager. */
@SuppressWarnings("all")
public class CorpusQueryLanguageParserTokenManager implements CorpusQueryLanguageParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(0, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(0, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(0, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(0, 0);
      case 33:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 38:
         jjmatchedKind = 23;
         return jjMoveNfa_0(0, 0);
      case 40:
         jjmatchedKind = 27;
         return jjMoveNfa_0(0, 0);
      case 41:
         jjmatchedKind = 28;
         return jjMoveNfa_0(0, 0);
      case 42:
         jjmatchedKind = 17;
         return jjMoveNfa_0(0, 0);
      case 43:
         jjmatchedKind = 18;
         return jjMoveNfa_0(0, 0);
      case 44:
         jjmatchedKind = 22;
         return jjMoveNfa_0(0, 0);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 47:
         jjmatchedKind = 14;
         return jjMoveNfa_0(0, 0);
      case 58:
         jjmatchedKind = 26;
         return jjMoveNfa_0(0, 0);
      case 60:
         jjmatchedKind = 13;
         return jjMoveNfa_0(0, 0);
      case 61:
         jjmatchedKind = 16;
         return jjMoveNfa_0(0, 0);
      case 62:
         jjmatchedKind = 15;
         return jjMoveNfa_0(0, 0);
      case 63:
         jjmatchedKind = 19;
         return jjMoveNfa_0(0, 0);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 91:
         jjmatchedKind = 29;
         return jjMoveNfa_0(0, 0);
      case 93:
         jjmatchedKind = 30;
         return jjMoveNfa_0(0, 0);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 123:
         jjmatchedKind = 20;
         return jjMoveNfa_0(0, 0);
      case 124:
         jjmatchedKind = 24;
         return jjMoveNfa_0(0, 0);
      case 125:
         jjmatchedKind = 21;
         return jjMoveNfa_0(0, 0);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 0);
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
         }
         break;
      case 62:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 1;
         }
         break;
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 1);
   }
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 2);
   }
   switch(curChar)
   {
      case 72:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 3);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 4);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 4);
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 78:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 5;
         }
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 110:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 5);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 5);
   }
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 6);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 6);
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 7);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 7);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 7);
   }
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 8);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 8);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 8);
   }
   switch(curChar)
   {
      case 71:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 9;
         }
         break;
      case 103:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 9;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 9);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 25;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                     { jjCheckNAdd(14); }
                  }
                  else if (curChar == 39)
                     { jjCheckNAddStates(0, 2); }
                  else if (curChar == 34)
                     { jjCheckNAddStates(3, 5); }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if (curChar == 35)
                  {
                     if (kind > 5)
                        kind = 5;
                     { jjCheckNAddStates(6, 8); }
                  }
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  { jjCheckNAddStates(6, 8); }
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 3:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if (curChar == 42)
                     { jjCheckNAddStates(9, 11); }
                  break;
               case 6:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddStates(9, 11); }
                  break;
               case 7:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddStates(9, 11); }
                  break;
               case 9:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               case 10:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  { jjCheckNAdd(14); }
                  break;
               case 15:
                  if (curChar == 34)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 16:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 18:
                  { jjCheckNAddStates(3, 5); }
                  break;
               case 19:
                  if (curChar == 34 && kind > 11)
                     kind = 11;
                  break;
               case 20:
                  if (curChar == 39)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 21:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 23:
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 24:
                  if (curChar == 39 && kind > 12)
                     kind = 12;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 13:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAdd(13); }
                  break;
               case 1:
                  if (kind > 5)
                     kind = 5;
                  { jjAddStates(6, 8); }
                  break;
               case 6:
               case 8:
                  { jjCheckNAddStates(9, 11); }
                  break;
               case 16:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 17:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  { jjCheckNAddStates(3, 5); }
                  break;
               case 21:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 22:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  { jjCheckNAddStates(0, 2); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 5)
                     kind = 5;
                  { jjAddStates(6, 8); }
                  break;
               case 6:
               case 8:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddStates(9, 11); }
                  break;
               case 16:
               case 18:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 21:
               case 23:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddStates(0, 2); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 25 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   21, 22, 24, 16, 17, 19, 1, 2, 4, 6, 7, 10,
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null,
"\74", "\57", "\76", "\75", "\52", "\53", "\77", "\173", "\175", "\54", "\46",
"\174", "\55\76", "\72", "\50", "\51", "\133", "\135", "\41", "\41\75", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken()
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public CorpusQueryLanguageParserTokenManager(JavaCharStream stream){

      if (JavaCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public CorpusQueryLanguageParserTokenManager (JavaCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(JavaCharStream stream)
  {

    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 25; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit( JavaCharStream stream, int lexState)
  {

    ReInit( stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffffff81L,
};
static final long[] jjtoSkip = {
   0x7eL,
};
static final long[] jjtoSpecial = {
   0x60L,
};
    protected JavaCharStream  input_stream;

    private final int[] jjrounds = new int[25];
    private final int[] jjstateSet = new int[2 * 25];


    protected int curChar;
}
