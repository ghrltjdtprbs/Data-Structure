package hw7_1;
import java.util.EmptyStackException;
import java.util.Stack;
class StackNode{
	int data;
	StackNode link;
}

class MyStack{
	private StackNode top;
	
	public boolean isEmpty() {
		return(top==null);
	}
	public void push(int item) {
		StackNode newNode = new StackNode();
		newNode.data=item;
		newNode.link=top;
		top=newNode;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			int item = top.data;
			top=top.link;
			return item;
		}
	}
}
class OptExp2{
	   private String exp;

	   public int evalPostfix(String postfix) {
	      MyStack P = new MyStack();

	      exp = postfix;
	      int opr1, opr2, value;
	      String[] testCh = exp.split(" ");
	      
	      for(int i = 0; i < testCh.length; i++) {
	         if (testCh[i].equals("*") == true || testCh[i].equals("/") == true) {
	            return 3;
	         }
	         else if(testCh[i].equals("+") == false && testCh[i].equals("-") == false) {
	            value = Integer.parseInt(testCh[i]);
	            P.push(value);
	         }
	         else {
	            if (P.isEmpty()) {
	               return 2;
	            } 
	            opr2 = P.pop();
	            if (P.isEmpty()) {
	               return 2;
	            }
	            opr1 = P.pop();
	               
	            if(testCh[i].equals("+")) {
	               P.push(opr1 + opr2);
	            }
	            else if(testCh[i].equals("-")) {
	               P.push(opr1 - opr2);
	            }
	         }
	      }
	      
	      int a = P.pop();
	      
	      if (P.isEmpty()) {
	         return a;
	      }
	      else {
	         return 1;
	      }
	   }
	}


 


public class MyStackTest {
	   public static void main(String[] args) {
	      System.out.println("hw7_1 : 최혜미");
	      
	         MyStack S = new MyStack();
	         
	         for(int i = 0; i < 10; i++) {
	            S.push(i);
	         }
	         
	         while(!S.isEmpty())
	            System.out.print(S.pop()+" ");
	         System.out.println();
	         
	         OptExp2 opt= new OptExp2();
	         int result;
	         
	         String[] exp = new String[6];
	         exp[0] = "10 20 +";
	         exp[1] = "100 20 - 30 - 40 + 50 -";
	         exp[2] = "1 2 3 4 5 6 7 8 9 10 + + + + + + + + +";
	         exp[3] = "10 20 30 +";
	         exp[4] = "10 20 + -";
	         exp[5] = "10 20 *";
	         
	         for (int i = 0; i < 6; i++) {
	            System.out.printf("\n후위표기식 = %s", exp[i]);
	            result = opt.evalPostfix(exp[i]);
	            
	            if (result == 1) {
	               System.out.printf("\n잘못된 수식 : 피연산자가 남습니다.\n");
	            }
	            else if (result == 2) {
	               System.out.printf("\n잘못된 수식 : 피연산자가 모자랍니다.\n");
	            }
	            else if (result == 3) {
	               System.out.printf("\n잘못된 수식 : 정의되지 않은 연산자입니다.\n");
	            }
	            else {
	               System.out.printf("\n연산결과 = %d\n", result);
	            }
	         }
	   }
	}