import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of Queries ");
		int n = sc.nextInt();
		Stack<Integer> inputStack = new Stack<>();
		Stack<Integer> outputStack = new Stack<>();

		for (int i = 0; i < n; i++) {
			System.out.print("enter opertion ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("input into queue ");
				int num2 = sc.nextInt();
				inputStack.push(num2);
			} else if (num == 2) {
				if (outputStack.isEmpty()) {
					for (int j = 0; j < inputStack.size(); j++) {
						outputStack.push(inputStack.pop());
					}
					outputStack.pop();
				}
			} else if (num == 3) {
				for (int z = 0; z < outputStack.size(); z++) {
					System.out.print(outputStack.peek() + "\n");
				}
			}
		}

	}
	
	
//	Switch case approch ---------------------------------------------------------------------------------------------

	
	
	
	
	//	Stack<Integer> first = new Stack<>();
//    Stack<Integer> second = new Stack<>();
//    Scanner sc = new Scanner(System.in);
//    Integer n = sc.nextInt();
//    
//    for(int i = 0; i < n; i++) {
//        int num = sc.nextInt();
//        switch(num) {
//            case 1:
//            int a = sc.nextInt();
//            first.push(a);
//            break;
//            case 2:
//            case 3:
//            if(second.isEmpty()){   
//            while(!first.isEmpty()) {
//                second.push(first.pop());
//            }   
//            }
//            switch(num) {
//                case 2:
//                second.pop();
//                break;
//                case 3:
//                System.out.println(second.peek());
//                break;
//            }
//            break;
//        }
//    }

	
	

}
