
public class Box {
int size = 0;

public Box() {} // method with no parameters and void return type

public static void main(String[] args) {
       Box objBox = new Box();
              objBox.size = 5;
         objBox.printBox('c');  // character c instead of *
			}		
        public void printBox(char c) {
		    final int MAX_ROWS = 5;
			 for (int row = 1; row <= MAX_ROWS; row++)
			     {
				 for (int star = 1; star <= size; star++)
				 {
				  System.out.print(c);
					}
					System.out.println();
				}
			}
		
}


