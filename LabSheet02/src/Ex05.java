
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayController nums = new ArrayController();
		nums.display("All element: ");
		
		
		//copy data from nums -> by delete nums.getSize()-1]
		int[] new_nums = new int[nums.getSize()-1];
		

		for (int i =0; i < new_nums.length; i++) {
		new_nums[i] = nums.getNums()[i];
		}
		
		
		
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted last index: ");

	}

}
