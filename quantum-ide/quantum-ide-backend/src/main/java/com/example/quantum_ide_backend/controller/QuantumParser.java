// $ANTLR 3.5.1 C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g 2025-11-03 15:14:38

package com.example.quantum_ide_backend.controller;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class QuantumParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARROW", "ASSIGN", "BIT", 
		"BREAK", "CCX", "CHAR", "CNOT", "COMMA", "COMMENT", "CONTINUE", "COS", 
		"CSWAP", "CX", "CY", "CZ", "DIV", "ELSE", "EQ", "ESC_SEQ", "EULER", "EXP", 
		"EXPONENT", "FALSE", "FLOAT", "FLOATTYPE", "FOR", "FUNC", "GATE", "GE", 
		"GT", "H", "HEX_DIGIT", "ID", "IF", "INT", "INTTYPE", "ISWAP", "LBRACE", 
		"LBRACK", "LE", "LOG", "LPAREN", "LT", "MEASURE", "MINUS", "MOD", "NEQ", 
		"NOT", "OCTAL_ESC", "ONE", "OR", "PI", "PLUS", "POW", "QUBIT", "RBRACE", 
		"RBRACK", "REGISTER", "RESET", "RETURN", "RPAREN", "RX", "RY", "RZ", "S", 
		"SEMI", "SIN", "SQRT", "SQRT2", "STRING", "SWAP", "T", "TAN", "TIMES", 
		"TRUE", "U1", "U2", "U3", "UNICODE_ESC", "WHILE", "WS", "X", "Y", "Z", 
		"ZERO", "BLOCK", "FUNCTION_CALL", "FUNC_DECL", "GATE_APPLY", "GATE_DECL", 
		"PARAMS", "PROGRAM"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ARROW=5;
	public static final int ASSIGN=6;
	public static final int BIT=7;
	public static final int BREAK=8;
	public static final int CCX=9;
	public static final int CHAR=10;
	public static final int CNOT=11;
	public static final int COMMA=12;
	public static final int COMMENT=13;
	public static final int CONTINUE=14;
	public static final int COS=15;
	public static final int CSWAP=16;
	public static final int CX=17;
	public static final int CY=18;
	public static final int CZ=19;
	public static final int DIV=20;
	public static final int ELSE=21;
	public static final int EQ=22;
	public static final int ESC_SEQ=23;
	public static final int EULER=24;
	public static final int EXP=25;
	public static final int EXPONENT=26;
	public static final int FALSE=27;
	public static final int FLOAT=28;
	public static final int FLOATTYPE=29;
	public static final int FOR=30;
	public static final int FUNC=31;
	public static final int GATE=32;
	public static final int GE=33;
	public static final int GT=34;
	public static final int H=35;
	public static final int HEX_DIGIT=36;
	public static final int ID=37;
	public static final int IF=38;
	public static final int INT=39;
	public static final int INTTYPE=40;
	public static final int ISWAP=41;
	public static final int LBRACE=42;
	public static final int LBRACK=43;
	public static final int LE=44;
	public static final int LOG=45;
	public static final int LPAREN=46;
	public static final int LT=47;
	public static final int MEASURE=48;
	public static final int MINUS=49;
	public static final int MOD=50;
	public static final int NEQ=51;
	public static final int NOT=52;
	public static final int OCTAL_ESC=53;
	public static final int ONE=54;
	public static final int OR=55;
	public static final int PI=56;
	public static final int PLUS=57;
	public static final int POW=58;
	public static final int QUBIT=59;
	public static final int RBRACE=60;
	public static final int RBRACK=61;
	public static final int REGISTER=62;
	public static final int RESET=63;
	public static final int RETURN=64;
	public static final int RPAREN=65;
	public static final int RX=66;
	public static final int RY=67;
	public static final int RZ=68;
	public static final int S=69;
	public static final int SEMI=70;
	public static final int SIN=71;
	public static final int SQRT=72;
	public static final int SQRT2=73;
	public static final int STRING=74;
	public static final int SWAP=75;
	public static final int T=76;
	public static final int TAN=77;
	public static final int TIMES=78;
	public static final int TRUE=79;
	public static final int U1=80;
	public static final int U2=81;
	public static final int U3=82;
	public static final int UNICODE_ESC=83;
	public static final int WHILE=84;
	public static final int WS=85;
	public static final int X=86;
	public static final int Y=87;
	public static final int Z=88;
	public static final int ZERO=89;
	public static final int BLOCK=90;
	public static final int FUNCTION_CALL=91;
	public static final int FUNC_DECL=92;
	public static final int GATE_APPLY=93;
	public static final int GATE_DECL=94;
	public static final int PARAMS=95;
	public static final int PROGRAM=96;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public QuantumParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public QuantumParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return QuantumParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:18:1: program : ( statement )+ EOF -> ^( PROGRAM ( statement )+ ) ;
	public final QuantumParser.program_return program() throws RecognitionException {
		QuantumParser.program_return retval = new QuantumParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope statement1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:19:5: ( ( statement )+ EOF -> ^( PROGRAM ( statement )+ ) )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:19:7: ( statement )+ EOF
			{
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:19:7: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BIT && LA1_0 <= CNOT)||(LA1_0 >= CONTINUE && LA1_0 <= CSWAP)||(LA1_0 >= EULER && LA1_0 <= EXP)||(LA1_0 >= FALSE && LA1_0 <= FLOAT)||(LA1_0 >= FOR && LA1_0 <= GATE)||LA1_0==H||(LA1_0 >= ID && LA1_0 <= INT)||LA1_0==ISWAP||(LA1_0 >= LOG && LA1_0 <= LPAREN)||LA1_0==MEASURE||LA1_0==NOT||LA1_0==ONE||LA1_0==PI||LA1_0==QUBIT||(LA1_0 >= REGISTER && LA1_0 <= RESET)||(LA1_0 >= RX && LA1_0 <= S)||(LA1_0 >= SIN && LA1_0 <= SQRT)||(LA1_0 >= STRING && LA1_0 <= TAN)||(LA1_0 >= TRUE && LA1_0 <= U3)||LA1_0==WHILE||(LA1_0 >= X && LA1_0 <= ZERO)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:19:7: statement
					{
					pushFollow(FOLLOW_statement_in_program92);
					statement1=statement();
					state._fsp--;

					stream_statement.add(statement1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program95);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 19:22: -> ^( PROGRAM ( statement )+ )
			{
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:19:25: ^( PROGRAM ( statement )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_statement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:23:1: statement : ( qubitDecl SEMI !| bitDecl SEMI !| gateDecl | funcDecl | gateApply SEMI !| measureStmt SEMI !| resetStmt SEMI !| controlFlow | expr SEMI !);
	public final QuantumParser.statement_return statement() throws RecognitionException {
		QuantumParser.statement_return retval = new QuantumParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMI4=null;
		Token SEMI6=null;
		Token SEMI10=null;
		Token SEMI12=null;
		Token SEMI14=null;
		Token SEMI17=null;
		ParserRuleReturnScope qubitDecl3 =null;
		ParserRuleReturnScope bitDecl5 =null;
		ParserRuleReturnScope gateDecl7 =null;
		ParserRuleReturnScope funcDecl8 =null;
		ParserRuleReturnScope gateApply9 =null;
		ParserRuleReturnScope measureStmt11 =null;
		ParserRuleReturnScope resetStmt13 =null;
		ParserRuleReturnScope controlFlow15 =null;
		ParserRuleReturnScope expr16 =null;

		Object SEMI4_tree=null;
		Object SEMI6_tree=null;
		Object SEMI10_tree=null;
		Object SEMI12_tree=null;
		Object SEMI14_tree=null;
		Object SEMI17_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:24:5: ( qubitDecl SEMI !| bitDecl SEMI !| gateDecl | funcDecl | gateApply SEMI !| measureStmt SEMI !| resetStmt SEMI !| controlFlow | expr SEMI !)
			int alt2=9;
			switch ( input.LA(1) ) {
			case QUBIT:
				{
				alt2=1;
				}
				break;
			case REGISTER:
				{
				alt2=1;
				}
				break;
			case BIT:
				{
				alt2=2;
				}
				break;
			case GATE:
				{
				alt2=3;
				}
				break;
			case FUNC:
				{
				alt2=4;
				}
				break;
			case CCX:
			case CNOT:
			case CSWAP:
			case H:
			case ISWAP:
			case RX:
			case RY:
			case RZ:
			case S:
			case SWAP:
			case T:
			case U1:
			case U2:
			case U3:
			case X:
			case Y:
			case Z:
				{
				alt2=5;
				}
				break;
			case MEASURE:
				{
				alt2=6;
				}
				break;
			case RESET:
				{
				alt2=7;
				}
				break;
			case BREAK:
			case CONTINUE:
			case FOR:
			case IF:
			case WHILE:
				{
				alt2=8;
				}
				break;
			case CHAR:
			case COS:
			case EULER:
			case EXP:
			case FALSE:
			case FLOAT:
			case ID:
			case INT:
			case LOG:
			case LPAREN:
			case NOT:
			case ONE:
			case PI:
			case SIN:
			case SQRT:
			case STRING:
			case TAN:
			case TRUE:
			case ZERO:
				{
				alt2=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:24:7: qubitDecl SEMI !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qubitDecl_in_statement122);
					qubitDecl3=qubitDecl();
					state._fsp--;

					adaptor.addChild(root_0, qubitDecl3.getTree());

					SEMI4=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement124); 
					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:25:7: bitDecl SEMI !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bitDecl_in_statement133);
					bitDecl5=bitDecl();
					state._fsp--;

					adaptor.addChild(root_0, bitDecl5.getTree());

					SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement135); 
					}
					break;
				case 3 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:26:7: gateDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_gateDecl_in_statement144);
					gateDecl7=gateDecl();
					state._fsp--;

					adaptor.addChild(root_0, gateDecl7.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:27:7: funcDecl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_funcDecl_in_statement152);
					funcDecl8=funcDecl();
					state._fsp--;

					adaptor.addChild(root_0, funcDecl8.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:28:7: gateApply SEMI !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_gateApply_in_statement160);
					gateApply9=gateApply();
					state._fsp--;

					adaptor.addChild(root_0, gateApply9.getTree());

					SEMI10=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement162); 
					}
					break;
				case 6 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:29:7: measureStmt SEMI !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_measureStmt_in_statement171);
					measureStmt11=measureStmt();
					state._fsp--;

					adaptor.addChild(root_0, measureStmt11.getTree());

					SEMI12=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement173); 
					}
					break;
				case 7 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:30:7: resetStmt SEMI !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_resetStmt_in_statement182);
					resetStmt13=resetStmt();
					state._fsp--;

					adaptor.addChild(root_0, resetStmt13.getTree());

					SEMI14=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement184); 
					}
					break;
				case 8 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:31:7: controlFlow
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_controlFlow_in_statement193);
					controlFlow15=controlFlow();
					state._fsp--;

					adaptor.addChild(root_0, controlFlow15.getTree());

					}
					break;
				case 9 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:32:7: expr SEMI !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_statement201);
					expr16=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr16.getTree());

					SEMI17=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement203); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class qubitDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qubitDecl"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:36:1: qubitDecl : ( QUBIT ^ ID | REGISTER ^ ID LBRACK ! INT RBRACK !);
	public final QuantumParser.qubitDecl_return qubitDecl() throws RecognitionException {
		QuantumParser.qubitDecl_return retval = new QuantumParser.qubitDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token QUBIT18=null;
		Token ID19=null;
		Token REGISTER20=null;
		Token ID21=null;
		Token LBRACK22=null;
		Token INT23=null;
		Token RBRACK24=null;

		Object QUBIT18_tree=null;
		Object ID19_tree=null;
		Object REGISTER20_tree=null;
		Object ID21_tree=null;
		Object LBRACK22_tree=null;
		Object INT23_tree=null;
		Object RBRACK24_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:37:5: ( QUBIT ^ ID | REGISTER ^ ID LBRACK ! INT RBRACK !)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==QUBIT) ) {
				alt3=1;
			}
			else if ( (LA3_0==REGISTER) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:37:7: QUBIT ^ ID
					{
					root_0 = (Object)adaptor.nil();


					QUBIT18=(Token)match(input,QUBIT,FOLLOW_QUBIT_in_qubitDecl222); 
					QUBIT18_tree = (Object)adaptor.create(QUBIT18);
					root_0 = (Object)adaptor.becomeRoot(QUBIT18_tree, root_0);

					ID19=(Token)match(input,ID,FOLLOW_ID_in_qubitDecl225); 
					ID19_tree = (Object)adaptor.create(ID19);
					adaptor.addChild(root_0, ID19_tree);

					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:38:7: REGISTER ^ ID LBRACK ! INT RBRACK !
					{
					root_0 = (Object)adaptor.nil();


					REGISTER20=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_qubitDecl264); 
					REGISTER20_tree = (Object)adaptor.create(REGISTER20);
					root_0 = (Object)adaptor.becomeRoot(REGISTER20_tree, root_0);

					ID21=(Token)match(input,ID,FOLLOW_ID_in_qubitDecl267); 
					ID21_tree = (Object)adaptor.create(ID21);
					adaptor.addChild(root_0, ID21_tree);

					LBRACK22=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_qubitDecl269); 
					INT23=(Token)match(input,INT,FOLLOW_INT_in_qubitDecl272); 
					INT23_tree = (Object)adaptor.create(INT23);
					adaptor.addChild(root_0, INT23_tree);

					RBRACK24=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_qubitDecl274); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qubitDecl"


	public static class bitDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitDecl"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:41:1: bitDecl : ( BIT ^ ID | REGISTER ^ ID LBRACK ! INT RBRACK !);
	public final QuantumParser.bitDecl_return bitDecl() throws RecognitionException {
		QuantumParser.bitDecl_return retval = new QuantumParser.bitDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BIT25=null;
		Token ID26=null;
		Token REGISTER27=null;
		Token ID28=null;
		Token LBRACK29=null;
		Token INT30=null;
		Token RBRACK31=null;

		Object BIT25_tree=null;
		Object ID26_tree=null;
		Object REGISTER27_tree=null;
		Object ID28_tree=null;
		Object LBRACK29_tree=null;
		Object INT30_tree=null;
		Object RBRACK31_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:42:5: ( BIT ^ ID | REGISTER ^ ID LBRACK ! INT RBRACK !)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==BIT) ) {
				alt4=1;
			}
			else if ( (LA4_0==REGISTER) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:42:7: BIT ^ ID
					{
					root_0 = (Object)adaptor.nil();


					BIT25=(Token)match(input,BIT,FOLLOW_BIT_in_bitDecl300); 
					BIT25_tree = (Object)adaptor.create(BIT25);
					root_0 = (Object)adaptor.becomeRoot(BIT25_tree, root_0);

					ID26=(Token)match(input,ID,FOLLOW_ID_in_bitDecl303); 
					ID26_tree = (Object)adaptor.create(ID26);
					adaptor.addChild(root_0, ID26_tree);

					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:43:7: REGISTER ^ ID LBRACK ! INT RBRACK !
					{
					root_0 = (Object)adaptor.nil();


					REGISTER27=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_bitDecl344); 
					REGISTER27_tree = (Object)adaptor.create(REGISTER27);
					root_0 = (Object)adaptor.becomeRoot(REGISTER27_tree, root_0);

					ID28=(Token)match(input,ID,FOLLOW_ID_in_bitDecl347); 
					ID28_tree = (Object)adaptor.create(ID28);
					adaptor.addChild(root_0, ID28_tree);

					LBRACK29=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_bitDecl349); 
					INT30=(Token)match(input,INT,FOLLOW_INT_in_bitDecl352); 
					INT30_tree = (Object)adaptor.create(INT30);
					adaptor.addChild(root_0, INT30_tree);

					RBRACK31=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_bitDecl354); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitDecl"


	public static class gateDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "gateDecl"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:47:1: gateDecl : GATE ^ ID LPAREN ! ( paramList )? RPAREN ! block ;
	public final QuantumParser.gateDecl_return gateDecl() throws RecognitionException {
		QuantumParser.gateDecl_return retval = new QuantumParser.gateDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GATE32=null;
		Token ID33=null;
		Token LPAREN34=null;
		Token RPAREN36=null;
		ParserRuleReturnScope paramList35 =null;
		ParserRuleReturnScope block37 =null;

		Object GATE32_tree=null;
		Object ID33_tree=null;
		Object LPAREN34_tree=null;
		Object RPAREN36_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:48:5: ( GATE ^ ID LPAREN ! ( paramList )? RPAREN ! block )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:48:7: GATE ^ ID LPAREN ! ( paramList )? RPAREN ! block
			{
			root_0 = (Object)adaptor.nil();


			GATE32=(Token)match(input,GATE,FOLLOW_GATE_in_gateDecl381); 
			GATE32_tree = (Object)adaptor.create(GATE32);
			root_0 = (Object)adaptor.becomeRoot(GATE32_tree, root_0);

			ID33=(Token)match(input,ID,FOLLOW_ID_in_gateDecl384); 
			ID33_tree = (Object)adaptor.create(ID33);
			adaptor.addChild(root_0, ID33_tree);

			LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_gateDecl386); 
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:48:24: ( paramList )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:48:24: paramList
					{
					pushFollow(FOLLOW_paramList_in_gateDecl389);
					paramList35=paramList();
					state._fsp--;

					adaptor.addChild(root_0, paramList35.getTree());

					}
					break;

			}

			RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_gateDecl392); 
			pushFollow(FOLLOW_block_in_gateDecl395);
			block37=block();
			state._fsp--;

			adaptor.addChild(root_0, block37.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "gateDecl"


	public static class funcDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funcDecl"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:51:1: funcDecl : FUNC ^ ID LPAREN ! ( paramList )? RPAREN ! block ;
	public final QuantumParser.funcDecl_return funcDecl() throws RecognitionException {
		QuantumParser.funcDecl_return retval = new QuantumParser.funcDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNC38=null;
		Token ID39=null;
		Token LPAREN40=null;
		Token RPAREN42=null;
		ParserRuleReturnScope paramList41 =null;
		ParserRuleReturnScope block43 =null;

		Object FUNC38_tree=null;
		Object ID39_tree=null;
		Object LPAREN40_tree=null;
		Object RPAREN42_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:52:5: ( FUNC ^ ID LPAREN ! ( paramList )? RPAREN ! block )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:52:7: FUNC ^ ID LPAREN ! ( paramList )? RPAREN ! block
			{
			root_0 = (Object)adaptor.nil();


			FUNC38=(Token)match(input,FUNC,FOLLOW_FUNC_in_funcDecl412); 
			FUNC38_tree = (Object)adaptor.create(FUNC38);
			root_0 = (Object)adaptor.becomeRoot(FUNC38_tree, root_0);

			ID39=(Token)match(input,ID,FOLLOW_ID_in_funcDecl415); 
			ID39_tree = (Object)adaptor.create(ID39);
			adaptor.addChild(root_0, ID39_tree);

			LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl417); 
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:52:24: ( paramList )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:52:24: paramList
					{
					pushFollow(FOLLOW_paramList_in_funcDecl420);
					paramList41=paramList();
					state._fsp--;

					adaptor.addChild(root_0, paramList41.getTree());

					}
					break;

			}

			RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl423); 
			pushFollow(FOLLOW_block_in_funcDecl426);
			block43=block();
			state._fsp--;

			adaptor.addChild(root_0, block43.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funcDecl"


	public static class paramList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:55:1: paramList : ID ( COMMA ! ID )* ;
	public final QuantumParser.paramList_return paramList() throws RecognitionException {
		QuantumParser.paramList_return retval = new QuantumParser.paramList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID44=null;
		Token COMMA45=null;
		Token ID46=null;

		Object ID44_tree=null;
		Object COMMA45_tree=null;
		Object ID46_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:56:5: ( ID ( COMMA ! ID )* )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:56:7: ID ( COMMA ! ID )*
			{
			root_0 = (Object)adaptor.nil();


			ID44=(Token)match(input,ID,FOLLOW_ID_in_paramList443); 
			ID44_tree = (Object)adaptor.create(ID44);
			adaptor.addChild(root_0, ID44_tree);

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:56:10: ( COMMA ! ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:56:11: COMMA ! ID
					{
					COMMA45=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList446); 
					ID46=(Token)match(input,ID,FOLLOW_ID_in_paramList449); 
					ID46_tree = (Object)adaptor.create(ID46);
					adaptor.addChild(root_0, ID46_tree);

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class gateApply_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "gateApply"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:60:1: gateApply : ( ( H | X | Y | Z | S | T ) ^ ID | ( RX | RY | RZ ) ^ LPAREN ! expr RPAREN ! ID | ( SWAP | ISWAP | CNOT ) ^ ID COMMA ! ID | ( CCX | CSWAP ) ^ ID COMMA ! ID COMMA ! ID | U1 ^ LPAREN ! expr RPAREN ! ID | U2 ^ LPAREN ! expr COMMA ! expr RPAREN ! ID | U3 ^ LPAREN ! expr COMMA ! expr COMMA ! expr RPAREN ! ID );
	public final QuantumParser.gateApply_return gateApply() throws RecognitionException {
		QuantumParser.gateApply_return retval = new QuantumParser.gateApply_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set47=null;
		Token ID48=null;
		Token set49=null;
		Token LPAREN50=null;
		Token RPAREN52=null;
		Token ID53=null;
		Token set54=null;
		Token ID55=null;
		Token COMMA56=null;
		Token ID57=null;
		Token set58=null;
		Token ID59=null;
		Token COMMA60=null;
		Token ID61=null;
		Token COMMA62=null;
		Token ID63=null;
		Token U164=null;
		Token LPAREN65=null;
		Token RPAREN67=null;
		Token ID68=null;
		Token U269=null;
		Token LPAREN70=null;
		Token COMMA72=null;
		Token RPAREN74=null;
		Token ID75=null;
		Token U376=null;
		Token LPAREN77=null;
		Token COMMA79=null;
		Token COMMA81=null;
		Token RPAREN83=null;
		Token ID84=null;
		ParserRuleReturnScope expr51 =null;
		ParserRuleReturnScope expr66 =null;
		ParserRuleReturnScope expr71 =null;
		ParserRuleReturnScope expr73 =null;
		ParserRuleReturnScope expr78 =null;
		ParserRuleReturnScope expr80 =null;
		ParserRuleReturnScope expr82 =null;

		Object set47_tree=null;
		Object ID48_tree=null;
		Object set49_tree=null;
		Object LPAREN50_tree=null;
		Object RPAREN52_tree=null;
		Object ID53_tree=null;
		Object set54_tree=null;
		Object ID55_tree=null;
		Object COMMA56_tree=null;
		Object ID57_tree=null;
		Object set58_tree=null;
		Object ID59_tree=null;
		Object COMMA60_tree=null;
		Object ID61_tree=null;
		Object COMMA62_tree=null;
		Object ID63_tree=null;
		Object U164_tree=null;
		Object LPAREN65_tree=null;
		Object RPAREN67_tree=null;
		Object ID68_tree=null;
		Object U269_tree=null;
		Object LPAREN70_tree=null;
		Object COMMA72_tree=null;
		Object RPAREN74_tree=null;
		Object ID75_tree=null;
		Object U376_tree=null;
		Object LPAREN77_tree=null;
		Object COMMA79_tree=null;
		Object COMMA81_tree=null;
		Object RPAREN83_tree=null;
		Object ID84_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:62:5: ( ( H | X | Y | Z | S | T ) ^ ID | ( RX | RY | RZ ) ^ LPAREN ! expr RPAREN ! ID | ( SWAP | ISWAP | CNOT ) ^ ID COMMA ! ID | ( CCX | CSWAP ) ^ ID COMMA ! ID COMMA ! ID | U1 ^ LPAREN ! expr RPAREN ! ID | U2 ^ LPAREN ! expr COMMA ! expr RPAREN ! ID | U3 ^ LPAREN ! expr COMMA ! expr COMMA ! expr RPAREN ! ID )
			int alt8=7;
			switch ( input.LA(1) ) {
			case H:
			case S:
			case T:
			case X:
			case Y:
			case Z:
				{
				alt8=1;
				}
				break;
			case RX:
			case RY:
			case RZ:
				{
				alt8=2;
				}
				break;
			case CNOT:
			case ISWAP:
			case SWAP:
				{
				alt8=3;
				}
				break;
			case CCX:
			case CSWAP:
				{
				alt8=4;
				}
				break;
			case U1:
				{
				alt8=5;
				}
				break;
			case U2:
				{
				alt8=6;
				}
				break;
			case U3:
				{
				alt8=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:62:7: ( H | X | Y | Z | S | T ) ^ ID
					{
					root_0 = (Object)adaptor.nil();


					set47=input.LT(1);
					set47=input.LT(1);
					if ( input.LA(1)==H||input.LA(1)==S||input.LA(1)==T||(input.LA(1) >= X && input.LA(1) <= Z) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set47), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ID48=(Token)match(input,ID,FOLLOW_ID_in_gateApply503); 
					ID48_tree = (Object)adaptor.create(ID48);
					adaptor.addChild(root_0, ID48_tree);

					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:65:7: ( RX | RY | RZ ) ^ LPAREN ! expr RPAREN ! ID
					{
					root_0 = (Object)adaptor.nil();


					set49=input.LT(1);
					set49=input.LT(1);
					if ( (input.LA(1) >= RX && input.LA(1) <= RZ) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set49), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_gateApply530); 
					pushFollow(FOLLOW_expr_in_gateApply533);
					expr51=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr51.getTree());

					RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_gateApply535); 
					ID53=(Token)match(input,ID,FOLLOW_ID_in_gateApply538); 
					ID53_tree = (Object)adaptor.create(ID53);
					adaptor.addChild(root_0, ID53_tree);

					}
					break;
				case 3 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:68:7: ( SWAP | ISWAP | CNOT ) ^ ID COMMA ! ID
					{
					root_0 = (Object)adaptor.nil();


					set54=input.LT(1);
					set54=input.LT(1);
					if ( input.LA(1)==CNOT||input.LA(1)==ISWAP||input.LA(1)==SWAP ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set54), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ID55=(Token)match(input,ID,FOLLOW_ID_in_gateApply565); 
					ID55_tree = (Object)adaptor.create(ID55);
					adaptor.addChild(root_0, ID55_tree);

					COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_gateApply567); 
					ID57=(Token)match(input,ID,FOLLOW_ID_in_gateApply570); 
					ID57_tree = (Object)adaptor.create(ID57);
					adaptor.addChild(root_0, ID57_tree);

					}
					break;
				case 4 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:71:7: ( CCX | CSWAP ) ^ ID COMMA ! ID COMMA ! ID
					{
					root_0 = (Object)adaptor.nil();


					set58=input.LT(1);
					set58=input.LT(1);
					if ( input.LA(1)==CCX||input.LA(1)==CSWAP ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set58), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ID59=(Token)match(input,ID,FOLLOW_ID_in_gateApply593); 
					ID59_tree = (Object)adaptor.create(ID59);
					adaptor.addChild(root_0, ID59_tree);

					COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_gateApply595); 
					ID61=(Token)match(input,ID,FOLLOW_ID_in_gateApply598); 
					ID61_tree = (Object)adaptor.create(ID61);
					adaptor.addChild(root_0, ID61_tree);

					COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_gateApply600); 
					ID63=(Token)match(input,ID,FOLLOW_ID_in_gateApply603); 
					ID63_tree = (Object)adaptor.create(ID63);
					adaptor.addChild(root_0, ID63_tree);

					}
					break;
				case 5 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:74:7: U1 ^ LPAREN ! expr RPAREN ! ID
					{
					root_0 = (Object)adaptor.nil();


					U164=(Token)match(input,U1,FOLLOW_U1_in_gateApply617); 
					U164_tree = (Object)adaptor.create(U164);
					root_0 = (Object)adaptor.becomeRoot(U164_tree, root_0);

					LPAREN65=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_gateApply620); 
					pushFollow(FOLLOW_expr_in_gateApply623);
					expr66=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr66.getTree());

					RPAREN67=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_gateApply625); 
					ID68=(Token)match(input,ID,FOLLOW_ID_in_gateApply628); 
					ID68_tree = (Object)adaptor.create(ID68);
					adaptor.addChild(root_0, ID68_tree);

					}
					break;
				case 6 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:75:7: U2 ^ LPAREN ! expr COMMA ! expr RPAREN ! ID
					{
					root_0 = (Object)adaptor.nil();


					U269=(Token)match(input,U2,FOLLOW_U2_in_gateApply636); 
					U269_tree = (Object)adaptor.create(U269);
					root_0 = (Object)adaptor.becomeRoot(U269_tree, root_0);

					LPAREN70=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_gateApply639); 
					pushFollow(FOLLOW_expr_in_gateApply642);
					expr71=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr71.getTree());

					COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_gateApply644); 
					pushFollow(FOLLOW_expr_in_gateApply647);
					expr73=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr73.getTree());

					RPAREN74=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_gateApply649); 
					ID75=(Token)match(input,ID,FOLLOW_ID_in_gateApply652); 
					ID75_tree = (Object)adaptor.create(ID75);
					adaptor.addChild(root_0, ID75_tree);

					}
					break;
				case 7 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:76:7: U3 ^ LPAREN ! expr COMMA ! expr COMMA ! expr RPAREN ! ID
					{
					root_0 = (Object)adaptor.nil();


					U376=(Token)match(input,U3,FOLLOW_U3_in_gateApply660); 
					U376_tree = (Object)adaptor.create(U376);
					root_0 = (Object)adaptor.becomeRoot(U376_tree, root_0);

					LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_gateApply663); 
					pushFollow(FOLLOW_expr_in_gateApply666);
					expr78=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr78.getTree());

					COMMA79=(Token)match(input,COMMA,FOLLOW_COMMA_in_gateApply668); 
					pushFollow(FOLLOW_expr_in_gateApply671);
					expr80=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr80.getTree());

					COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_gateApply673); 
					pushFollow(FOLLOW_expr_in_gateApply676);
					expr82=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr82.getTree());

					RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_gateApply678); 
					ID84=(Token)match(input,ID,FOLLOW_ID_in_gateApply681); 
					ID84_tree = (Object)adaptor.create(ID84);
					adaptor.addChild(root_0, ID84_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "gateApply"


	public static class measureStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "measureStmt"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:80:1: measureStmt : MEASURE ^ ID ARROW ! ID ;
	public final QuantumParser.measureStmt_return measureStmt() throws RecognitionException {
		QuantumParser.measureStmt_return retval = new QuantumParser.measureStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MEASURE85=null;
		Token ID86=null;
		Token ARROW87=null;
		Token ID88=null;

		Object MEASURE85_tree=null;
		Object ID86_tree=null;
		Object ARROW87_tree=null;
		Object ID88_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:81:5: ( MEASURE ^ ID ARROW ! ID )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:81:7: MEASURE ^ ID ARROW ! ID
			{
			root_0 = (Object)adaptor.nil();


			MEASURE85=(Token)match(input,MEASURE,FOLLOW_MEASURE_in_measureStmt699); 
			MEASURE85_tree = (Object)adaptor.create(MEASURE85);
			root_0 = (Object)adaptor.becomeRoot(MEASURE85_tree, root_0);

			ID86=(Token)match(input,ID,FOLLOW_ID_in_measureStmt702); 
			ID86_tree = (Object)adaptor.create(ID86);
			adaptor.addChild(root_0, ID86_tree);

			ARROW87=(Token)match(input,ARROW,FOLLOW_ARROW_in_measureStmt704); 
			ID88=(Token)match(input,ID,FOLLOW_ID_in_measureStmt707); 
			ID88_tree = (Object)adaptor.create(ID88);
			adaptor.addChild(root_0, ID88_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "measureStmt"


	public static class resetStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "resetStmt"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:84:1: resetStmt : RESET ^ ID ;
	public final QuantumParser.resetStmt_return resetStmt() throws RecognitionException {
		QuantumParser.resetStmt_return retval = new QuantumParser.resetStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RESET89=null;
		Token ID90=null;

		Object RESET89_tree=null;
		Object ID90_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:85:5: ( RESET ^ ID )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:85:7: RESET ^ ID
			{
			root_0 = (Object)adaptor.nil();


			RESET89=(Token)match(input,RESET,FOLLOW_RESET_in_resetStmt724); 
			RESET89_tree = (Object)adaptor.create(RESET89);
			root_0 = (Object)adaptor.becomeRoot(RESET89_tree, root_0);

			ID90=(Token)match(input,ID,FOLLOW_ID_in_resetStmt727); 
			ID90_tree = (Object)adaptor.create(ID90);
			adaptor.addChild(root_0, ID90_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "resetStmt"


	public static class controlFlow_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "controlFlow"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:89:1: controlFlow : ( ifStmt | whileStmt | forStmt | breakStmt | continueStmt );
	public final QuantumParser.controlFlow_return controlFlow() throws RecognitionException {
		QuantumParser.controlFlow_return retval = new QuantumParser.controlFlow_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifStmt91 =null;
		ParserRuleReturnScope whileStmt92 =null;
		ParserRuleReturnScope forStmt93 =null;
		ParserRuleReturnScope breakStmt94 =null;
		ParserRuleReturnScope continueStmt95 =null;


		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:90:5: ( ifStmt | whileStmt | forStmt | breakStmt | continueStmt )
			int alt9=5;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt9=1;
				}
				break;
			case WHILE:
				{
				alt9=2;
				}
				break;
			case FOR:
				{
				alt9=3;
				}
				break;
			case BREAK:
				{
				alt9=4;
				}
				break;
			case CONTINUE:
				{
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:90:7: ifStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStmt_in_controlFlow745);
					ifStmt91=ifStmt();
					state._fsp--;

					adaptor.addChild(root_0, ifStmt91.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:91:7: whileStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStmt_in_controlFlow753);
					whileStmt92=whileStmt();
					state._fsp--;

					adaptor.addChild(root_0, whileStmt92.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:92:7: forStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStmt_in_controlFlow761);
					forStmt93=forStmt();
					state._fsp--;

					adaptor.addChild(root_0, forStmt93.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:93:7: breakStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_breakStmt_in_controlFlow769);
					breakStmt94=breakStmt();
					state._fsp--;

					adaptor.addChild(root_0, breakStmt94.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:94:7: continueStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_continueStmt_in_controlFlow777);
					continueStmt95=continueStmt();
					state._fsp--;

					adaptor.addChild(root_0, continueStmt95.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "controlFlow"


	public static class ifStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStmt"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:97:1: ifStmt : IF ^ LPAREN ! expr RPAREN ! block ( ELSE ! block )? ;
	public final QuantumParser.ifStmt_return ifStmt() throws RecognitionException {
		QuantumParser.ifStmt_return retval = new QuantumParser.ifStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF96=null;
		Token LPAREN97=null;
		Token RPAREN99=null;
		Token ELSE101=null;
		ParserRuleReturnScope expr98 =null;
		ParserRuleReturnScope block100 =null;
		ParserRuleReturnScope block102 =null;

		Object IF96_tree=null;
		Object LPAREN97_tree=null;
		Object RPAREN99_tree=null;
		Object ELSE101_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:98:5: ( IF ^ LPAREN ! expr RPAREN ! block ( ELSE ! block )? )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:98:7: IF ^ LPAREN ! expr RPAREN ! block ( ELSE ! block )?
			{
			root_0 = (Object)adaptor.nil();


			IF96=(Token)match(input,IF,FOLLOW_IF_in_ifStmt794); 
			IF96_tree = (Object)adaptor.create(IF96);
			root_0 = (Object)adaptor.becomeRoot(IF96_tree, root_0);

			LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ifStmt797); 
			pushFollow(FOLLOW_expr_in_ifStmt800);
			expr98=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr98.getTree());

			RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ifStmt802); 
			pushFollow(FOLLOW_block_in_ifStmt805);
			block100=block();
			state._fsp--;

			adaptor.addChild(root_0, block100.getTree());

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:98:38: ( ELSE ! block )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ELSE) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:98:39: ELSE ! block
					{
					ELSE101=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStmt808); 
					pushFollow(FOLLOW_block_in_ifStmt811);
					block102=block();
					state._fsp--;

					adaptor.addChild(root_0, block102.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStmt"


	public static class whileStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStmt"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:101:1: whileStmt : WHILE ^ LPAREN ! expr RPAREN ! block ;
	public final QuantumParser.whileStmt_return whileStmt() throws RecognitionException {
		QuantumParser.whileStmt_return retval = new QuantumParser.whileStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE103=null;
		Token LPAREN104=null;
		Token RPAREN106=null;
		ParserRuleReturnScope expr105 =null;
		ParserRuleReturnScope block107 =null;

		Object WHILE103_tree=null;
		Object LPAREN104_tree=null;
		Object RPAREN106_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:102:5: ( WHILE ^ LPAREN ! expr RPAREN ! block )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:102:7: WHILE ^ LPAREN ! expr RPAREN ! block
			{
			root_0 = (Object)adaptor.nil();


			WHILE103=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStmt830); 
			WHILE103_tree = (Object)adaptor.create(WHILE103);
			root_0 = (Object)adaptor.becomeRoot(WHILE103_tree, root_0);

			LPAREN104=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileStmt833); 
			pushFollow(FOLLOW_expr_in_whileStmt836);
			expr105=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr105.getTree());

			RPAREN106=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileStmt838); 
			pushFollow(FOLLOW_block_in_whileStmt841);
			block107=block();
			state._fsp--;

			adaptor.addChild(root_0, block107.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStmt"


	public static class forStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forStmt"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:105:1: forStmt : FOR ^ LPAREN ! ( ( expr )? SEMI ! ( expr )? SEMI ! ( expr )? ) RPAREN ! block ;
	public final QuantumParser.forStmt_return forStmt() throws RecognitionException {
		QuantumParser.forStmt_return retval = new QuantumParser.forStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOR108=null;
		Token LPAREN109=null;
		Token SEMI111=null;
		Token SEMI113=null;
		Token RPAREN115=null;
		ParserRuleReturnScope expr110 =null;
		ParserRuleReturnScope expr112 =null;
		ParserRuleReturnScope expr114 =null;
		ParserRuleReturnScope block116 =null;

		Object FOR108_tree=null;
		Object LPAREN109_tree=null;
		Object SEMI111_tree=null;
		Object SEMI113_tree=null;
		Object RPAREN115_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:5: ( FOR ^ LPAREN ! ( ( expr )? SEMI ! ( expr )? SEMI ! ( expr )? ) RPAREN ! block )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:7: FOR ^ LPAREN ! ( ( expr )? SEMI ! ( expr )? SEMI ! ( expr )? ) RPAREN ! block
			{
			root_0 = (Object)adaptor.nil();


			FOR108=(Token)match(input,FOR,FOLLOW_FOR_in_forStmt858); 
			FOR108_tree = (Object)adaptor.create(FOR108);
			root_0 = (Object)adaptor.becomeRoot(FOR108_tree, root_0);

			LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forStmt861); 
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:20: ( ( expr )? SEMI ! ( expr )? SEMI ! ( expr )? )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:21: ( expr )? SEMI ! ( expr )? SEMI ! ( expr )?
			{
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:21: ( expr )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==CHAR||LA11_0==COS||(LA11_0 >= EULER && LA11_0 <= EXP)||(LA11_0 >= FALSE && LA11_0 <= FLOAT)||LA11_0==ID||LA11_0==INT||(LA11_0 >= LOG && LA11_0 <= LPAREN)||LA11_0==NOT||LA11_0==ONE||LA11_0==PI||(LA11_0 >= SIN && LA11_0 <= SQRT)||LA11_0==STRING||LA11_0==TAN||LA11_0==TRUE||LA11_0==ZERO) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:21: expr
					{
					pushFollow(FOLLOW_expr_in_forStmt865);
					expr110=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr110.getTree());

					}
					break;

			}

			SEMI111=(Token)match(input,SEMI,FOLLOW_SEMI_in_forStmt868); 
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:33: ( expr )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==CHAR||LA12_0==COS||(LA12_0 >= EULER && LA12_0 <= EXP)||(LA12_0 >= FALSE && LA12_0 <= FLOAT)||LA12_0==ID||LA12_0==INT||(LA12_0 >= LOG && LA12_0 <= LPAREN)||LA12_0==NOT||LA12_0==ONE||LA12_0==PI||(LA12_0 >= SIN && LA12_0 <= SQRT)||LA12_0==STRING||LA12_0==TAN||LA12_0==TRUE||LA12_0==ZERO) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:33: expr
					{
					pushFollow(FOLLOW_expr_in_forStmt871);
					expr112=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr112.getTree());

					}
					break;

			}

			SEMI113=(Token)match(input,SEMI,FOLLOW_SEMI_in_forStmt874); 
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:45: ( expr )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==CHAR||LA13_0==COS||(LA13_0 >= EULER && LA13_0 <= EXP)||(LA13_0 >= FALSE && LA13_0 <= FLOAT)||LA13_0==ID||LA13_0==INT||(LA13_0 >= LOG && LA13_0 <= LPAREN)||LA13_0==NOT||LA13_0==ONE||LA13_0==PI||(LA13_0 >= SIN && LA13_0 <= SQRT)||LA13_0==STRING||LA13_0==TAN||LA13_0==TRUE||LA13_0==ZERO) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:106:45: expr
					{
					pushFollow(FOLLOW_expr_in_forStmt877);
					expr114=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr114.getTree());

					}
					break;

			}

			}

			RPAREN115=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStmt881); 
			pushFollow(FOLLOW_block_in_forStmt884);
			block116=block();
			state._fsp--;

			adaptor.addChild(root_0, block116.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forStmt"


	public static class breakStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "breakStmt"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:109:1: breakStmt : BREAK ^ SEMI !;
	public final QuantumParser.breakStmt_return breakStmt() throws RecognitionException {
		QuantumParser.breakStmt_return retval = new QuantumParser.breakStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BREAK117=null;
		Token SEMI118=null;

		Object BREAK117_tree=null;
		Object SEMI118_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:110:5: ( BREAK ^ SEMI !)
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:110:7: BREAK ^ SEMI !
			{
			root_0 = (Object)adaptor.nil();


			BREAK117=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt901); 
			BREAK117_tree = (Object)adaptor.create(BREAK117);
			root_0 = (Object)adaptor.becomeRoot(BREAK117_tree, root_0);

			SEMI118=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt904); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "breakStmt"


	public static class continueStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "continueStmt"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:113:1: continueStmt : CONTINUE ^ SEMI !;
	public final QuantumParser.continueStmt_return continueStmt() throws RecognitionException {
		QuantumParser.continueStmt_return retval = new QuantumParser.continueStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONTINUE119=null;
		Token SEMI120=null;

		Object CONTINUE119_tree=null;
		Object SEMI120_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:114:5: ( CONTINUE ^ SEMI !)
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:114:7: CONTINUE ^ SEMI !
			{
			root_0 = (Object)adaptor.nil();


			CONTINUE119=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt922); 
			CONTINUE119_tree = (Object)adaptor.create(CONTINUE119);
			root_0 = (Object)adaptor.becomeRoot(CONTINUE119_tree, root_0);

			SEMI120=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt925); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "continueStmt"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:118:1: block : LBRACE ! ( statement )* RBRACE !;
	public final QuantumParser.block_return block() throws RecognitionException {
		QuantumParser.block_return retval = new QuantumParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACE121=null;
		Token RBRACE123=null;
		ParserRuleReturnScope statement122 =null;

		Object LBRACE121_tree=null;
		Object RBRACE123_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:119:5: ( LBRACE ! ( statement )* RBRACE !)
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:119:7: LBRACE ! ( statement )* RBRACE !
			{
			root_0 = (Object)adaptor.nil();


			LBRACE121=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block944); 
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:119:15: ( statement )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= BIT && LA14_0 <= CNOT)||(LA14_0 >= CONTINUE && LA14_0 <= CSWAP)||(LA14_0 >= EULER && LA14_0 <= EXP)||(LA14_0 >= FALSE && LA14_0 <= FLOAT)||(LA14_0 >= FOR && LA14_0 <= GATE)||LA14_0==H||(LA14_0 >= ID && LA14_0 <= INT)||LA14_0==ISWAP||(LA14_0 >= LOG && LA14_0 <= LPAREN)||LA14_0==MEASURE||LA14_0==NOT||LA14_0==ONE||LA14_0==PI||LA14_0==QUBIT||(LA14_0 >= REGISTER && LA14_0 <= RESET)||(LA14_0 >= RX && LA14_0 <= S)||(LA14_0 >= SIN && LA14_0 <= SQRT)||(LA14_0 >= STRING && LA14_0 <= TAN)||(LA14_0 >= TRUE && LA14_0 <= U3)||LA14_0==WHILE||(LA14_0 >= X && LA14_0 <= ZERO)) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:119:15: statement
					{
					pushFollow(FOLLOW_statement_in_block947);
					statement122=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement122.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			RBRACE123=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block950); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:122:1: expr : assignExpr ;
	public final QuantumParser.expr_return expr() throws RecognitionException {
		QuantumParser.expr_return retval = new QuantumParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignExpr124 =null;


		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:123:5: ( assignExpr )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:123:7: assignExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignExpr_in_expr968);
			assignExpr124=assignExpr();
			state._fsp--;

			adaptor.addChild(root_0, assignExpr124.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class assignExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignExpr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:126:1: assignExpr : logicalOrExpr ( ASSIGN ^ assignExpr )? ;
	public final QuantumParser.assignExpr_return assignExpr() throws RecognitionException {
		QuantumParser.assignExpr_return retval = new QuantumParser.assignExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN126=null;
		ParserRuleReturnScope logicalOrExpr125 =null;
		ParserRuleReturnScope assignExpr127 =null;

		Object ASSIGN126_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:127:5: ( logicalOrExpr ( ASSIGN ^ assignExpr )? )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:127:7: logicalOrExpr ( ASSIGN ^ assignExpr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicalOrExpr_in_assignExpr985);
			logicalOrExpr125=logicalOrExpr();
			state._fsp--;

			adaptor.addChild(root_0, logicalOrExpr125.getTree());

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:127:21: ( ASSIGN ^ assignExpr )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ASSIGN) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:127:22: ASSIGN ^ assignExpr
					{
					ASSIGN126=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignExpr988); 
					ASSIGN126_tree = (Object)adaptor.create(ASSIGN126);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN126_tree, root_0);

					pushFollow(FOLLOW_assignExpr_in_assignExpr991);
					assignExpr127=assignExpr();
					state._fsp--;

					adaptor.addChild(root_0, assignExpr127.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignExpr"


	public static class logicalOrExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicalOrExpr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:130:1: logicalOrExpr : logicalAndExpr ( OR ^ logicalAndExpr )* ;
	public final QuantumParser.logicalOrExpr_return logicalOrExpr() throws RecognitionException {
		QuantumParser.logicalOrExpr_return retval = new QuantumParser.logicalOrExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR129=null;
		ParserRuleReturnScope logicalAndExpr128 =null;
		ParserRuleReturnScope logicalAndExpr130 =null;

		Object OR129_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:131:5: ( logicalAndExpr ( OR ^ logicalAndExpr )* )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:131:7: logicalAndExpr ( OR ^ logicalAndExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicalAndExpr_in_logicalOrExpr1010);
			logicalAndExpr128=logicalAndExpr();
			state._fsp--;

			adaptor.addChild(root_0, logicalAndExpr128.getTree());

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:131:22: ( OR ^ logicalAndExpr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==OR) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:131:23: OR ^ logicalAndExpr
					{
					OR129=(Token)match(input,OR,FOLLOW_OR_in_logicalOrExpr1013); 
					OR129_tree = (Object)adaptor.create(OR129);
					root_0 = (Object)adaptor.becomeRoot(OR129_tree, root_0);

					pushFollow(FOLLOW_logicalAndExpr_in_logicalOrExpr1016);
					logicalAndExpr130=logicalAndExpr();
					state._fsp--;

					adaptor.addChild(root_0, logicalAndExpr130.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalOrExpr"


	public static class logicalAndExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicalAndExpr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:134:1: logicalAndExpr : equalityExpr ( AND ^ equalityExpr )* ;
	public final QuantumParser.logicalAndExpr_return logicalAndExpr() throws RecognitionException {
		QuantumParser.logicalAndExpr_return retval = new QuantumParser.logicalAndExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND132=null;
		ParserRuleReturnScope equalityExpr131 =null;
		ParserRuleReturnScope equalityExpr133 =null;

		Object AND132_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:135:5: ( equalityExpr ( AND ^ equalityExpr )* )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:135:7: equalityExpr ( AND ^ equalityExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equalityExpr_in_logicalAndExpr1035);
			equalityExpr131=equalityExpr();
			state._fsp--;

			adaptor.addChild(root_0, equalityExpr131.getTree());

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:135:20: ( AND ^ equalityExpr )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==AND) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:135:21: AND ^ equalityExpr
					{
					AND132=(Token)match(input,AND,FOLLOW_AND_in_logicalAndExpr1038); 
					AND132_tree = (Object)adaptor.create(AND132);
					root_0 = (Object)adaptor.becomeRoot(AND132_tree, root_0);

					pushFollow(FOLLOW_equalityExpr_in_logicalAndExpr1041);
					equalityExpr133=equalityExpr();
					state._fsp--;

					adaptor.addChild(root_0, equalityExpr133.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalAndExpr"


	public static class equalityExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityExpr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:138:1: equalityExpr : relationalExpr ( ( EQ ^| NEQ ^) relationalExpr )* ;
	public final QuantumParser.equalityExpr_return equalityExpr() throws RecognitionException {
		QuantumParser.equalityExpr_return retval = new QuantumParser.equalityExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ135=null;
		Token NEQ136=null;
		ParserRuleReturnScope relationalExpr134 =null;
		ParserRuleReturnScope relationalExpr137 =null;

		Object EQ135_tree=null;
		Object NEQ136_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:139:5: ( relationalExpr ( ( EQ ^| NEQ ^) relationalExpr )* )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:139:7: relationalExpr ( ( EQ ^| NEQ ^) relationalExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relationalExpr_in_equalityExpr1060);
			relationalExpr134=relationalExpr();
			state._fsp--;

			adaptor.addChild(root_0, relationalExpr134.getTree());

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:139:22: ( ( EQ ^| NEQ ^) relationalExpr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==EQ||LA19_0==NEQ) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:139:23: ( EQ ^| NEQ ^) relationalExpr
					{
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:139:23: ( EQ ^| NEQ ^)
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EQ) ) {
						alt18=1;
					}
					else if ( (LA18_0==NEQ) ) {
						alt18=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:139:24: EQ ^
							{
							EQ135=(Token)match(input,EQ,FOLLOW_EQ_in_equalityExpr1064); 
							EQ135_tree = (Object)adaptor.create(EQ135);
							root_0 = (Object)adaptor.becomeRoot(EQ135_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:139:28: NEQ ^
							{
							NEQ136=(Token)match(input,NEQ,FOLLOW_NEQ_in_equalityExpr1067); 
							NEQ136_tree = (Object)adaptor.create(NEQ136);
							root_0 = (Object)adaptor.becomeRoot(NEQ136_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_relationalExpr_in_equalityExpr1071);
					relationalExpr137=relationalExpr();
					state._fsp--;

					adaptor.addChild(root_0, relationalExpr137.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equalityExpr"


	public static class relationalExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relationalExpr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:142:1: relationalExpr : addExpr ( ( LT ^| LE ^| GT ^| GE ^) addExpr )* ;
	public final QuantumParser.relationalExpr_return relationalExpr() throws RecognitionException {
		QuantumParser.relationalExpr_return retval = new QuantumParser.relationalExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT139=null;
		Token LE140=null;
		Token GT141=null;
		Token GE142=null;
		ParserRuleReturnScope addExpr138 =null;
		ParserRuleReturnScope addExpr143 =null;

		Object LT139_tree=null;
		Object LE140_tree=null;
		Object GT141_tree=null;
		Object GE142_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:143:5: ( addExpr ( ( LT ^| LE ^| GT ^| GE ^) addExpr )* )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:143:7: addExpr ( ( LT ^| LE ^| GT ^| GE ^) addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relationalExpr1090);
			addExpr138=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr138.getTree());

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:143:15: ( ( LT ^| LE ^| GT ^| GE ^) addExpr )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= GE && LA21_0 <= GT)||LA21_0==LE||LA21_0==LT) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:143:16: ( LT ^| LE ^| GT ^| GE ^) addExpr
					{
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:143:16: ( LT ^| LE ^| GT ^| GE ^)
					int alt20=4;
					switch ( input.LA(1) ) {
					case LT:
						{
						alt20=1;
						}
						break;
					case LE:
						{
						alt20=2;
						}
						break;
					case GT:
						{
						alt20=3;
						}
						break;
					case GE:
						{
						alt20=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}
					switch (alt20) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:143:17: LT ^
							{
							LT139=(Token)match(input,LT,FOLLOW_LT_in_relationalExpr1094); 
							LT139_tree = (Object)adaptor.create(LT139);
							root_0 = (Object)adaptor.becomeRoot(LT139_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:143:21: LE ^
							{
							LE140=(Token)match(input,LE,FOLLOW_LE_in_relationalExpr1097); 
							LE140_tree = (Object)adaptor.create(LE140);
							root_0 = (Object)adaptor.becomeRoot(LE140_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:143:25: GT ^
							{
							GT141=(Token)match(input,GT,FOLLOW_GT_in_relationalExpr1100); 
							GT141_tree = (Object)adaptor.create(GT141);
							root_0 = (Object)adaptor.becomeRoot(GT141_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:143:29: GE ^
							{
							GE142=(Token)match(input,GE,FOLLOW_GE_in_relationalExpr1103); 
							GE142_tree = (Object)adaptor.create(GE142);
							root_0 = (Object)adaptor.becomeRoot(GE142_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_addExpr_in_relationalExpr1107);
					addExpr143=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr143.getTree());

					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:146:1: addExpr : mulExpr ( ( PLUS ^| MINUS ^) mulExpr )* ;
	public final QuantumParser.addExpr_return addExpr() throws RecognitionException {
		QuantumParser.addExpr_return retval = new QuantumParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS145=null;
		Token MINUS146=null;
		ParserRuleReturnScope mulExpr144 =null;
		ParserRuleReturnScope mulExpr147 =null;

		Object PLUS145_tree=null;
		Object MINUS146_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:147:5: ( mulExpr ( ( PLUS ^| MINUS ^) mulExpr )* )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:147:7: mulExpr ( ( PLUS ^| MINUS ^) mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1126);
			mulExpr144=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr144.getTree());

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:147:15: ( ( PLUS ^| MINUS ^) mulExpr )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==MINUS||LA23_0==PLUS) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:147:16: ( PLUS ^| MINUS ^) mulExpr
					{
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:147:16: ( PLUS ^| MINUS ^)
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==PLUS) ) {
						alt22=1;
					}
					else if ( (LA22_0==MINUS) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:147:17: PLUS ^
							{
							PLUS145=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr1130); 
							PLUS145_tree = (Object)adaptor.create(PLUS145);
							root_0 = (Object)adaptor.becomeRoot(PLUS145_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:147:23: MINUS ^
							{
							MINUS146=(Token)match(input,MINUS,FOLLOW_MINUS_in_addExpr1133); 
							MINUS146_tree = (Object)adaptor.create(MINUS146);
							root_0 = (Object)adaptor.becomeRoot(MINUS146_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_mulExpr_in_addExpr1137);
					mulExpr147=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr147.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:150:1: mulExpr : powExpr ( ( TIMES ^| DIV ^| MOD ^) powExpr )* ;
	public final QuantumParser.mulExpr_return mulExpr() throws RecognitionException {
		QuantumParser.mulExpr_return retval = new QuantumParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES149=null;
		Token DIV150=null;
		Token MOD151=null;
		ParserRuleReturnScope powExpr148 =null;
		ParserRuleReturnScope powExpr152 =null;

		Object TIMES149_tree=null;
		Object DIV150_tree=null;
		Object MOD151_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:151:5: ( powExpr ( ( TIMES ^| DIV ^| MOD ^) powExpr )* )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:151:7: powExpr ( ( TIMES ^| DIV ^| MOD ^) powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1156);
			powExpr148=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr148.getTree());

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:151:15: ( ( TIMES ^| DIV ^| MOD ^) powExpr )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==DIV||LA25_0==MOD||LA25_0==TIMES) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:151:16: ( TIMES ^| DIV ^| MOD ^) powExpr
					{
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:151:16: ( TIMES ^| DIV ^| MOD ^)
					int alt24=3;
					switch ( input.LA(1) ) {
					case TIMES:
						{
						alt24=1;
						}
						break;
					case DIV:
						{
						alt24=2;
						}
						break;
					case MOD:
						{
						alt24=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:151:17: TIMES ^
							{
							TIMES149=(Token)match(input,TIMES,FOLLOW_TIMES_in_mulExpr1160); 
							TIMES149_tree = (Object)adaptor.create(TIMES149);
							root_0 = (Object)adaptor.becomeRoot(TIMES149_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:151:24: DIV ^
							{
							DIV150=(Token)match(input,DIV,FOLLOW_DIV_in_mulExpr1163); 
							DIV150_tree = (Object)adaptor.create(DIV150);
							root_0 = (Object)adaptor.becomeRoot(DIV150_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:151:29: MOD ^
							{
							MOD151=(Token)match(input,MOD,FOLLOW_MOD_in_mulExpr1166); 
							MOD151_tree = (Object)adaptor.create(MOD151);
							root_0 = (Object)adaptor.becomeRoot(MOD151_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_powExpr_in_mulExpr1170);
					powExpr152=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr152.getTree());

					}
					break;

				default :
					break loop25;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:154:1: powExpr : unaryExpr ( POW ^ unaryExpr )* ;
	public final QuantumParser.powExpr_return powExpr() throws RecognitionException {
		QuantumParser.powExpr_return retval = new QuantumParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token POW154=null;
		ParserRuleReturnScope unaryExpr153 =null;
		ParserRuleReturnScope unaryExpr155 =null;

		Object POW154_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:155:5: ( unaryExpr ( POW ^ unaryExpr )* )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:155:7: unaryExpr ( POW ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1189);
			unaryExpr153=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr153.getTree());

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:155:17: ( POW ^ unaryExpr )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==POW) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:155:18: POW ^ unaryExpr
					{
					POW154=(Token)match(input,POW,FOLLOW_POW_in_powExpr1192); 
					POW154_tree = (Object)adaptor.create(POW154);
					root_0 = (Object)adaptor.becomeRoot(POW154_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1195);
					unaryExpr155=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr155.getTree());

					}
					break;

				default :
					break loop26;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:158:1: unaryExpr : ( NOT ^ unaryExpr | primary );
	public final QuantumParser.unaryExpr_return unaryExpr() throws RecognitionException {
		QuantumParser.unaryExpr_return retval = new QuantumParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT156=null;
		ParserRuleReturnScope unaryExpr157 =null;
		ParserRuleReturnScope primary158 =null;

		Object NOT156_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:159:5: ( NOT ^ unaryExpr | primary )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==NOT) ) {
				alt27=1;
			}
			else if ( (LA27_0==CHAR||LA27_0==COS||(LA27_0 >= EULER && LA27_0 <= EXP)||(LA27_0 >= FALSE && LA27_0 <= FLOAT)||LA27_0==ID||LA27_0==INT||(LA27_0 >= LOG && LA27_0 <= LPAREN)||LA27_0==ONE||LA27_0==PI||(LA27_0 >= SIN && LA27_0 <= SQRT)||LA27_0==STRING||LA27_0==TAN||LA27_0==TRUE||LA27_0==ZERO) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:159:7: NOT ^ unaryExpr
					{
					root_0 = (Object)adaptor.nil();


					NOT156=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpr1214); 
					NOT156_tree = (Object)adaptor.create(NOT156);
					root_0 = (Object)adaptor.becomeRoot(NOT156_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_unaryExpr1217);
					unaryExpr157=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr157.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:160:7: primary
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryExpr1225);
					primary158=primary();
					state._fsp--;

					adaptor.addChild(root_0, primary158.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpr"


	public static class primary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:163:1: primary : ( LPAREN ! expr RPAREN !| functionCall | literal | ID );
	public final QuantumParser.primary_return primary() throws RecognitionException {
		QuantumParser.primary_return retval = new QuantumParser.primary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN159=null;
		Token RPAREN161=null;
		Token ID164=null;
		ParserRuleReturnScope expr160 =null;
		ParserRuleReturnScope functionCall162 =null;
		ParserRuleReturnScope literal163 =null;

		Object LPAREN159_tree=null;
		Object RPAREN161_tree=null;
		Object ID164_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:164:5: ( LPAREN ! expr RPAREN !| functionCall | literal | ID )
			int alt28=4;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt28=1;
				}
				break;
			case COS:
			case EXP:
			case LOG:
			case SIN:
			case SQRT:
			case TAN:
				{
				alt28=2;
				}
				break;
			case CHAR:
			case EULER:
			case FALSE:
			case FLOAT:
			case INT:
			case ONE:
			case PI:
			case STRING:
			case TRUE:
			case ZERO:
				{
				alt28=3;
				}
				break;
			case ID:
				{
				alt28=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:164:7: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN159=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary1242); 
					pushFollow(FOLLOW_expr_in_primary1245);
					expr160=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr160.getTree());

					RPAREN161=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary1247); 
					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:165:7: functionCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_primary1256);
					functionCall162=functionCall();
					state._fsp--;

					adaptor.addChild(root_0, functionCall162.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:166:7: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_primary1264);
					literal163=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal163.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:167:7: ID
					{
					root_0 = (Object)adaptor.nil();


					ID164=(Token)match(input,ID,FOLLOW_ID_in_primary1272); 
					ID164_tree = (Object)adaptor.create(ID164);
					adaptor.addChild(root_0, ID164_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:171:1: functionCall : ( SIN | COS | TAN | LOG | SQRT | EXP ) ^ LPAREN ! expr RPAREN !;
	public final QuantumParser.functionCall_return functionCall() throws RecognitionException {
		QuantumParser.functionCall_return retval = new QuantumParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set165=null;
		Token LPAREN166=null;
		Token RPAREN168=null;
		ParserRuleReturnScope expr167 =null;

		Object set165_tree=null;
		Object LPAREN166_tree=null;
		Object RPAREN168_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:172:5: ( ( SIN | COS | TAN | LOG | SQRT | EXP ) ^ LPAREN ! expr RPAREN !)
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:172:7: ( SIN | COS | TAN | LOG | SQRT | EXP ) ^ LPAREN ! expr RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set165=input.LT(1);
			set165=input.LT(1);
			if ( input.LA(1)==COS||input.LA(1)==EXP||input.LA(1)==LOG||(input.LA(1) >= SIN && input.LA(1) <= SQRT)||input.LA(1)==TAN ) {
				input.consume();
				root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set165), root_0);
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN166=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionCall1315); 
			pushFollow(FOLLOW_expr_in_functionCall1318);
			expr167=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr167.getTree());

			RPAREN168=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionCall1320); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:176:1: literal : ( INT | FLOAT | ZERO | ONE | TRUE | FALSE | PI | EULER | STRING | CHAR );
	public final QuantumParser.literal_return literal() throws RecognitionException {
		QuantumParser.literal_return retval = new QuantumParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set169=null;

		Object set169_tree=null;

		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:177:5: ( INT | FLOAT | ZERO | ONE | TRUE | FALSE | PI | EULER | STRING | CHAR )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set169=input.LT(1);
			if ( input.LA(1)==CHAR||input.LA(1)==EULER||(input.LA(1) >= FALSE && input.LA(1) <= FLOAT)||input.LA(1)==INT||input.LA(1)==ONE||input.LA(1)==PI||input.LA(1)==STRING||input.LA(1)==TRUE||input.LA(1)==ZERO ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set169));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program92 = new BitSet(new long[]{0xC95162E9DB01CF80L,0x0000000003D7BDBCL});
	public static final BitSet FOLLOW_EOF_in_program95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qubitDecl_in_statement122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_statement124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitDecl_in_statement133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_statement135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gateDecl_in_statement144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcDecl_in_statement152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gateApply_in_statement160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_statement162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_measureStmt_in_statement171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_statement173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_resetStmt_in_statement182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_statement184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_controlFlow_in_statement193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_statement203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUBIT_in_qubitDecl222 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_qubitDecl225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_qubitDecl264 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_qubitDecl267 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LBRACK_in_qubitDecl269 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_INT_in_qubitDecl272 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_qubitDecl274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_bitDecl300 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_bitDecl303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_bitDecl344 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_bitDecl347 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LBRACK_in_bitDecl349 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_INT_in_bitDecl352 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_bitDecl354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GATE_in_gateDecl381 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateDecl384 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_gateDecl386 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_paramList_in_gateDecl389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_gateDecl392 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_block_in_gateDecl395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_in_funcDecl412 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_funcDecl415 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_funcDecl417 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_paramList_in_funcDecl420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_funcDecl423 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_block_in_funcDecl426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramList443 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_paramList446 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_paramList449 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_set_in_gateApply478 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_gateApply517 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_gateApply530 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_gateApply533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_gateApply535 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_gateApply552 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply565 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_gateApply567 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_gateApply584 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply593 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_gateApply595 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply598 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_gateApply600 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_U1_in_gateApply617 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_gateApply620 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_gateApply623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_gateApply625 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_U2_in_gateApply636 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_gateApply639 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_gateApply642 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_gateApply644 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_gateApply647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_gateApply649 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_U3_in_gateApply660 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_gateApply663 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_gateApply666 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_gateApply668 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_gateApply671 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_gateApply673 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_gateApply676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_gateApply678 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_gateApply681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEASURE_in_measureStmt699 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_measureStmt702 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARROW_in_measureStmt704 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_measureStmt707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESET_in_resetStmt724 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_ID_in_resetStmt727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStmt_in_controlFlow745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStmt_in_controlFlow753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStmt_in_controlFlow761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breakStmt_in_controlFlow769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continueStmt_in_controlFlow777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStmt794 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifStmt797 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_ifStmt800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_ifStmt802 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_block_in_ifStmt805 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ELSE_in_ifStmt808 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_block_in_ifStmt811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStmt830 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileStmt833 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_whileStmt836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_whileStmt838 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_block_in_whileStmt841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStmt858 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStmt861 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A5C0L});
	public static final BitSet FOLLOW_expr_in_forStmt865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_forStmt868 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A5C0L});
	public static final BitSet FOLLOW_expr_in_forStmt871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_forStmt874 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A582L});
	public static final BitSet FOLLOW_expr_in_forStmt877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_forStmt881 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_block_in_forStmt884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_breakStmt901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_breakStmt904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_continueStmt922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SEMI_in_continueStmt925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_block944 = new BitSet(new long[]{0xD95162E9DB01CF80L,0x0000000003D7BDBCL});
	public static final BitSet FOLLOW_statement_in_block947 = new BitSet(new long[]{0xD95162E9DB01CF80L,0x0000000003D7BDBCL});
	public static final BitSet FOLLOW_RBRACE_in_block950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExpr_in_expr968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOrExpr_in_assignExpr985 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ASSIGN_in_assignExpr988 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_assignExpr_in_assignExpr991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalAndExpr_in_logicalOrExpr1010 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_OR_in_logicalOrExpr1013 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_logicalAndExpr_in_logicalOrExpr1016 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_equalityExpr_in_logicalAndExpr1035 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_logicalAndExpr1038 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_equalityExpr_in_logicalAndExpr1041 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1060 = new BitSet(new long[]{0x0008000000400002L});
	public static final BitSet FOLLOW_EQ_in_equalityExpr1064 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_NEQ_in_equalityExpr1067 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1071 = new BitSet(new long[]{0x0008000000400002L});
	public static final BitSet FOLLOW_addExpr_in_relationalExpr1090 = new BitSet(new long[]{0x0000900600000002L});
	public static final BitSet FOLLOW_LT_in_relationalExpr1094 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_LE_in_relationalExpr1097 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_GT_in_relationalExpr1100 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_GE_in_relationalExpr1103 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_addExpr_in_relationalExpr1107 = new BitSet(new long[]{0x0000900600000002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1126 = new BitSet(new long[]{0x0202000000000002L});
	public static final BitSet FOLLOW_PLUS_in_addExpr1130 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_MINUS_in_addExpr1133 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1137 = new BitSet(new long[]{0x0202000000000002L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1156 = new BitSet(new long[]{0x0004000000100002L,0x0000000000004000L});
	public static final BitSet FOLLOW_TIMES_in_mulExpr1160 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_DIV_in_mulExpr1163 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_MOD_in_mulExpr1166 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1170 = new BitSet(new long[]{0x0004000000100002L,0x0000000000004000L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1189 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_POW_in_powExpr1192 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1195 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpr1214 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_unaryExpr_in_unaryExpr1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryExpr1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primary1242 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_primary1245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_primary1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_primary1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_primary1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_functionCall1290 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LPAREN_in_functionCall1315 = new BitSet(new long[]{0x015060A01B008400L,0x000000000200A580L});
	public static final BitSet FOLLOW_expr_in_functionCall1318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_functionCall1320 = new BitSet(new long[]{0x0000000000000002L});
}
