
public class SortingNumbers {

	public static void main(String[] args) {

		int[] arraynum = { 5, 6, 7, 3, -2, 0, 1, 5 };

		for (int i = 0; i < arraynum.length; i++) {
			//System.out.println(arraynum[i]);

			for (int j = i + 1; j < arraynum.length; j++) {
				if (arraynum[i] < arraynum[j]) {
					int temp = arraynum[j];
					arraynum[j] = arraynum[i];
					 arraynum[i] = temp;

				}

			}

		}
		for (int i = 0; i < arraynum.length; i++) {

			System.out.println(arraynum[i]);

		}
	}
}

//// i = 7,6,7,,3,2,0
////   J = 6,3,7,2,0
////7>6
////6 SMALLEST IN 2ND INDEX LETS put smallest in tem vairable to put in 1st index by swapping 
////TEMP=SMALLEST
////smallest place 2 nd is empty 
////lets swap num1 i.e i to 2nd index j which is empty .
////and put that tem smalest valeu in arraynum[i]
//keep looping
//and it
//will sort
//each of
//everythime untill
//ascending comes
//front
