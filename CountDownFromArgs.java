public class CountDownFromArgs {
    public static void main(String[] args) {
	    try {
		    int maxCount = Integer.parseInt(args[0]);
			if (maxCount <= 0) {
				System.out.println("Please only positive integers!");
			} else {
				for (int i = maxCount; i >= 0; i--) {
					System.out.println(i);
				}
			}
	    } catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("No argument provided");
		} catch (NumberFormatException e2) {
		    System.out.println("Please only insert integers!");
		}
	}
}
