package springCoreAssignment7;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class spel {

	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'VAMSI'");
		String message =(String) ((Expression) exp).getValue();
		System.out.println(message);

	}

}