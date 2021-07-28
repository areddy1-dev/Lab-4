
public class Numbers {
       void nextLargest(int[] array) {     // nextLargest method created
		  int length = array.length;
		  int globalMin = Integer.MAX_VALUE;
		  int nextLargest = 0;
		  int minDiff = 0;

		for (int i = 0; i < length; i++) 
		{
		 for (int j = 0; j < length; j++) 
		 {
		  if (array[i] < array[j])
		  {
			minDiff = array[j] - array[i];
		  if (minDiff < globalMin)
		   {
			 globalMin = minDiff;
			nextLargest = array[j];
		   }
	     }
	   }
		 if (globalMin == Integer.MAX_VALUE) {
			System.out.println(array[i] + ": " + Integer.MAX_VALUE);
		} else {
				System.out.println(array[i] + ": " + nextLargest);
				globalMin = Integer.MAX_VALUE;
				}
		}
	  }
        public static void main(String[] args) {
	    int[] array = { 78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19 };
		Numbers num = new Numbers();
		num.nextLargest(array);
		}

   }