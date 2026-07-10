
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayController nums = new ArrayController();
		nums.display("All element: ");
		
		int[] new_nums = new int[nums.getSize()-1];
		
		int delete_index = 2;
		
		//copy data of the first part (index 0 -> 1)
		for (int i = 0; i < delete_index; i++ ) {
			new_nums[i] = nums.getNums()[i];
		}
		
		
		
	
		// copy data of the last part (index 3 -> the last element)
		for (int i = delete_index+1; i < nums.getSize(); i++ ) {
			new_nums[i-1] = nums.getNums()[i];
		}
		
		
		
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted index 2: ");

	}

}
