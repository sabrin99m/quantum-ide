// $ANTLR 3.5.1 C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g 2025-11-03 17:07:43

package com.example.quantum_ide_backend.controller;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class QuantumLexer extends Lexer {
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

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public QuantumLexer() {} 
	public QuantumLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public QuantumLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g"; }

	// $ANTLR start "QUBIT"
	public final void mQUBIT() throws RecognitionException {
		try {
			int _type = QUBIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:10:11: ( 'QUBIT' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:10:13: 'QUBIT'
			{
			match("QUBIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUBIT"

	// $ANTLR start "REGISTER"
	public final void mREGISTER() throws RecognitionException {
		try {
			int _type = REGISTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:11:11: ( 'REGISTER' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:11:13: 'REGISTER'
			{
			match("REGISTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REGISTER"

	// $ANTLR start "MEASURE"
	public final void mMEASURE() throws RecognitionException {
		try {
			int _type = MEASURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:12:11: ( 'MEASURE' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:12:13: 'MEASURE'
			{
			match("MEASURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEASURE"

	// $ANTLR start "RESET"
	public final void mRESET() throws RecognitionException {
		try {
			int _type = RESET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:13:11: ( 'RESET' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:13:13: 'RESET'
			{
			match("RESET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RESET"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			int _type = H;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:16:11: ( 'H' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:16:13: 'H'
			{
			match('H'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "H"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			int _type = X;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:17:11: ( 'X' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:17:13: 'X'
			{
			match('X'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			int _type = Y;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:18:11: ( 'Y' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:18:13: 'Y'
			{
			match('Y'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			int _type = Z;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:19:11: ( 'Z' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:19:13: 'Z'
			{
			match('Z'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z"

	// $ANTLR start "CNOT"
	public final void mCNOT() throws RecognitionException {
		try {
			int _type = CNOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:20:11: ( 'CNOT' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:20:13: 'CNOT'
			{
			match("CNOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CNOT"

	// $ANTLR start "CX"
	public final void mCX() throws RecognitionException {
		try {
			int _type = CX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:21:11: ( 'CX' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:21:13: 'CX'
			{
			match("CX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CX"

	// $ANTLR start "CY"
	public final void mCY() throws RecognitionException {
		try {
			int _type = CY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:22:11: ( 'CY' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:22:13: 'CY'
			{
			match("CY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CY"

	// $ANTLR start "CZ"
	public final void mCZ() throws RecognitionException {
		try {
			int _type = CZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:23:11: ( 'CZ' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:23:13: 'CZ'
			{
			match("CZ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CZ"

	// $ANTLR start "RX"
	public final void mRX() throws RecognitionException {
		try {
			int _type = RX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:24:11: ( 'RX' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:24:13: 'RX'
			{
			match("RX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RX"

	// $ANTLR start "RY"
	public final void mRY() throws RecognitionException {
		try {
			int _type = RY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:25:11: ( 'RY' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:25:13: 'RY'
			{
			match("RY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RY"

	// $ANTLR start "RZ"
	public final void mRZ() throws RecognitionException {
		try {
			int _type = RZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:26:11: ( 'RZ' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:26:13: 'RZ'
			{
			match("RZ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RZ"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			int _type = S;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:27:11: ( 'S' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:27:13: 'S'
			{
			match('S'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			int _type = T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:28:11: ( 'T' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:28:13: 'T'
			{
			match('T'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "SWAP"
	public final void mSWAP() throws RecognitionException {
		try {
			int _type = SWAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:29:11: ( 'SWAP' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:29:13: 'SWAP'
			{
			match("SWAP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWAP"

	// $ANTLR start "ISWAP"
	public final void mISWAP() throws RecognitionException {
		try {
			int _type = ISWAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:30:11: ( 'ISWAP' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:30:13: 'ISWAP'
			{
			match("ISWAP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISWAP"

	// $ANTLR start "CCX"
	public final void mCCX() throws RecognitionException {
		try {
			int _type = CCX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:31:11: ( 'CCX' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:31:13: 'CCX'
			{
			match("CCX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CCX"

	// $ANTLR start "CSWAP"
	public final void mCSWAP() throws RecognitionException {
		try {
			int _type = CSWAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:32:11: ( 'CSWAP' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:32:13: 'CSWAP'
			{
			match("CSWAP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CSWAP"

	// $ANTLR start "U1"
	public final void mU1() throws RecognitionException {
		try {
			int _type = U1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:33:11: ( 'U1' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:33:13: 'U1'
			{
			match("U1"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U1"

	// $ANTLR start "U2"
	public final void mU2() throws RecognitionException {
		try {
			int _type = U2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:34:11: ( 'U2' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:34:13: 'U2'
			{
			match("U2"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U2"

	// $ANTLR start "U3"
	public final void mU3() throws RecognitionException {
		try {
			int _type = U3;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:35:11: ( 'U3' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:35:13: 'U3'
			{
			match("U3"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U3"

	// $ANTLR start "PI"
	public final void mPI() throws RecognitionException {
		try {
			int _type = PI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:38:11: ( 'PI' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:38:13: 'PI'
			{
			match("PI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PI"

	// $ANTLR start "EULER"
	public final void mEULER() throws RecognitionException {
		try {
			int _type = EULER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:39:11: ( 'E' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:39:13: 'E'
			{
			match('E'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EULER"

	// $ANTLR start "SQRT2"
	public final void mSQRT2() throws RecognitionException {
		try {
			int _type = SQRT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:40:11: ( 'SQRT2' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:40:13: 'SQRT2'
			{
			match("SQRT2"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQRT2"

	// $ANTLR start "ZERO"
	public final void mZERO() throws RecognitionException {
		try {
			int _type = ZERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:43:11: ( '0' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:43:13: '0'
			{
			match('0'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZERO"

	// $ANTLR start "ONE"
	public final void mONE() throws RecognitionException {
		try {
			int _type = ONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:44:11: ( '1' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:44:13: '1'
			{
			match('1'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ONE"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:47:11: ( '+' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:47:13: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:48:11: ( '-' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:48:13: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:49:11: ( '*' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:49:13: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMES"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:50:11: ( '/' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:50:13: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "POW"
	public final void mPOW() throws RecognitionException {
		try {
			int _type = POW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:51:11: ( '^' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:51:13: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POW"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:52:11: ( '%' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:52:13: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:55:11: ( '&&' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:55:13: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:56:11: ( '||' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:56:13: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:57:11: ( '!' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:57:13: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:58:11: ( '==' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:58:13: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:59:11: ( '!=' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:59:13: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:60:11: ( '<' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:60:13: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:61:11: ( '>' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:61:13: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:62:11: ( '<=' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:62:13: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:63:11: ( '>=' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:63:13: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:65:11: ( 'true' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:65:13: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:66:11: ( 'false' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:66:13: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "SIN"
	public final void mSIN() throws RecognitionException {
		try {
			int _type = SIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:69:11: ( 'sin' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:69:13: 'sin'
			{
			match("sin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIN"

	// $ANTLR start "COS"
	public final void mCOS() throws RecognitionException {
		try {
			int _type = COS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:70:11: ( 'cos' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:70:13: 'cos'
			{
			match("cos"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COS"

	// $ANTLR start "TAN"
	public final void mTAN() throws RecognitionException {
		try {
			int _type = TAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:71:11: ( 'tan' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:71:13: 'tan'
			{
			match("tan"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAN"

	// $ANTLR start "LOG"
	public final void mLOG() throws RecognitionException {
		try {
			int _type = LOG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:72:11: ( 'log' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:72:13: 'log'
			{
			match("log"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOG"

	// $ANTLR start "SQRT"
	public final void mSQRT() throws RecognitionException {
		try {
			int _type = SQRT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:73:11: ( 'sqrt' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:73:13: 'sqrt'
			{
			match("sqrt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQRT"

	// $ANTLR start "EXP"
	public final void mEXP() throws RecognitionException {
		try {
			int _type = EXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:74:11: ( 'exp' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:74:13: 'exp'
			{
			match("exp"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXP"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:77:11: ( 'if' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:77:13: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:78:11: ( 'else' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:78:13: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:79:11: ( 'while' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:79:13: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:80:11: ( 'for' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:80:13: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:81:11: ( 'return' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:81:13: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:82:11: ( 'break' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:82:13: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:83:11: ( 'continue' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:83:13: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "GATE"
	public final void mGATE() throws RecognitionException {
		try {
			int _type = GATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:86:11: ( 'gate' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:86:13: 'gate'
			{
			match("gate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GATE"

	// $ANTLR start "FUNC"
	public final void mFUNC() throws RecognitionException {
		try {
			int _type = FUNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:87:11: ( 'func' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:87:13: 'func'
			{
			match("func"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNC"

	// $ANTLR start "BIT"
	public final void mBIT() throws RecognitionException {
		try {
			int _type = BIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:88:11: ( 'BIT' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:88:13: 'BIT'
			{
			match("BIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT"

	// $ANTLR start "INTTYPE"
	public final void mINTTYPE() throws RecognitionException {
		try {
			int _type = INTTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:89:11: ( 'INT' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:89:13: 'INT'
			{
			match("INT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTTYPE"

	// $ANTLR start "FLOATTYPE"
	public final void mFLOATTYPE() throws RecognitionException {
		try {
			int _type = FLOATTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:90:11: ( 'FLOAT' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:90:13: 'FLOAT'
			{
			match("FLOAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATTYPE"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:93:11: ( ';' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:93:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:94:11: ( ',' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:94:13: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:95:11: ( '(' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:95:13: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:96:11: ( ')' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:96:13: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:97:11: ( '{' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:97:13: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:98:11: ( '}' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:98:13: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:99:11: ( '[' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:99:13: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:100:11: ( ']' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:100:13: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:101:11: ( '=' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:101:13: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "ARROW"
	public final void mARROW() throws RecognitionException {
		try {
			int _type = ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:102:11: ( '->' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:102:13: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARROW"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:105:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:105:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:105:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:108:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:108:7: ( '0' .. '9' )+
			{
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:108:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:111:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:111:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:111:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:111:25: ( '0' .. '9' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:111:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:111:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:112:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:112:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:112:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:112:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:113:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:113:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:118:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:118:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:118:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:118:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:118:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:119:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:119:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:119:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:123:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:123:7: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:126:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:126:10: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:126:14: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:126:16: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:126:26: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:127:8: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:127:10: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:127:15: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\\') ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:127:17: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:127:27: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:130:19: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:130:21: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:130:31: ( '+' | '-' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:130:42: ( '0' .. '9' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:131:20: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:133:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt18=1;
					}
					break;
				case 'u':
					{
					alt18=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt18=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:133:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:134:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:135:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:138:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				int LA19_1 = input.LA(2);
				if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
					int LA19_2 = input.LA(3);
					if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
						int LA19_4 = input.LA(4);
						if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
							alt19=1;
						}

						else {
							alt19=2;
						}

					}

					else {
						alt19=3;
					}

				}
				else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
					int LA19_3 = input.LA(3);
					if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
						alt19=2;
					}

					else {
						alt19=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:138:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:139:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:140:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:143:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:143:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:8: ( QUBIT | REGISTER | MEASURE | RESET | H | X | Y | Z | CNOT | CX | CY | CZ | RX | RY | RZ | S | T | SWAP | ISWAP | CCX | CSWAP | U1 | U2 | U3 | PI | EULER | SQRT2 | ZERO | ONE | PLUS | MINUS | TIMES | DIV | POW | MOD | AND | OR | NOT | EQ | NEQ | LT | GT | LE | GE | TRUE | FALSE | SIN | COS | TAN | LOG | SQRT | EXP | IF | ELSE | WHILE | FOR | RETURN | BREAK | CONTINUE | GATE | FUNC | BIT | INTTYPE | FLOATTYPE | SEMI | COMMA | LPAREN | RPAREN | LBRACE | RBRACE | LBRACK | RBRACK | ASSIGN | ARROW | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt20=81;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:10: QUBIT
				{
				mQUBIT(); 

				}
				break;
			case 2 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:16: REGISTER
				{
				mREGISTER(); 

				}
				break;
			case 3 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:25: MEASURE
				{
				mMEASURE(); 

				}
				break;
			case 4 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:33: RESET
				{
				mRESET(); 

				}
				break;
			case 5 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:39: H
				{
				mH(); 

				}
				break;
			case 6 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:41: X
				{
				mX(); 

				}
				break;
			case 7 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:43: Y
				{
				mY(); 

				}
				break;
			case 8 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:45: Z
				{
				mZ(); 

				}
				break;
			case 9 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:47: CNOT
				{
				mCNOT(); 

				}
				break;
			case 10 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:52: CX
				{
				mCX(); 

				}
				break;
			case 11 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:55: CY
				{
				mCY(); 

				}
				break;
			case 12 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:58: CZ
				{
				mCZ(); 

				}
				break;
			case 13 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:61: RX
				{
				mRX(); 

				}
				break;
			case 14 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:64: RY
				{
				mRY(); 

				}
				break;
			case 15 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:67: RZ
				{
				mRZ(); 

				}
				break;
			case 16 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:70: S
				{
				mS(); 

				}
				break;
			case 17 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:72: T
				{
				mT(); 

				}
				break;
			case 18 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:74: SWAP
				{
				mSWAP(); 

				}
				break;
			case 19 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:79: ISWAP
				{
				mISWAP(); 

				}
				break;
			case 20 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:85: CCX
				{
				mCCX(); 

				}
				break;
			case 21 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:89: CSWAP
				{
				mCSWAP(); 

				}
				break;
			case 22 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:95: U1
				{
				mU1(); 

				}
				break;
			case 23 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:98: U2
				{
				mU2(); 

				}
				break;
			case 24 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:101: U3
				{
				mU3(); 

				}
				break;
			case 25 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:104: PI
				{
				mPI(); 

				}
				break;
			case 26 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:107: EULER
				{
				mEULER(); 

				}
				break;
			case 27 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:113: SQRT2
				{
				mSQRT2(); 

				}
				break;
			case 28 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:119: ZERO
				{
				mZERO(); 

				}
				break;
			case 29 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:124: ONE
				{
				mONE(); 

				}
				break;
			case 30 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:128: PLUS
				{
				mPLUS(); 

				}
				break;
			case 31 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:133: MINUS
				{
				mMINUS(); 

				}
				break;
			case 32 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:139: TIMES
				{
				mTIMES(); 

				}
				break;
			case 33 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:145: DIV
				{
				mDIV(); 

				}
				break;
			case 34 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:149: POW
				{
				mPOW(); 

				}
				break;
			case 35 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:153: MOD
				{
				mMOD(); 

				}
				break;
			case 36 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:157: AND
				{
				mAND(); 

				}
				break;
			case 37 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:161: OR
				{
				mOR(); 

				}
				break;
			case 38 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:164: NOT
				{
				mNOT(); 

				}
				break;
			case 39 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:168: EQ
				{
				mEQ(); 

				}
				break;
			case 40 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:171: NEQ
				{
				mNEQ(); 

				}
				break;
			case 41 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:175: LT
				{
				mLT(); 

				}
				break;
			case 42 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:178: GT
				{
				mGT(); 

				}
				break;
			case 43 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:181: LE
				{
				mLE(); 

				}
				break;
			case 44 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:184: GE
				{
				mGE(); 

				}
				break;
			case 45 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:187: TRUE
				{
				mTRUE(); 

				}
				break;
			case 46 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:192: FALSE
				{
				mFALSE(); 

				}
				break;
			case 47 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:198: SIN
				{
				mSIN(); 

				}
				break;
			case 48 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:202: COS
				{
				mCOS(); 

				}
				break;
			case 49 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:206: TAN
				{
				mTAN(); 

				}
				break;
			case 50 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:210: LOG
				{
				mLOG(); 

				}
				break;
			case 51 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:214: SQRT
				{
				mSQRT(); 

				}
				break;
			case 52 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:219: EXP
				{
				mEXP(); 

				}
				break;
			case 53 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:223: IF
				{
				mIF(); 

				}
				break;
			case 54 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:226: ELSE
				{
				mELSE(); 

				}
				break;
			case 55 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:231: WHILE
				{
				mWHILE(); 

				}
				break;
			case 56 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:237: FOR
				{
				mFOR(); 

				}
				break;
			case 57 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:241: RETURN
				{
				mRETURN(); 

				}
				break;
			case 58 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:248: BREAK
				{
				mBREAK(); 

				}
				break;
			case 59 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:254: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 60 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:263: GATE
				{
				mGATE(); 

				}
				break;
			case 61 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:268: FUNC
				{
				mFUNC(); 

				}
				break;
			case 62 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:273: BIT
				{
				mBIT(); 

				}
				break;
			case 63 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:277: INTTYPE
				{
				mINTTYPE(); 

				}
				break;
			case 64 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:285: FLOATTYPE
				{
				mFLOATTYPE(); 

				}
				break;
			case 65 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:295: SEMI
				{
				mSEMI(); 

				}
				break;
			case 66 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:300: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 67 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:306: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 68 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:313: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 69 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:320: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 70 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:327: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 71 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:334: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 72 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:341: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 73 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:348: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 74 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:355: ARROW
				{
				mARROW(); 

				}
				break;
			case 75 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:361: ID
				{
				mID(); 

				}
				break;
			case 76 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:364: INT
				{
				mINT(); 

				}
				break;
			case 77 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:368: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 78 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:374: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 79 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:382: WS
				{
				mWS(); 

				}
				break;
			case 80 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:385: STRING
				{
				mSTRING(); 

				}
				break;
			case 81 :
				// C:\\Users\\megan\\workspace\\LFC\\src\\quantumCompilerPackage\\QuantumLexer.g:1:392: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "110:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA20_eotS =
		"\1\uffff\3\62\1\76\1\77\1\100\1\101\1\62\1\112\1\113\3\62\1\122\1\123"+
		"\1\124\1\uffff\1\126\1\uffff\1\130\4\uffff\1\132\1\134\1\136\1\140\15"+
		"\62\11\uffff\1\163\4\uffff\2\62\1\167\1\170\1\171\1\62\4\uffff\1\62\1"+
		"\174\1\175\1\176\4\62\2\uffff\2\62\1\u0085\1\u0086\1\u0087\1\u0088\17"+
		"\uffff\13\62\1\u0095\6\62\1\uffff\3\62\3\uffff\2\62\3\uffff\1\u00a1\4"+
		"\62\1\u00a6\4\uffff\1\62\1\u00a8\1\62\1\u00aa\1\62\1\u00ac\1\62\1\u00ae"+
		"\1\62\1\u00b0\1\u00b1\1\62\1\uffff\4\62\1\u00b7\5\62\1\u00bd\1\uffff\1"+
		"\62\1\u00bf\2\62\1\uffff\1\u00c2\1\uffff\1\62\1\uffff\1\u00c4\1\uffff"+
		"\1\u00c5\1\uffff\1\62\2\uffff\1\u00c7\3\62\1\u00cb\1\uffff\1\62\1\u00cd"+
		"\1\62\1\u00cf\1\62\1\uffff\1\u00d1\1\uffff\1\u00d2\1\u00d3\1\uffff\1\u00d4"+
		"\2\uffff\1\62\1\uffff\1\u00d6\1\62\1\u00d8\1\uffff\1\u00d9\1\uffff\1\62"+
		"\1\uffff\1\62\4\uffff\1\62\1\uffff\1\u00dd\2\uffff\1\62\1\u00df\1\62\1"+
		"\uffff\1\u00e1\1\uffff\1\u00e2\2\uffff";
	static final String DFA20_eofS =
		"\u00e3\uffff";
	static final String DFA20_minS =
		"\1\11\1\125\2\105\4\60\1\103\2\60\1\116\1\61\1\111\1\60\2\56\1\uffff\1"+
		"\76\1\uffff\1\52\4\uffff\4\75\2\141\1\151\2\157\1\154\1\146\1\150\1\145"+
		"\1\162\1\141\1\111\1\114\11\uffff\1\56\4\uffff\1\102\1\107\3\60\1\101"+
		"\4\uffff\1\117\3\60\1\130\1\127\1\101\1\122\2\uffff\1\127\1\124\4\60\17"+
		"\uffff\1\165\1\156\1\154\1\162\2\156\1\162\1\156\1\147\1\160\1\163\1\60"+
		"\1\151\1\164\1\145\1\164\1\124\1\117\1\uffff\2\111\1\105\3\uffff\1\123"+
		"\1\124\3\uffff\1\60\1\101\1\120\1\124\1\101\1\60\4\uffff\1\145\1\60\1"+
		"\163\1\60\1\143\1\60\1\164\1\60\1\164\2\60\1\145\1\uffff\1\154\1\165\1"+
		"\141\1\145\1\60\1\101\1\124\1\123\1\124\1\125\1\60\1\uffff\1\120\1\60"+
		"\1\62\1\120\1\uffff\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff\1\60\1\uffff"+
		"\1\151\2\uffff\1\60\1\145\1\162\1\153\1\60\1\uffff\1\124\1\60\1\124\1"+
		"\60\1\122\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60\2\uffff\1\156\1\uffff"+
		"\1\60\1\156\1\60\1\uffff\1\60\1\uffff\1\105\1\uffff\1\105\4\uffff\1\165"+
		"\1\uffff\1\60\2\uffff\1\122\1\60\1\145\1\uffff\1\60\1\uffff\1\60\2\uffff";
	static final String DFA20_maxS =
		"\1\175\1\125\1\132\1\105\4\172\1\132\2\172\1\123\1\63\1\111\1\172\2\145"+
		"\1\uffff\1\76\1\uffff\1\57\4\uffff\4\75\1\162\1\165\1\161\2\157\1\170"+
		"\1\146\1\150\1\145\1\162\1\141\1\111\1\114\11\uffff\1\145\4\uffff\1\102"+
		"\1\123\3\172\1\101\4\uffff\1\117\3\172\1\130\1\127\1\101\1\122\2\uffff"+
		"\1\127\1\124\4\172\17\uffff\1\165\1\156\1\154\1\162\2\156\1\162\1\163"+
		"\1\147\1\160\1\163\1\172\1\151\1\164\1\145\1\164\1\124\1\117\1\uffff\2"+
		"\111\1\105\3\uffff\1\123\1\124\3\uffff\1\172\1\101\1\120\1\124\1\101\1"+
		"\172\4\uffff\1\145\1\172\1\163\1\172\1\143\1\172\1\164\1\172\1\164\2\172"+
		"\1\145\1\uffff\1\154\1\165\1\141\1\145\1\172\1\101\1\124\1\123\1\124\1"+
		"\125\1\172\1\uffff\1\120\1\172\1\62\1\120\1\uffff\1\172\1\uffff\1\145"+
		"\1\uffff\1\172\1\uffff\1\172\1\uffff\1\151\2\uffff\1\172\1\145\1\162\1"+
		"\153\1\172\1\uffff\1\124\1\172\1\124\1\172\1\122\1\uffff\1\172\1\uffff"+
		"\2\172\1\uffff\1\172\2\uffff\1\156\1\uffff\1\172\1\156\1\172\1\uffff\1"+
		"\172\1\uffff\1\105\1\uffff\1\105\4\uffff\1\165\1\uffff\1\172\2\uffff\1"+
		"\122\1\172\1\145\1\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA20_acceptS =
		"\21\uffff\1\36\1\uffff\1\40\1\uffff\1\42\1\43\1\44\1\45\21\uffff\1\101"+
		"\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\113\1\uffff\1\115\1\117\1"+
		"\120\1\121\6\uffff\1\5\1\6\1\7\1\10\10\uffff\1\20\1\21\6\uffff\1\32\1"+
		"\34\1\35\1\112\1\37\1\116\1\41\1\50\1\46\1\47\1\111\1\53\1\51\1\54\1\52"+
		"\22\uffff\1\114\3\uffff\1\15\1\16\1\17\2\uffff\1\12\1\13\1\14\6\uffff"+
		"\1\26\1\27\1\30\1\31\14\uffff\1\65\13\uffff\1\24\4\uffff\1\77\1\uffff"+
		"\1\61\1\uffff\1\70\1\uffff\1\57\1\uffff\1\60\1\uffff\1\62\1\64\5\uffff"+
		"\1\76\5\uffff\1\11\1\uffff\1\22\2\uffff\1\55\1\uffff\1\75\1\63\1\uffff"+
		"\1\66\3\uffff\1\74\1\uffff\1\1\1\uffff\1\4\1\uffff\1\25\1\33\1\23\1\56"+
		"\1\uffff\1\67\1\uffff\1\72\1\100\3\uffff\1\71\1\uffff\1\3\1\uffff\1\2"+
		"\1\73";
	static final String DFA20_specialS =
		"\u00e3\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\65\2\uffff\1\65\22\uffff\1\65\1\31\1\66\2\uffff\1\26\1\27\1\67\1\54"+
			"\1\55\1\23\1\21\1\53\1\22\1\64\1\24\1\17\1\20\10\63\1\uffff\1\52\1\33"+
			"\1\32\1\34\2\uffff\1\62\1\50\1\10\1\62\1\16\1\51\1\62\1\4\1\13\3\62\1"+
			"\3\2\62\1\15\1\1\1\2\1\11\1\12\1\14\2\62\1\5\1\6\1\7\1\60\1\uffff\1\61"+
			"\1\25\1\62\1\uffff\1\62\1\46\1\40\1\62\1\42\1\36\1\47\1\62\1\43\2\62"+
			"\1\41\5\62\1\45\1\37\1\35\2\62\1\44\3\62\1\56\1\30\1\57",
			"\1\70",
			"\1\71\22\uffff\1\72\1\73\1\74",
			"\1\75",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\106\12\uffff\1\102\4\uffff\1\107\4\uffff\1\103\1\104\1\105",
			"\12\62\7\uffff\20\62\1\111\5\62\1\110\3\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\115\4\uffff\1\114",
			"\1\116\1\117\1\120",
			"\1\121",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\64\1\uffff\12\63\13\uffff\1\64\37\uffff\1\64",
			"\1\64\1\uffff\12\63\13\uffff\1\64\37\uffff\1\64",
			"",
			"\1\125",
			"",
			"\1\127\4\uffff\1\127",
			"",
			"",
			"",
			"",
			"\1\131",
			"\1\133",
			"\1\135",
			"\1\137",
			"\1\142\20\uffff\1\141",
			"\1\143\15\uffff\1\144\5\uffff\1\145",
			"\1\146\7\uffff\1\147",
			"\1\150",
			"\1\151",
			"\1\153\13\uffff\1\152",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\64\1\uffff\12\63\13\uffff\1\64\37\uffff\1\64",
			"",
			"",
			"",
			"",
			"\1\164",
			"\1\165\13\uffff\1\166",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\172",
			"",
			"",
			"",
			"",
			"\1\173",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"",
			"",
			"\1\u0083",
			"\1\u0084",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0091\4\uffff\1\u0090",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"",
			"",
			"",
			"\1\u009f",
			"\1\u00a0",
			"",
			"",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"",
			"",
			"\1\u00a7",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00a9",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00ab",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00ad",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00af",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00b2",
			"",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\u00be",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00c0",
			"\1\u00c1",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\u00c3",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\u00c6",
			"",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\u00cc",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00ce",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00d0",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"\1\u00d5",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00d7",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\u00da",
			"",
			"\1\u00db",
			"",
			"",
			"",
			"",
			"\1\u00dc",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"\1\u00de",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00e0",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( QUBIT | REGISTER | MEASURE | RESET | H | X | Y | Z | CNOT | CX | CY | CZ | RX | RY | RZ | S | T | SWAP | ISWAP | CCX | CSWAP | U1 | U2 | U3 | PI | EULER | SQRT2 | ZERO | ONE | PLUS | MINUS | TIMES | DIV | POW | MOD | AND | OR | NOT | EQ | NEQ | LT | GT | LE | GE | TRUE | FALSE | SIN | COS | TAN | LOG | SQRT | EXP | IF | ELSE | WHILE | FOR | RETURN | BREAK | CONTINUE | GATE | FUNC | BIT | INTTYPE | FLOATTYPE | SEMI | COMMA | LPAREN | RPAREN | LBRACE | RBRACE | LBRACK | RBRACK | ASSIGN | ARROW | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
